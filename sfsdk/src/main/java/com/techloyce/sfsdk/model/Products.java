package com.techloyce.sfsdk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.techloyce.sfsdk.Purchases;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Products {
    private String auth;

    /**
     * @return the auth
     */
    public String getAuth() {
        return auth;
    }

    /**
     * @param auth the auth to set
     */
    public void setAuth(String auth) {
        this.auth = auth;
    }
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("effectiveStartDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date effectiveStartDate;

    @JsonProperty("effectiveEndDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date effectiveEndDate;

    @JsonProperty("type")
    private String type;

    @JsonProperty("managerId") //missing in json response
    private String managerId;

    @JsonProperty("status")
    private String status;

    @JsonProperty("image")
    private String image;


    //mv_short_code


    @JsonProperty("createdAt")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date createdAt;

    @JsonProperty("updatedAt")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date updatedAt;

    @JsonProperty("createdBy") //missing in json response
    private String createdBy;

    @JsonProperty("updatedBy")//missing in json response
    private String updatedBy;

    @JsonProperty("assignedTo")//missing in json response
    private String assignedTo;

    @JsonProperty("dataSource")
    private String dataSource;

    @JsonProperty("price") //missing in json response
    private String price;


//	public List<Products> getAll(String response) throws JsonMappingException, JsonProcessingException {
//
//		ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.readValue(response, new TypeReference<>() {});
//
//    }
    /**
     * @return the assignedTo
     */
    public String getAssignedTo() {
        return assignedTo;
    }

    /**
     * @param assignedTo the assignedTo to set
     */
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    /**
     * @return the dataSource
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * @param dataSource the dataSource to set
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    // Constructors, getters, setters

    public Products() {
        // Default constructor
    }

    // Other constructors

    // Getters and setters for attributes

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Date getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(Date effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(Date effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public interface PlanListener {
        void onComplete(List<Plans> planList);
    }

    public void getPlan(PlanListener planListener){
        final String idValue = this.id;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {

            @Override
            public void run() {

                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://devtest.dev-techloyce.com/api/v1/products/"+idValue+"/link/plans")
                        .header("Authorization", Purchases.getInstance().getAuth())
                        .header("Content-Type", "application/json")
                        .get()
                        .build();

                try {
                    Response response = client.newCall(request).execute();

                    if (response.isSuccessful()) {
                        JSONObject jsonResponse = new JSONObject(response.body().string());
                        List<Plans> planList = PlanWrapper.getAll(jsonResponse.toString());
                        //Toast.makeText(context, productsList.get(0).getId(), Toast.LENGTH_SHORT).show();
                        planListener.onComplete(planList);
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
}