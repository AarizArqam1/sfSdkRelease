package com.techloyce.sfsdk.model;

import java.util.Date;
import java.util.UUID;

public class Customer {
    String id;
    String parent_id;
    String email;
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    String name;
    String phone_number;
    String po_number;
    String legal_entity;
    String billing_cycle_day;
    String notes;
    //"image": "",
    String customer_number;
    String terms;
    Date created_at;
    Date updated_at;
    Date deleted_at;
    String portal_pass;
    String portal_email;
    int portal_is_enabled;
    Date last_successful_login;
    Date last_failed_login;
    int tax_exempt;
    String certificate_id;
    String certificate_type;
    String issuing_jurisdiction;
    String entity_use_code;
    String description;
    String tax_company;
    String vat_id;
    String last_activity;
    public Customer() {
        this.id = UUID.randomUUID().toString(); // Generate a random UUID
        this.parent_id = null;
        this.name = null;
        this.phone_number = null;
        this.po_number = null;
        this.legal_entity = null;
        this.billing_cycle_day = null;
        this.notes = null;
        this.customer_number = null;
        this.terms = null;
        this.created_at = null;
        this.updated_at = null;
        this.deleted_at = null;
        this.portal_pass = null;
        this.portal_email = null;
        this.portal_is_enabled = 0;
        this.last_successful_login = null;
        this.last_failed_login = null;
        this.tax_exempt = 0;
        this.certificate_id = null;
        this.certificate_type = null;
        this.issuing_jurisdiction = null;
        this.entity_use_code = null;
        this.description = null;
        this.tax_company = null;
        this.vat_id = null;
        this.last_activity = null;
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
     * @return the parent_id
     */
    public String getParent_id() {
        return parent_id;
    }
    /**
     * @param parent_id the parent_id to set
     */
    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
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
     * @return the phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }
    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    /**
     * @return the po_number
     */
    public String getPo_number() {
        return po_number;
    }
    /**
     * @param po_number the po_number to set
     */
    public void setPo_number(String po_number) {
        this.po_number = po_number;
    }
    /**
     * @return the legal_entity
     */
    public String getLegal_entity() {
        return legal_entity;
    }
    /**
     * @param legal_entity the legal_entity to set
     */
    public void setLegal_entity(String legal_entity) {
        this.legal_entity = legal_entity;
    }
    /**
     * @return the billing_cycle_day
     */
    public String getBilling_cycle_day() {
        return billing_cycle_day;
    }
    /**
     * @param billing_cycle_day the billing_cycle_day to set
     */
    public void setBilling_cycle_day(String billing_cycle_day) {
        this.billing_cycle_day = billing_cycle_day;
    }
    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }
    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    /**
     * @return the customer_number
     */
    public String getCustomer_number() {
        return customer_number;
    }
    /**
     * @param customer_number the customer_number to set
     */
    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }
    /**
     * @return the terms
     */
    public String getTerms() {
        return terms;
    }
    /**
     * @param terms the terms to set
     */
    public void setTerms(String terms) {
        this.terms = terms;
    }
    /**
     * @return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }
    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
    /**
     * @return the updated_at
     */
    public Date getUpdated_at() {
        return updated_at;
    }
    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    /**
     * @return the deleted_at
     */
    public Date getDeleted_at() {
        return deleted_at;
    }
    /**
     * @param deleted_at the deleted_at to set
     */
    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }
    /**
     * @return the portal_pass
     */
    public String getPortal_pass() {
        return portal_pass;
    }
    /**
     * @param portal_pass the portal_pass to set
     */
    public void setPortal_pass(String portal_pass) {
        this.portal_pass = portal_pass;
    }
    /**
     * @return the portal_email
     */
    public String getPortal_email() {
        return portal_email;
    }
    /**
     * @param portal_email the portal_email to set
     */
    public void setPortal_email(String portal_email) {
        this.portal_email = portal_email;
    }
    /**
     * @return the portal_is_enabled
     */
    public int getPortal_is_enabled() {
        return portal_is_enabled;
    }
    /**
     * @param portal_is_enabled the portal_is_enabled to set
     */
    public void setPortal_is_enabled(int portal_is_enabled) {
        this.portal_is_enabled = portal_is_enabled;
    }
    /**
     * @return the last_successful_login
     */
    public Date getLast_successful_login() {
        return last_successful_login;
    }
    /**
     * @param last_successful_login the last_successful_login to set
     */
    public void setLast_successful_login(Date last_successful_login) {
        this.last_successful_login = last_successful_login;
    }
    /**
     * @return the last_failed_login
     */
    public Date getLast_failed_login() {
        return last_failed_login;
    }
    /**
     * @param last_failed_login the last_failed_login to set
     */
    public void setLast_failed_login(Date last_failed_login) {
        this.last_failed_login = last_failed_login;
    }
    /**
     * @return the tax_exempt
     */
    public int getTax_exempt() {
        return tax_exempt;
    }
    /**
     * @param tax_exempt the tax_exempt to set
     */
    public void setTax_exempt(int tax_exempt) {
        this.tax_exempt = tax_exempt;
    }
    /**
     * @return the certificate_id
     */
    public String getCertificate_id() {
        return certificate_id;
    }
    /**
     * @param certificate_id the certificate_id to set
     */
    public void setCertificate_id(String certificate_id) {
        this.certificate_id = certificate_id;
    }
    /**
     * @return the certificate_type
     */
    public String getCertificate_type() {
        return certificate_type;
    }
    /**
     * @param certificate_type the certificate_type to set
     */
    public void setCertificate_type(String certificate_type) {
        this.certificate_type = certificate_type;
    }
    /**
     * @return the issuing_jurisdiction
     */
    public String getIssuing_jurisdiction() {
        return issuing_jurisdiction;
    }
    /**
     * @param issuing_jurisdiction the issuing_jurisdiction to set
     */
    public void setIssuing_jurisdiction(String issuing_jurisdiction) {
        this.issuing_jurisdiction = issuing_jurisdiction;
    }
    /**
     * @return the entity_use_code
     */
    public String getEntity_use_code() {
        return entity_use_code;
    }
    /**
     * @param entity_use_code the entity_use_code to set
     */
    public void setEntity_use_code(String entity_use_code) {
        this.entity_use_code = entity_use_code;
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
     * @return the tax_company
     */
    public String getTax_company() {
        return tax_company;
    }
    /**
     * @param tax_company the tax_company to set
     */
    public void setTax_company(String tax_company) {
        this.tax_company = tax_company;
    }
    /**
     * @return the vat_id
     */
    public String getVat_id() {
        return vat_id;
    }
    /**
     * @param vat_id the vat_id to set
     */
    public void setVat_id(String vat_id) {
        this.vat_id = vat_id;
    }
    /**
     * @return the last_activity
     */
    public String getLast_activity() {
        return last_activity;
    }
    /**
     * @param last_activity the last_activity to set
     */
    public void setLast_activity(String last_activity) {
        this.last_activity = last_activity;
    }
    /**
     * @return the created_by
     */
    public String getCreated_by() {
        return created_by;
    }
    /**
     * @param created_by the created_by to set
     */
    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
    /**
     * @return the updated_by
     */
    public String getUpdated_by() {
        return updated_by;
    }
    /**
     * @param updated_by the updated_by to set
     */
    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }
    /**
     * @return the assigned_to
     */
    public String getAssigned_to() {
        return assigned_to;
    }
    /**
     * @param assigned_to the assigned_to to set
     */
    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }
    /**
     * @return the assigned_group_id
     */
    public String getAssigned_group_id() {
        return assigned_group_id;
    }
    /**
     * @param assigned_group_id the assigned_group_id to set
     */
    public void setAssigned_group_id(String assigned_group_id) {
        this.assigned_group_id = assigned_group_id;
    }
    /**
     * @return the auto_charge
     */
    public int getAuto_charge() {
        return auto_charge;
    }
    /**
     * @param auto_charge the auto_charge to set
     */
    public void setAuto_charge(int auto_charge) {
        this.auto_charge = auto_charge;
    }
    /**
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }
    /**
     * @param balance the balance to set
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }
    /**
     * @return the unapplied_amount
     */
    public int getUnapplied_amount() {
        return unapplied_amount;
    }
    /**
     * @param unapplied_amount the unapplied_amount to set
     */
    public void setUnapplied_amount(int unapplied_amount) {
        this.unapplied_amount = unapplied_amount;
    }
    /**
     * @return the billing_address_1
     */
    public String getBilling_address_1() {
        return billing_address_1;
    }
    /**
     * @param billing_address_1 the billing_address_1 to set
     */
    public void setBilling_address_1(String billing_address_1) {
        this.billing_address_1 = billing_address_1;
    }
    /**
     * @return the billing_address_2
     */
    public String getBilling_address_2() {
        return billing_address_2;
    }
    /**
     * @param billing_address_2 the billing_address_2 to set
     */
    public void setBilling_address_2(String billing_address_2) {
        this.billing_address_2 = billing_address_2;
    }
    /**
     * @return the billing_city
     */
    public String getBilling_city() {
        return billing_city;
    }
    /**
     * @param billing_city the billing_city to set
     */
    public void setBilling_city(String billing_city) {
        this.billing_city = billing_city;
    }
    /**
     * @return the billing_state
     */
    public String getBilling_state() {
        return billing_state;
    }
    /**
     * @param billing_state the billing_state to set
     */
    public void setBilling_state(String billing_state) {
        this.billing_state = billing_state;
    }
    /**
     * @return the billing_county
     */
    public String getBilling_county() {
        return billing_county;
    }
    /**
     * @param billing_county the billing_county to set
     */
    public void setBilling_county(String billing_county) {
        this.billing_county = billing_county;
    }
    /**
     * @return the billing_postal_code
     */
    public String getBilling_postal_code() {
        return billing_postal_code;
    }
    /**
     * @param billing_postal_code the billing_postal_code to set
     */
    public void setBilling_postal_code(String billing_postal_code) {
        this.billing_postal_code = billing_postal_code;
    }
    /**
     * @return the billing_country
     */
    public String getBilling_country() {
        return billing_country;
    }
    /**
     * @param billing_country the billing_country to set
     */
    public void setBilling_country(String billing_country) {
        this.billing_country = billing_country;
    }
    /**
     * @return the shipping_address_1
     */
    public String getShipping_address_1() {
        return shipping_address_1;
    }
    /**
     * @param shipping_address_1 the shipping_address_1 to set
     */
    public void setShipping_address_1(String shipping_address_1) {
        this.shipping_address_1 = shipping_address_1;
    }
    /**
     * @return the shipping_address_2
     */
    public String getShipping_address_2() {
        return shipping_address_2;
    }
    /**
     * @param shipping_address_2 the shipping_address_2 to set
     */
    public void setShipping_address_2(String shipping_address_2) {
        this.shipping_address_2 = shipping_address_2;
    }
    /**
     * @return the shipping_city
     */
    public String getShipping_city() {
        return shipping_city;
    }
    /**
     * @param shipping_city the shipping_city to set
     */
    public void setShipping_city(String shipping_city) {
        this.shipping_city = shipping_city;
    }
    /**
     * @return the shipping_state
     */
    public String getShipping_state() {
        return shipping_state;
    }
    /**
     * @param shipping_state the shipping_state to set
     */
    public void setShipping_state(String shipping_state) {
        this.shipping_state = shipping_state;
    }
    /**
     * @return the shipping_county
     */
    public String getShipping_county() {
        return shipping_county;
    }
    /**
     * @param shipping_county the shipping_county to set
     */
    public void setShipping_county(String shipping_county) {
        this.shipping_county = shipping_county;
    }
    /**
     * @return the shipping_postal_code
     */
    public String getShipping_postal_code() {
        return shipping_postal_code;
    }
    /**
     * @param shipping_postal_code the shipping_postal_code to set
     */
    public void setShipping_postal_code(String shipping_postal_code) {
        this.shipping_postal_code = shipping_postal_code;
    }
    /**
     * @return the shipping_country
     */
    public String getShipping_country() {
        return shipping_country;
    }
    /**
     * @param shipping_country the shipping_country to set
     */
    public void setShipping_country(String shipping_country) {
        this.shipping_country = shipping_country;
    }
    /**
     * @return the data_source
     */
    public String getData_source() {
        return data_source;
    }
    /**
     * @param data_source the data_source to set
     */
    public void setData_source(String data_source) {
        this.data_source = data_source;
    }
    String created_by;
    String updated_by;
    String assigned_to;
    String assigned_group_id;
    int auto_charge;
    int balance;
    int unapplied_amount;
    String billing_address_1;
    String billing_address_2;
    String billing_city;
    String billing_state;
    String billing_county;
    String billing_postal_code;
    String billing_country;
    String shipping_address_1;
    String shipping_address_2;
    String shipping_city;
    String shipping_state;
    String shipping_county;
    String shipping_postal_code;
    String shipping_country;
    String data_source;
}