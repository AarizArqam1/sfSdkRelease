package com.techloyce.sfsdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class temp {
    @JsonProperty("type")
    String type;
    @JsonProperty("id")
    String id;
    @JsonProperty("attributes")
    appCustomer attribute;


    public appCustomer getAttribute() {
        return attribute;
    }
}