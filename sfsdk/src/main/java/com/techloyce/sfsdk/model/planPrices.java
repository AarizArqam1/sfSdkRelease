package com.techloyce.sfsdk.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class planPrices {
    @JsonProperty("id")
    private String id;

    @JsonProperty("plan_id")
    private String planId;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("name")
    private String name;

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
     * @return the planId
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * @param planId the planId to set
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
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
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the chargeModel
     */
    public String getChargeModel() {
        return chargeModel;
    }

    /**
     * @param chargeModel the chargeModel to set
     */
    public void setChargeModel(String chargeModel) {
        this.chargeModel = chargeModel;
    }

    /**
     * @return the accountingAccountCode
     */
    public String getAccountingAccountCode() {
        return accountingAccountCode;
    }

    /**
     * @param accountingAccountCode the accountingAccountCode to set
     */
    public void setAccountingAccountCode(String accountingAccountCode) {
        this.accountingAccountCode = accountingAccountCode;
    }

    /**
     * @return the listPrice
     */
    public Price getListPrice() {
        return listPrice;
    }

    /**
     * @param listPrice the listPrice to set
     */
    public void setListPrice(Price listPrice) {
        this.listPrice = listPrice;
    }

    /**
     * @return the listPriceBase
     */
    public String getListPriceBase() {
        return listPriceBase;
    }

    /**
     * @param listPriceBase the listPriceBase to set
     */
    public void setListPriceBase(String listPriceBase) {
        this.listPriceBase = listPriceBase;
    }

    /**
     * @return the uom
     */
    public String getUom() {
        return uom;
    }

    /**
     * @param uom the uom to set
     */
    public void setUom(String uom) {
        this.uom = uom;
    }

    /**
     * @return the includedUnits
     */
    public String getIncludedUnits() {
        return includedUnits;
    }

    /**
     * @param includedUnits the includedUnits to set
     */
    public void setIncludedUnits(String includedUnits) {
        this.includedUnits = includedUnits;
    }

    /**
     * @return the defaultQuantity
     */
    public String getDefaultQuantity() {
        return defaultQuantity;
    }

    /**
     * @param defaultQuantity the defaultQuantity to set
     */
    public void setDefaultQuantity(String defaultQuantity) {
        this.defaultQuantity = defaultQuantity;
    }

    /**
     * @return the triggerCondition
     */
    public String getTriggerCondition() {
        return triggerCondition;
    }

    /**
     * @param triggerCondition the triggerCondition to set
     */
    public void setTriggerCondition(String triggerCondition) {
        this.triggerCondition = triggerCondition;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the billingTiming
     */
    public String getBillingTiming() {
        return billingTiming;
    }

    /**
     * @param billingTiming the billingTiming to set
     */
    public void setBillingTiming(String billingTiming) {
        this.billingTiming = billingTiming;
    }

    /**
     * @return the billingPeriodAlignment
     */
    public String getBillingPeriodAlignment() {
        return billingPeriodAlignment;
    }

    /**
     * @param billingPeriodAlignment the billingPeriodAlignment to set
     */
    public void setBillingPeriodAlignment(String billingPeriodAlignment) {
        this.billingPeriodAlignment = billingPeriodAlignment;
    }

    /**
     * @return the usageRecordsRatingOption
     */
    public String getUsageRecordsRatingOption() {
        return usageRecordsRatingOption;
    }

    /**
     * @param usageRecordsRatingOption the usageRecordsRatingOption to set
     */
    public void setUsageRecordsRatingOption(String usageRecordsRatingOption) {
        this.usageRecordsRatingOption = usageRecordsRatingOption;
    }

    /**
     * @return the billingPeriodId
     */
    public String getBillingPeriodId() {
        return billingPeriodId;
    }

    /**
     * @param billingPeriodId the billingPeriodId to set
     */
    public void setBillingPeriodId(String billingPeriodId) {
        this.billingPeriodId = billingPeriodId;
    }

    /**
     * @return the billingPeriodMonthsWeeks
     */
    public String getBillingPeriodMonthsWeeks() {
        return billingPeriodMonthsWeeks;
    }

    /**
     * @param billingPeriodMonthsWeeks the billingPeriodMonthsWeeks to set
     */
    public void setBillingPeriodMonthsWeeks(String billingPeriodMonthsWeeks) {
        this.billingPeriodMonthsWeeks = billingPeriodMonthsWeeks;
    }

    /**
     * @return the billingMonthId
     */
    public String getBillingMonthId() {
        return billingMonthId;
    }

    /**
     * @param billingMonthId the billingMonthId to set
     */
    public void setBillingMonthId(String billingMonthId) {
        this.billingMonthId = billingMonthId;
    }

    /**
     * @return the billingDayTypeId
     */
    public String getBillingDayTypeId() {
        return billingDayTypeId;
    }

    /**
     * @param billingDayTypeId the billingDayTypeId to set
     */
    public void setBillingDayTypeId(String billingDayTypeId) {
        this.billingDayTypeId = billingDayTypeId;
    }

    /**
     * @return the billingWeekDayId
     */
    public String getBillingWeekDayId() {
        return billingWeekDayId;
    }

    /**
     * @param billingWeekDayId the billingWeekDayId to set
     */
    public void setBillingWeekDayId(String billingWeekDayId) {
        this.billingWeekDayId = billingWeekDayId;
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

    @JsonProperty("description")
    private String description;

    @JsonProperty("category")
    private String category;

    @JsonProperty("charge_model")
    private String chargeModel;

    @JsonProperty("accounting_account_code")
    private String accountingAccountCode;

    @JsonProperty("list_price")
    private Price listPrice;

    @JsonProperty("list_price_base")
    private String listPriceBase;

    @JsonProperty("uom")
    private String uom;

    @JsonProperty("included_units")
    private String includedUnits;

    @JsonProperty("default_quantity")
    private String defaultQuantity;

    @JsonProperty("trigger_condition")
    private String triggerCondition;

    @JsonProperty("end_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date endDate;

    @JsonProperty("billing_timming")
    private String billingTiming;

    @JsonProperty("billing_period_alignment")
    private String billingPeriodAlignment;

    @JsonProperty("usage_records_rating_option")
    private String usageRecordsRatingOption;

    @JsonProperty("billing_period_id")
    private String billingPeriodId;

    @JsonProperty("billing_period_months_weeks")
    private String billingPeriodMonthsWeeks;

    @JsonProperty("billing_month_id")
    private String billingMonthId;

    @JsonProperty("billing_day_type_id")
    private String billingDayTypeId;

    @JsonProperty("billing_week_day_id")
    private String billingWeekDayId;

    @JsonProperty("created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date createdAt;

    @JsonProperty("assigned_to")
    private String assignedTo;

    @JsonProperty("data_source")
    private String dataSource;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public planPrices() {
    }

    // Parameterized constructor
    public planPrices(String id, String planId, String productId, String name, String description,
                      String category, String chargeModel, String accountingAccountCode,
                      Price listPrice, String listPriceBase, String uom, String includedUnits,
                      String defaultQuantity, String triggerCondition, Date endDate,
                      String billingTiming, String billingPeriodAlignment,
                      String usageRecordsRatingOption, String billingPeriodId,
                      String billingPeriodMonthsWeeks, String billingMonthId,
                      String billingDayTypeId, String billingWeekDayId, Date createdAt,
                      String assignedTo, String dataSource) {
        this.id = id;
        this.planId = planId;
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.chargeModel = chargeModel;
        this.accountingAccountCode = accountingAccountCode;
        this.listPrice = listPrice;
        this.listPriceBase = listPriceBase;
        this.uom = uom;
        this.includedUnits = includedUnits;
        this.defaultQuantity = defaultQuantity;
        this.triggerCondition = triggerCondition;
        this.endDate = endDate;
        this.billingTiming = billingTiming;
        this.billingPeriodAlignment = billingPeriodAlignment;
        this.usageRecordsRatingOption = usageRecordsRatingOption;
        this.billingPeriodId = billingPeriodId;
        this.billingPeriodMonthsWeeks = billingPeriodMonthsWeeks;
        this.billingMonthId = billingMonthId;
        this.billingDayTypeId = billingDayTypeId;
        this.billingWeekDayId = billingWeekDayId;
        this.createdAt = createdAt;
        this.assignedTo = assignedTo;
        this.dataSource = dataSource;
    }

    // Getters and setters for all fields
    // ...

    // Other methods
    // ...
}