package com.techloyce.sfsdk;

import android.app.Activity;
import android.content.Context;

import com.techloyce.sfsdk.model.Constants;
import com.techloyce.sfsdk.model.planPrices;

import java.util.List;
import java.util.concurrent.ExecutorService;



public class PurchasesConfiguration {
    private final Context context;
    private final String clientSecret;
    private final String clientID;
    private final String domain;
    private Store store;

    public String getDomain() {
        return domain;
    }

    public Context getContext() {
        return context;
    }
    //private final String apiKey;
    private boolean observerMode;
    //    public PurchasesConfiguration(Context c,String Key){
//        context=c;
//        apiKey=Key;
//        observerMode=false;
//    }
    public PurchasesConfiguration(Context c,String client_ID,String client_Secret,String domainName){
        context=c;
        clientSecret= client_Secret;
        clientID=client_ID;
        domain=domainName;
        observerMode=false;
        store=Store.APP_STORE;
    }

    public PurchasesConfiguration observerMode(Boolean check){
        observerMode=check;
        return this;
    }
    public boolean isObserverMode(){
        return observerMode;
    }
    public PurchasesConfiguration Build(){
        return this;
    }


    public String getClientSecret() {
        return clientSecret;
    }

    public String getClientID() {
        return clientID;
    }

}