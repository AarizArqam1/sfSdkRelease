package com.techloyce.sfsdk.model;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreProperties(ignoreUnknown = true)
public class planPriceWrapper {
    private List<planPrices> data;

    public List<planPrices> getData() {
        return data;
    }

    public void setData(List<planPrices> data) {
        this.data = data;
    }

    public static List<planPrices> getAll(String response)
            throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        planPriceWrapper wrapper = objectMapper.readValue(response, planPriceWrapper.class);
        return wrapper.getData();
    }

}