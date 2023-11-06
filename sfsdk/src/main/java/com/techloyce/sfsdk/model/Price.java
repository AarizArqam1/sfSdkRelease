package com.techloyce.sfsdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {

    @JsonProperty("USD")
    String USD;

    /**
     * @return the uSD
     */
    public String getUSD() {
        return USD;
    }

    /**
     * @param uSD the uSD to set
     */
    public void setUSD(String uSD) {
        USD = uSD;
    }

}