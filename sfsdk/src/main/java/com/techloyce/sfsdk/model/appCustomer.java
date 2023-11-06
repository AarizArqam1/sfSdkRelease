package com.techloyce.sfsdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class appCustomer {
    @JsonProperty("parent_id")
    String parent_id;
    @JsonProperty("phone_number")
    String phone_number;
    @JsonProperty("po_number")
    String po_number;
    @JsonProperty("legal_entity")
    String legal_entity;
    @JsonProperty("billing_cycle_day")
    String billing_cycle_day;
    @JsonProperty("notes")
    String notes;
    //"image": "",
    @JsonProperty("customer_number")
    String customer_number;
    @JsonProperty("terms")
    String terms;
    @JsonProperty("created_at")
    Date created_at;
    @JsonProperty("updated_at")
    Date updated_at;
    @JsonProperty("deleted_at")
    Date deleted_at;
    @JsonProperty("portal_pass")
    String portal_pass;
    @JsonProperty("portal_email")
    String portal_email;
    @JsonProperty("portal_is_enabled")
    int portal_is_enabled;
    @JsonProperty("last_successful_login")
    Date last_successful_login;
    @JsonProperty("last_failed_login")
    Date last_failed_login;
    @JsonProperty("tax_exempt")
    int tax_exempt;
    @JsonProperty("certificate_id")
    String certificate_id;
    @JsonProperty("certificate_type")
    String certificate_type;
    @JsonProperty("issuing_jurisdiction")
    String issuing_jurisdiction;
    @JsonProperty("entity_use_code")
    String entity_use_code;
    @JsonProperty("description")
    String description;
    @JsonProperty("tax_company")
    String tax_company;
    @JsonProperty("vat_id")
    String vat_id;
    @JsonProperty("last_activity")
    String last_activity;
    @JsonProperty("created_by")
    String created_by;
    @JsonProperty("updated_by")
    String updated_by;
    @JsonProperty("assigned_to")
    String assigned_to;
    @JsonProperty("assigned_group_id")
    String assigned_group_id;
    @JsonProperty("auto_charge")
    int auto_charge;
    @JsonProperty("balance")
    int balance;
    @JsonProperty("unapplied_amount")
    int unapplied_amount;
    @JsonProperty("billing_address_1")
    String billing_address_1;
    @JsonProperty("billing_address_2")
    String billing_address_2;
    @JsonProperty("billing_city")
    String billing_city;
    @JsonProperty("billing_state")
    String billing_state;
    @JsonProperty("billing_county")
    String billing_county;
    @JsonProperty("billing_postal_code")
    String billing_postal_code;
    @JsonProperty("billing_country")
    String billing_country;
    @JsonProperty("shipping_address_1")
    String shipping_address_1;
    @JsonProperty("shipping_address_2")
    String shipping_address_2;
    @JsonProperty("shipping_city")
    String shipping_city;
    @JsonProperty("shipping_state")
    String shipping_state;
    @JsonProperty("shipping_county")
    String shipping_county;

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPo_number() {
        return po_number;
    }

    public void setPo_number(String po_number) {
        this.po_number = po_number;
    }

    public String getLegal_entity() {
        return legal_entity;
    }

    public void setLegal_entity(String legal_entity) {
        this.legal_entity = legal_entity;
    }

    public String getBilling_cycle_day() {
        return billing_cycle_day;
    }

    public void setBilling_cycle_day(String billing_cycle_day) {
        this.billing_cycle_day = billing_cycle_day;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public appCustomer( ) {
    }
    @JsonProperty("type")
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public appCustomer(String parent_id, String phone_number, String po_number, String legal_entity, String billing_cycle_day, String notes, String customer_number, String terms, Date created_at, Date updated_at, Date deleted_at, String portal_pass, String portal_email, int portal_is_enabled, Date last_successful_login, Date last_failed_login, int tax_exempt, String certificate_id, String certificate_type, String issuing_jurisdiction, String entity_use_code, String description, String tax_company, String vat_id, String last_activity, String created_by, String updated_by, String assigned_to, String assigned_group_id, int auto_charge, int balance, int unapplied_amount, String billing_address_1, String billing_address_2, String billing_city, String billing_state, String billing_county, String billing_postal_code, String billing_country, String shipping_address_1, String shipping_address_2, String shipping_city, String shipping_state, String shipping_county, String shipping_postal_code, String shipping_country, String data_source, String id, String email, String name, String scf_project_m74, String scf_last_seen_app_version_tiq, String scf_country_l2o, String scf_total_spent_apn, String scf_last_seen_platform_version_dit, String scf_last_seen_sdk_version_3af, String scf_last_seen_locale_n1u, String scf_transfer_behavior_o1h, Date scf_user_since_sh1, Date scf_last_opened_31i) {
        this.parent_id = parent_id;
        this.phone_number = phone_number;
        this.po_number = po_number;
        this.legal_entity = legal_entity;
        this.billing_cycle_day = billing_cycle_day;
        this.notes = notes;
        this.customer_number = customer_number;
        this.terms = terms;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
        this.portal_pass = portal_pass;
        this.portal_email = portal_email;
        this.portal_is_enabled = portal_is_enabled;
        this.last_successful_login = last_successful_login;
        this.last_failed_login = last_failed_login;
        this.tax_exempt = tax_exempt;
        this.certificate_id = certificate_id;
        this.certificate_type = certificate_type;
        this.issuing_jurisdiction = issuing_jurisdiction;
        this.entity_use_code = entity_use_code;
        this.description = description;
        this.tax_company = tax_company;
        this.vat_id = vat_id;
        this.last_activity = last_activity;
        this.created_by = created_by;
        this.updated_by = updated_by;
        this.assigned_to = assigned_to;
        this.assigned_group_id = assigned_group_id;
        this.auto_charge = auto_charge;
        this.balance = balance;
        this.unapplied_amount = unapplied_amount;
        this.billing_address_1 = billing_address_1;
        this.billing_address_2 = billing_address_2;
        this.billing_city = billing_city;
        this.billing_state = billing_state;
        this.billing_county = billing_county;
        this.billing_postal_code = billing_postal_code;
        this.billing_country = billing_country;
        this.shipping_address_1 = shipping_address_1;
        this.shipping_address_2 = shipping_address_2;
        this.shipping_city = shipping_city;
        this.shipping_state = shipping_state;
        this.shipping_county = shipping_county;
        this.shipping_postal_code = shipping_postal_code;
        this.shipping_country = shipping_country;
        this.data_source = data_source;
        this.id = id;
        this.email = email;
        this.name = name;
        this.scf_project_m74 = scf_project_m74;
        this.scf_last_seen_app_version_tiq = scf_last_seen_app_version_tiq;
        this.scf_country_l2o = scf_country_l2o;
        this.scf_total_spent_apn = scf_total_spent_apn;
        this.scf_last_seen_platform_version_dit = scf_last_seen_platform_version_dit;
        this.scf_last_seen_sdk_version_3af = scf_last_seen_sdk_version_3af;
        this.scf_last_seen_locale_n1u = scf_last_seen_locale_n1u;
        this.scf_transfer_behavior_o1h = scf_transfer_behavior_o1h;
        this.scf_user_since_sh1 = scf_user_since_sh1;
        this.scf_last_opened_31i = scf_last_opened_31i;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getPortal_pass() {
        return portal_pass;
    }

    public void setPortal_pass(String portal_pass) {
        this.portal_pass = portal_pass;
    }

    public String getPortal_email() {
        return portal_email;
    }

    public void setPortal_email(String portal_email) {
        this.portal_email = portal_email;
    }

    public int getPortal_is_enabled() {
        return portal_is_enabled;
    }

    public void setPortal_is_enabled(int portal_is_enabled) {
        this.portal_is_enabled = portal_is_enabled;
    }

    public Date getLast_successful_login() {
        return last_successful_login;
    }

    public void setLast_successful_login(Date last_successful_login) {
        this.last_successful_login = last_successful_login;
    }

    public Date getLast_failed_login() {
        return last_failed_login;
    }

    public void setLast_failed_login(Date last_failed_login) {
        this.last_failed_login = last_failed_login;
    }

    public int getTax_exempt() {
        return tax_exempt;
    }

    public void setTax_exempt(int tax_exempt) {
        this.tax_exempt = tax_exempt;
    }

    public String getCertificate_id() {
        return certificate_id;
    }

    public void setCertificate_id(String certificate_id) {
        this.certificate_id = certificate_id;
    }

    public String getCertificate_type() {
        return certificate_type;
    }

    public void setCertificate_type(String certificate_type) {
        this.certificate_type = certificate_type;
    }

    public String getIssuing_jurisdiction() {
        return issuing_jurisdiction;
    }

    public void setIssuing_jurisdiction(String issuing_jurisdiction) {
        this.issuing_jurisdiction = issuing_jurisdiction;
    }

    public String getEntity_use_code() {
        return entity_use_code;
    }

    public void setEntity_use_code(String entity_use_code) {
        this.entity_use_code = entity_use_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTax_company() {
        return tax_company;
    }

    public void setTax_company(String tax_company) {
        this.tax_company = tax_company;
    }

    public String getVat_id() {
        return vat_id;
    }

    public void setVat_id(String vat_id) {
        this.vat_id = vat_id;
    }

    public String getLast_activity() {
        return last_activity;
    }

    public void setLast_activity(String last_activity) {
        this.last_activity = last_activity;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    public String getAssigned_group_id() {
        return assigned_group_id;
    }

    public void setAssigned_group_id(String assigned_group_id) {
        this.assigned_group_id = assigned_group_id;
    }

    public int getAuto_charge() {
        return auto_charge;
    }

    public void setAuto_charge(int auto_charge) {
        this.auto_charge = auto_charge;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getUnapplied_amount() {
        return unapplied_amount;
    }

    public void setUnapplied_amount(int unapplied_amount) {
        this.unapplied_amount = unapplied_amount;
    }

    public String getBilling_address_1() {
        return billing_address_1;
    }

    public void setBilling_address_1(String billing_address_1) {
        this.billing_address_1 = billing_address_1;
    }

    public String getBilling_address_2() {
        return billing_address_2;
    }

    public void setBilling_address_2(String billing_address_2) {
        this.billing_address_2 = billing_address_2;
    }

    public String getBilling_city() {
        return billing_city;
    }

    public void setBilling_city(String billing_city) {
        this.billing_city = billing_city;
    }

    public String getBilling_state() {
        return billing_state;
    }

    public void setBilling_state(String billing_state) {
        this.billing_state = billing_state;
    }

    public String getBilling_county() {
        return billing_county;
    }

    public void setBilling_county(String billing_county) {
        this.billing_county = billing_county;
    }

    public String getBilling_postal_code() {
        return billing_postal_code;
    }

    public void setBilling_postal_code(String billing_postal_code) {
        this.billing_postal_code = billing_postal_code;
    }

    public String getBilling_country() {
        return billing_country;
    }

    public void setBilling_country(String billing_country) {
        this.billing_country = billing_country;
    }

    public String getShipping_address_1() {
        return shipping_address_1;
    }

    public void setShipping_address_1(String shipping_address_1) {
        this.shipping_address_1 = shipping_address_1;
    }

    public String getShipping_address_2() {
        return shipping_address_2;
    }

    public void setShipping_address_2(String shipping_address_2) {
        this.shipping_address_2 = shipping_address_2;
    }

    public String getShipping_city() {
        return shipping_city;
    }

    public void setShipping_city(String shipping_city) {
        this.shipping_city = shipping_city;
    }

    public String getShipping_state() {
        return shipping_state;
    }

    public void setShipping_state(String shipping_state) {
        this.shipping_state = shipping_state;
    }

    public String getShipping_county() {
        return shipping_county;
    }

    public void setShipping_county(String shipping_county) {
        this.shipping_county = shipping_county;
    }

    public String getShipping_postal_code() {
        return shipping_postal_code;
    }

    public void setShipping_postal_code(String shipping_postal_code) {
        this.shipping_postal_code = shipping_postal_code;
    }

    public String getShipping_country() {
        return shipping_country;
    }

    public void setShipping_country(String shipping_country) {
        this.shipping_country = shipping_country;
    }

    public String getData_source() {
        return data_source;
    }

    public void setData_source(String data_source) {
        this.data_source = data_source;
    }

    @JsonProperty("shipping_postal_code")
    String shipping_postal_code;
    @JsonProperty("shipping_country")
    String shipping_country;
    @JsonProperty("data_source")
    String data_source;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonProperty("id")
    String id;
    @JsonProperty("email")
    String email;
    @JsonProperty("name")
    String name;
    @JsonProperty("scf_project_m74")
    String scf_project_m74;
    @JsonProperty("scf_last_seen_app_version_tiq")
    String scf_last_seen_app_version_tiq;
    @JsonProperty("scf_country_l2o")
    String scf_country_l2o;
    @JsonProperty("scf_total_spent_apn")
    String scf_total_spent_apn;
    @JsonProperty("scf_last_seen_platform_version_dit")
    String scf_last_seen_platform_version_dit;
    @JsonProperty("scf_last_seen_sdk_version_3af")
    String scf_last_seen_sdk_version_3af;
    @JsonProperty("scf_last_seen_locale_n1u")
    String scf_last_seen_locale_n1u;
    @JsonProperty("scf_transfer_behavior_o1h")
    String scf_transfer_behavior_o1h;
    @JsonProperty("scf_user_since_sh1")
    Date scf_user_since_sh1;
    @JsonProperty("scf_last_opened_31i")
    Date scf_last_opened_31i;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScf_project_m74() {
        return scf_project_m74;
    }

    public void setScf_project_m74(String scf_project_m74) {
        this.scf_project_m74 = scf_project_m74;
    }

    public String getScf_last_seen_app_version_tiq() {
        return scf_last_seen_app_version_tiq;
    }

    public void setScf_last_seen_app_version_tiq(String scf_last_seen_app_version_tiq) {
        this.scf_last_seen_app_version_tiq = scf_last_seen_app_version_tiq;
    }

    public String getScf_country_l2o() {
        return scf_country_l2o;
    }

    public void setScf_country_l2o(String scf_country_l2o) {
        this.scf_country_l2o = scf_country_l2o;
    }

    public String getScf_total_spent_apn() {
        return scf_total_spent_apn;
    }

    public void setScf_total_spent_apn(String scf_total_spent_apn) {
        this.scf_total_spent_apn = scf_total_spent_apn;
    }

    public String getScf_last_seen_platform_version_dit() {
        return scf_last_seen_platform_version_dit;
    }

    public void setScf_last_seen_platform_version_dit(String scf_last_seen_platform_version_dit) {
        this.scf_last_seen_platform_version_dit = scf_last_seen_platform_version_dit;
    }

    public String getScf_last_seen_sdk_version_3af() {
        return scf_last_seen_sdk_version_3af;
    }

    public void setScf_last_seen_sdk_version_3af(String scf_last_seen_sdk_version_3af) {
        this.scf_last_seen_sdk_version_3af = scf_last_seen_sdk_version_3af;
    }

    public String getScf_last_seen_locale_n1u() {
        return scf_last_seen_locale_n1u;
    }

    public void setScf_last_seen_locale_n1u(String scf_last_seen_locale_n1u) {
        this.scf_last_seen_locale_n1u = scf_last_seen_locale_n1u;
    }

    public String getScf_transfer_behavior_o1h() {
        return scf_transfer_behavior_o1h;
    }

    public void setScf_transfer_behavior_o1h(String scf_transfer_behavior_o1h) {
        this.scf_transfer_behavior_o1h = scf_transfer_behavior_o1h;
    }

    public Date getScf_user_since_sh1() {
        return scf_user_since_sh1;
    }

    public void setScf_user_since_sh1(Date scf_user_since_sh1) {
        this.scf_user_since_sh1 = scf_user_since_sh1;
    }

    public Date getScf_last_opened_31i() {
        return scf_last_opened_31i;
    }

    public void setScf_last_opened_31i(Date scf_last_opened_31i) {
        this.scf_last_opened_31i = scf_last_opened_31i;
    }
}