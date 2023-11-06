package com.techloyce.sfsdk.model;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsWrapper {

    private List<Products> data;

    public List<Products> getData() {
        return data;
    }

    public void setData(List<Products> data) {
        this.data = data;
    }

    public static List<Products> getAll(String response) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ProductsWrapper wrapper = objectMapper.readValue(response, ProductsWrapper.class);
        return wrapper.getData();
    }


}