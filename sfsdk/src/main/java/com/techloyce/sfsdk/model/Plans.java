package com.techloyce.sfsdk.model;

import java.io.IOException;

import java.net.URI;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.techloyce.sfsdk.Purchases;

import org.json.JSONException;
import org.json.JSONObject;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Plans {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("effective_start_date")
    private String effectiveStartDate;

    @JsonProperty("effective_end_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date effectiveEndDate;

    @JsonProperty("status")
    private String status;

    @JsonProperty("created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date createdAt;

    @JsonProperty("updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date updatedAt;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("updated_by")
    private String updatedBy;

    @JsonProperty("assigned_to")
    private String assignedTo;

    @JsonProperty("data_source")
    private String dataSource;

    @JsonProperty("is_gift")
    private boolean isGift;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public Plans() {
    }

    // Parameterized constructor
    public Plans(String id, String name, String description, String effectiveStartDate,
                 Date effectiveEndDate, String status, Date createdAt, Date updatedAt,
                 String createdBy, String updatedBy, String assignedTo, String dataSource,
                 boolean isGift) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.effectiveStartDate = effectiveStartDate;
        this.effectiveEndDate = effectiveEndDate;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.assignedTo = assignedTo;
        this.dataSource = dataSource;
        this.isGift = isGift;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the effectiveStartDate
     */
    public String getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * @param effectiveStartDate the effectiveStartDate to set
     */
    public void setEffectiveStartDate(String effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    /**
     * @return the effectiveEndDate
     */
    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * @param effectiveEndDate the effectiveEndDate to set
     */
    public void setEffectiveEndDate(Date effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return the updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

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
     * @return the isGift
     */
    public boolean isGift() {
        return isGift;
    }

    /**
     * @param isGift the isGift to set
     */
    public void setGift(boolean isGift) {
        this.isGift = isGift;
    }
    public interface PlanPriceListener {
        void onComplete(List<planPrices> planPricesList);
    }

    public void getPlanPrice(PlanPriceListener planPriceListener) {////under progress
        final String idValue = this.id;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {

            @Override
            public void run() {

                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://devtest.dev-techloyce.com/api/v1/plans/" + idValue + "/link/plan_price")
                        .header("Authorization", Purchases.getInstance().getAuth())
                        .header("Content-Type", "application/json")
                        .get()
                        .build();

                try {
                    Response response = client.newCall(request).execute();

                    if (response.isSuccessful()) {
                        JSONObject jsonResponse = new JSONObject(response.body().string());
                        List<planPrices> planPriceList = planPriceWrapper.getAll(jsonResponse.toString());
                        planPriceListener.onComplete(planPriceList);
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
            }
        });


    }



    // Getters and setters for all fields
    // ...

    // Other methods
    // ...
}