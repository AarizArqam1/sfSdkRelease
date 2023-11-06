package com.techloyce.sfsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.techloyce.sfsdk.Purchases;
import com.techloyce.sfsdk.PurchasesConfiguration;
import com.techloyce.sfsdk.model.Constants;
import com.techloyce.sfsdk.model.Plans;
import com.techloyce.sfsdk.model.Products;
import com.techloyce.sfsdk.model.planPrices;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.text);
        pb = findViewById(R.id.PB);
        Map<String, String> attributes = new HashMap<String, String>();
        attributes.put("scf_name_ets", "Aariz");
        attributes.put("scf_phone_4yd", "03001234567");
        Purchases.getInstance().setAttributes(attributes);

        Purchases.getInstance().configure(new PurchasesConfiguration(this, "8df9e02f-d72c-4d21-a701-6d8bb6c7e67e", "3DfIjwzKYUlxYTSVMvOHa4U5WQa0r4q6zH9JX8tR","suleman.subscriptionflow.com").observerMode(true).Build(), new Purchases.PC() {
            @Override
            public void onComplete() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        pb.setVisibility(View.GONE);
                        tv.setVisibility(View.VISIBLE);
                        tv.setText("Neew Client Data send to Subscription Flow");
                    }
                });
            }
            @Override
            public void onAlready(String s) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        pb.setVisibility(View.GONE);
                        tv.setVisibility(View.VISIBLE);
                        tv.setText("Customer Already Exist");
                    }
                });

            }
        });
//        Purchases.getInstance()
//                .configure(Constants.client_id,
//                        Constants.client_secret,
//                new Purchases.AuthListener() {
//            @Override
//            public void onAuthComplete(String authToken) {
//                Purchases.getInstance().getProducts(new Purchases.ProductListener() {
//                    @Override
//                    public void onComplete(List<Products> productsList) {
//                        productsList.get(179).getPlan(new Products.PlanListener() {
//                            @Override
//                            public void onComplete(List<Plans> planList) {
//                                planList.get(0).getPlanPrice(new Plans.PlanPriceListener() {
//                                    @Override
//                                    public void onComplete(List<planPrices> planPricesList) {
//                                        runOnUiThread(new Runnable() {
//                                            @Override
//                                            public void run() {
//                                                tv.setText(productsList.get(179).getType());
//                                            }
//                                        });
//                                    }
//                                });
//                            }
//                        });
//                    }
//                });
//            }
//        });

    }

}