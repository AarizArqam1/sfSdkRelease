package com.techloyce.sfsdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class tempWrapper {
    private temp data;

    public temp getData() {
        return data;
    }

    public void setData(temp data) {
        this.data = data;
    }

    public static temp getAll(String response)
            throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        tempWrapper wrapper = objectMapper.readValue(response, tempWrapper.class);
        return wrapper.getData();
    }
}