package com.techloyce.sfsdk.model;


import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanWrapper {

    private List<Plans> data;

    public List<Plans> getData() {
        return data;
    }

    public void setData(List<Plans> data) {
        this.data = data;
    }

    public static List<Plans> getAll(String response) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        PlanWrapper wrapper = objectMapper.readValue(response, PlanWrapper.class);
        return wrapper.getData();
    }


}