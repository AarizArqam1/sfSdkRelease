package com.techloyce.sfsdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;


import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.techloyce.sfsdk.model.Plans;
import com.techloyce.sfsdk.model.Products;
import com.techloyce.sfsdk.model.ProductsWrapper;
import com.techloyce.sfsdk.model.appCustomer;
import com.techloyce.sfsdk.model.appCustomerWrapper;
import com.techloyce.sfsdk.model.sharedPreferenceConstants;
import com.techloyce.sfsdk.model.temp;
import com.techloyce.sfsdk.model.tempWrapper;

import org.json.JSONException;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import android.content.pm.PackageManager;
import android.os.Build;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

public class Purchases {
    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    String auth;

    Map<String,String> attributes;

    BillingClient billingClient;
    private static Purchases instance;

    private Purchases() {
        attributes=new HashMap<>();
    }

    public static synchronized Purchases getInstance() {
        if (instance == null) {
            instance = new Purchases();
        }
        return instance;
    }


    public interface AuthListener {
        void onAuthComplete(String authToken);
    }
    public interface ProductListener {
        void onComplete(List<Products> productsList);
    }
    public interface PC {
        void onComplete();
        void onAlready(String s);
    }

//    public void configure(String client_Id, String client_Secret,AuthListener authListener) {
//        String clientId = client_Id;
//        String clientSecret = client_Secret;
//
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                String tokenEndpoint = "https://devtest.dev-techloyce.com/oauth/token"; // Replace with your token endpoint URL
//
//                // Create Base64-encoded Authorization header value
//                String credentials = clientId + ":" + clientSecret;
//                String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));
//                String authorizationHeaderValue = "Basic " + encodedCredentials;
//
//                // Prepare request body
//                RequestBody requestBody = new FormBody.Builder()
//                        .add("grant_type", "client_credentials")
//                        .build();
//
//                // Create HTTP request
//                Request request = new Request.Builder()
//                        .url(tokenEndpoint)
//                        .header("Authorization", authorizationHeaderValue)
//                        .post(requestBody)
//                        .build();
//
//                // Create OkHttp client
//                OkHttpClient client = new OkHttpClient();
//
//                // Send HTTP request and handle response
//                try (Response response = client.newCall(request).execute()) {
//                    if (response.isSuccessful()) {
//                        JSONObject jsonResponse = new JSONObject(response.body().string());
//
//                        // Extract and store the access token
//                        String accessToken = jsonResponse.getString("access_token");
//                        String authHeader = "Bearer " + accessToken;
//                        auth=authHeader;
//                        authListener.onAuthComplete(authHeader);
//                    } else {
//                        System.out.println("Error Response Code: " + response.code());
//                        System.out.println("Error Response Body: " + response.body().string());
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });
//    }
//
//    public void configure(String client_Id, String client_Secret) {
//        String clientId = client_Id;
//        String clientSecret = client_Secret;
//
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                String tokenEndpoint = "https://suleman.subscriptionflow.com/oauth/token"; // Replace with your token endpoint URL
//
//                // Create Base64-encoded Authorization header value
//                String credentials = clientId + ":" + clientSecret;
//                String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));
//                String authorizationHeaderValue = "Basic " + encodedCredentials;
//
//                // Prepare request body
//                RequestBody requestBody = new FormBody.Builder()
//                        .add("grant_type", "client_credentials")
//                        .build();
//
//                // Create HTTP request
//                Request request = new Request.Builder()
//                        .url(tokenEndpoint)
//                        .header("Authorization", authorizationHeaderValue)
//                        .post(requestBody)
//                        .build();
//
//                // Create OkHttp client
//                OkHttpClient client = new OkHttpClient();
//
//                // Send HTTP request and handle response
//                try (Response response = client.newCall(request).execute()) {
//                    if (response.isSuccessful()) {
//                        JSONObject jsonResponse = new JSONObject(response.body().string());
//
//                        // Extract and store the access token
//                        String accessToken = jsonResponse.getString("access_token");
//                        String authHeader = "Bearer " + accessToken;
//                        auth=authHeader;
//                    } else {
//                        System.out.println("Error Response Code: " + response.code());
//                        System.out.println("Error Response Body: " + response.body().string());
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });
//    }

    public void configure(PurchasesConfiguration purchasesConfiguration,PC pc){
        if(purchasesConfiguration.isObserverMode()) {
            SharedPreferences sharedPreferences = purchasesConfiguration.getContext().getSharedPreferences(sharedPreferenceConstants.path, Context.MODE_PRIVATE);
            boolean check = sharedPreferences.getBoolean(sharedPreferenceConstants.isNewCustomer, false);
            String clientId = purchasesConfiguration.getClientID();
            String clientSecret = purchasesConfiguration.getClientSecret();
            String id = sharedPreferences.getString(sharedPreferenceConstants.USER_ID, "");
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    String tokenEndpoint = "https://"+purchasesConfiguration.getDomain()+"/oauth/token"; // Replace with your token endpoint URL

                    // Create Base64-encoded Authorization header value
                    String credentials = clientId + ":" + clientSecret;
                    String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));
                    String authorizationHeaderValue = "Basic " + encodedCredentials;

                    // Prepare request body
                    RequestBody requestBody = new FormBody.Builder()
                            .add("grant_type", "client_credentials")
                            .build();

                    // Create HTTP request
                    Request request = new Request.Builder()
                            .url(tokenEndpoint)
                            .header("Authorization", authorizationHeaderValue)
                            .post(requestBody)
                            .build();

                    // Create OkHttp client
                    OkHttpClient client = new OkHttpClient();

                    // Send HTTP request and handle response
                    try (Response response = client.newCall(request).execute()) {
                        if (response.isSuccessful()) {
                            JSONObject jsonResponse = new JSONObject(response.body().string());

                            // Extract and store the access token
                            String accessToken = jsonResponse.getString("access_token");
                            String authHeader = "Bearer " + accessToken;
                            auth = authHeader;

                        } else {
                            System.out.println("Error Response Code: " + response.code());
                            System.out.println("Error Response Body: " + response.body().string());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            });

            if (!check) {
                //enter new customer
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        String userId = UUID.randomUUID().toString();
                        String androidVersionName = Build.VERSION.RELEASE;
                        Date currentDate = new Date();
                        Locale defaultLocale = Locale.getDefault();

                        // Get the language and country codes
                        String languageCode = defaultLocale.getLanguage();
                        String countryCode = defaultLocale.getCountry();

                        Locale currentLocale = Locale.getDefault();

                        // Get the country name from the locale
                        String countryName = currentLocale.getDisplayCountry();

                        // Format as "en-US" or similar
                        String lastSeenLocale = languageCode + "-" + countryCode;
                        PackageInfo packageInfo = null;
                        String appVersion = "";
                        try {
                            packageInfo = purchasesConfiguration.getContext().getPackageManager().getPackageInfo(purchasesConfiguration.getContext().getPackageName(), 0);
                            appVersion = packageInfo.versionName;

                        } catch (PackageManager.NameNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                        ApplicationInfo applicationInfo = null;
                        try {
                            applicationInfo = purchasesConfiguration.getContext().getPackageManager().getApplicationInfo(purchasesConfiguration.getContext().getPackageName(), 0);

                        } catch (PackageManager.NameNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                        String appName = purchasesConfiguration.getContext().getPackageManager().getApplicationLabel(applicationInfo).toString();

                        // Get the application name (label) from ApplicationInfo

                        appCustomer customer = new appCustomer();// make a customer and set all the variables
                        customer.setEmail("Dummy@gmail.com");
                        customer.setName("Aariz");
                        customer.setId(userId);
                        customer.setScf_country_l2o(countryName);
                        customer.setScf_project_m74(packageInfo.packageName);
                        customer.setScf_last_seen_platform_version_dit(appName);
                        customer.setScf_user_since_sh1(currentDate);
                        customer.setScf_last_seen_app_version_tiq(appVersion);
                        customer.setScf_last_seen_locale_n1u(lastSeenLocale);
                        customer.setScf_last_opened_31i(currentDate);
                        customer.setScf_transfer_behavior_o1h("Undefined");
                        customer.setPhone_number("03001234567");
                        Gson gson = new Gson();
                        String jsonPayload = gson.toJson(customer);
                        try {
                            if(!attributeToJsonString().isEmpty()){
                                jsonPayload=jsonPayload.substring(0,jsonPayload.length()-1)+','+attributeToJsonString()+'}';

                            }
                        } catch (JsonProcessingException e) {
                            throw new RuntimeException(e);
                        }

                        // Set the content type to JSON
                        MediaType JSON = MediaType.parse("application/json; charset=utf-8");

                        // Create a RequestBody from the JSON string
                        RequestBody requestBody = RequestBody.create(JSON, jsonPayload);
                        String endpoint = "https://"+purchasesConfiguration.getDomain()+"/api/v1/customers"; // Replace with your token endpoint URL
                        OkHttpClient client = new OkHttpClient();
                        Request request = new Request.Builder()
                                .url(endpoint)
                                .header("Authorization", auth)
                                .header("Content-Type", "application/json")
                                .post(requestBody)//to complete
                                .build();

                        try {
                            Response response = client.newCall(request).execute();

                            if (response.code() == 200) {
                                SharedPreferences sharedPreferences = purchasesConfiguration.getContext().getSharedPreferences(sharedPreferenceConstants.path, Context.MODE_PRIVATE);
                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                editor.putBoolean(sharedPreferenceConstants.isNewCustomer, true);
                                editor.putString(sharedPreferenceConstants.USER_ID,userId );
                                editor.apply();
                                pc.onComplete();
                                // Handle the successful response here
                            } else {
                                // Handle error response here (non-200 status code)

                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                            // Handle exceptions here

                        }
                    }
                });

            } else {

                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        OkHttpClient client = new OkHttpClient();
                        String androidVersionName = Build.VERSION.RELEASE;
                        Date currentDate = new Date();
                        Locale defaultLocale = Locale.getDefault();

                        // Get the country name from the locale
                        String countryName = defaultLocale.getDisplayCountry();

                        // Get the language and country codes
                        String languageCode = defaultLocale.getLanguage();
                        String countryCode = defaultLocale.getCountry();

                        // Format as "en-US" or similar
                        String lastSeenLocale = languageCode + "-" + countryCode;
                        PackageInfo packageInfo = null;
                        String appVersion = "";
                        try {
                            packageInfo = purchasesConfiguration.getContext().getPackageManager().getPackageInfo(purchasesConfiguration.getContext().getPackageName(), 0);
                            appVersion = packageInfo.versionName;

                        } catch (PackageManager.NameNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                        Request request = new Request.Builder()
                                .url("https://"+purchasesConfiguration.getDomain()+"/api/v1/customers/"+id)
                                .header("Authorization", Purchases.getInstance().getAuth())
                                .get()
                                .build();

                        try {
                            Response response1 = client.newCall(request).execute();
                            if (response1.code()==200) {
                                OkHttpClient client1 = new OkHttpClient();
                                Date lastOpenDate = new Date();
                                String LastOpenDate=lastOpenDate.toString();
                                String B="";
                                if(attributeToJsonString().isEmpty()){
                                    B="{\n" +
                                            "\"scf_last_seen_app_version_tiq\":\""+appVersion+"\",\n" +
                                            "\"scf_last_seen_platform_version_dit\":\""+androidVersionName+"\",\n" +
                                            "\"scf_last_seen_sdk_version_3af\":\"\",\n" +
                                            "\"scf_last_seen_locale_n1u\":\""+lastSeenLocale+"\",\n" +
                                            "\"scf_last_opened_31i\":\""+LastOpenDate+"\"\n" +
                                            "}";

                                }else{
                                    B="{\n" +
                                            "\"scf_last_seen_app_version_tiq\":\""+appVersion+"\",\n" +
                                            "\"scf_last_seen_platform_version_dit\":\""+androidVersionName+"\",\n" +
                                            "\"scf_last_seen_sdk_version_3af\":\"\",\n" +
                                            "\"scf_last_seen_locale_n1u\":\""+lastSeenLocale+"\",\n" +
                                            "\"scf_last_opened_31i\":\""+LastOpenDate+"\",\n" +
                                            attributeToJsonString()+
                                            "}";
                                }

                                // Set the content type to JSON
                                MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                                RequestBody requestBody = RequestBody.create(JSON, B);
                                String endpoint = "https://"+purchasesConfiguration.getDomain()+"/api/v1/customers/"+id;//45a5f69f-1d28-42c7-bd48-fcc15d9547d4"; // Replace with your token endpoint URL
                                Request request1 = new Request.Builder()
                                        .url(endpoint)
                                        .header("Authorization", auth)
                                        .header("Content-Type", "application/json")
                                        .put(requestBody)//to complete
                                        .build();

                                Response response2 = client1.newCall(request1).execute();
                                if(response2.code()==200){
                                    pc.onAlready("Customer Already Exist");
                                }
                            }
                        } catch (JsonMappingException e) {
                            pc.onAlready(e.getMessage());
                            throw new RuntimeException(e);
                        } catch (JsonParseException e) {
                            pc.onAlready(e.getMessage());
                            throw new RuntimeException(e);
                        } catch (IOException e) {
                            pc.onAlready(e.getMessage());
                            throw new RuntimeException(e);
                        }

                    }
                });



            }
            executorService.shutdown();
        }
    }

    public void setAttributes(Map<String,String> _attributes){
        attributes=_attributes;

    }
    public String attributeToJsonString() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        // Convert the Map to a JSON string
        String jsonString = objectMapper.writeValueAsString(attributes);
        String trimmedJson = jsonString.substring(1, jsonString.length() - 1);
        return trimmedJson;
    }


    public void getProducts(ProductListener productListener) {

        //HttpClient client = HttpClient.newHttpClient();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {

                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://devtest.dev-techloyce.com/api/v1/products")
                        .header("Authorization", auth)
                        .header("Content-Type", "application/json")
                        .get()
                        .build();

                try {
                    Response response = client.newCall(request).execute();

                    if (response.isSuccessful()) {
                        JSONObject jsonResponse = new JSONObject(response.body().string());
                        List<Products> productsList = ProductsWrapper.getAll(jsonResponse.toString());
                        productListener.onComplete(productsList);
                        // Handle the successful response here
                    } else {
                        // Handle error response here (non-200 status code)

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    // Handle exceptions here

                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }});
    }
    public interface PurchaseCallback {
        void onCompleted();
        void onError();
    }
    public void makePurchase(Activity activity, Plans plans, PurchaseCallback purchaseCallback){ //pending due to assign of another task (Observer Mode)
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingSetupFinished(BillingResult billingResult) {
                ArrayList<QueryProductDetailsParams.Product> productList = new ArrayList<>();

                QueryProductDetailsParams.Product product = QueryProductDetailsParams.Product.newBuilder()
                        .setProductId(plans.getId())
                        .setProductType(BillingClient.ProductType.SUBS)
                        .build();

                productList.add(product);

                QueryProductDetailsParams params = QueryProductDetailsParams.newBuilder()
                        .setProductList(productList)
                        .build();
                billingClient.queryProductDetailsAsync(params, (billingResult1, productDetailsList) -> {
                    for(ProductDetails productDetails:productDetailsList){
                        String offerToken=productDetails.getSubscriptionOfferDetails()
                                .get(0).getOfferToken();
                        ArrayList<BillingFlowParams.ProductDetailsParams> productDetailsParamsList = new ArrayList<>();
                        BillingFlowParams.ProductDetailsParams productDetailsParams = BillingFlowParams.ProductDetailsParams.newBuilder()
                                .setProductDetails(productDetails)
                                .setOfferToken(offerToken)
                                .build();
                        productDetailsParamsList.add(productDetailsParams);

                        BillingFlowParams billingFlowParams= BillingFlowParams.newBuilder()
                                .setProductDetailsParamsList(productDetailsParamsList)
                                .build();
                        billingClient.launchBillingFlow(activity,billingFlowParams);
                        purchaseCallback.onCompleted();
                    }
                });
            }
            @Override
            public void onBillingServiceDisconnected() {
                // Try to restart the connection on the next request to
                // Google Play by calling the startConnection() method.
                purchaseCallback.onError();
            }
        });

    }

}