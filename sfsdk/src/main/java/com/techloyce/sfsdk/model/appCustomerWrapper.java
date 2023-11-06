package com.techloyce.sfsdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class appCustomerWrapper {
    private appCustomer data;

    public appCustomer getData() {
        return data;
    }

    public void setData(appCustomer data) {
        this.data = data;
    }

    public static appCustomer getAll(String response)
            throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        appCustomerWrapper wrapper = objectMapper.readValue(response, appCustomerWrapper.class);
        return wrapper.getData();
    }
}