package com.minwoo.customer.entities;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(schema = "dbo", name = "member")
@Proxy(lazy = false)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private int id;
    
    @Column(name = "member_fname")
    private String firstName;

    @Column(name = "member_lname")
    private String lastName;

    @Column(name = "member_email")
    private String email;

    @Column(name = "member_password")
    private String password;

    @Column(name = "member_phone")
    private String phone;

    @Column(name = "member_fax")
    private String fax;

    @Column(name = "member_cel")
    private String cellPhone;

    @Column(name = "member_phone_home")
    private String homePhone;

    @Column(name = "member_other1")
    private String other1;

    @Column(name = "member_other2")
    private String other2;

    @Column(name = "member_address_1")
    private String address1;

    @Column(name = "member_address_2")
    private String address2;

    @Column(name = "member_city")
    private String city;

    @Column(name = "member_province")
    private Short provinceId;

    @Column(name = "member_postal")
    private String postal;

    @Column(name = "member_country")
    private Integer countryId;

    @Column(name = "member_company")
    private String company;

    @Column(name = "member_date")
    private LocalDateTime date;

    @Column(name = "mailing_status")
    private Boolean mailingStatus;

    @Column(name = "validity")
    private Byte validity;

    @Column(name = "member_count")
    private Integer memberCount;

    @Column(name = "member_billing")
    private Integer billingId;

    @Column(name = "member_note")
    private String note;

    @Column(name = "sales_group_id", nullable = false)
    private int salesGroupId;

    @Column(name = "admin_id")
    private Integer adminId;

    @Column(name = "acquisition_venue_id", nullable = false)
    private int acquistionVenueId;

    @Column(name = "acquisition_type_id")
    private Integer acquisitionTypeId;

    @Column(name = "acquisition_cost", nullable = false)
    private BigDecimal acquisitionCost;

    @Column(name = "admin_id_added", nullable = false) //  foreign key
    private int adminIdAdded;

    @Column(name = "member_search")
    private String memberSearch;

    @Column(name = "member_is_lead")
    private Boolean isLead;

    @Column(name = "member_status")
    private Boolean status;

    @Column(name = "member_isDeleted")
    private Boolean isDeleted;

    @Column(name = "recurring_po_number")
    private String recurringPoNumber;

    @Column(name = "preferred_store_id")
    private Integer preferredStoreId;

    @Column(name = "pharm_reps")
    private Boolean pharmReps;

    @Column(name = "lead_status_id")
    private Integer leadStatusId;

    @Column(name = "internal_note")
    private String internalNote;

    @Column(name = "member_lead_to_client")
    private Boolean leadToClient;

    @Column(name = "temp_tax_exempt_number")
    private String tempTaxExemptNumber;

    @Column(name = "referral_type_id")
    private Integer referralTypeId;

    @Column(name = "default_revenue_source")
    private Integer defaultRevenueSource;

    @Column(name = "email_invoice_to_member", nullable = false)
    private boolean emailInvoiceToMember;

    @Column(name = "email_invoice_to_billing", nullable = false)
    private boolean emailInvoiceToBilling;

    @Column(name = "do_not_call", nullable = false)
    private boolean doNotCall;

    @Column(name = "member_latitude")
    private Float latitude;

    @Column(name = "member_longitude")
    private Float longitude;

    @Column(name = "geolocation_source")
    private String geolocationSource;

    @Column(name = "is_guest_account", nullable = false)
    private boolean isGuestAccount;

//    @CreationTimestamp
    @Column(name = "date_registered")
    private LocalDateTime registeredDate;

    @Column(name = "access_house_account", nullable = false)
    private boolean accessHouseAccount;

    @Column(name = "sms_opt_in", nullable = false)
    private boolean smsOptIn;

    @Column(name = "external_id")
    private Integer externalId;

    protected Customer() {
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Short getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Short provinceId) {
        this.provinceId = provinceId;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Boolean getMailingStatus() {
        return mailingStatus;
    }

    public void setMailingStatus(Boolean mailingStatus) {
        this.mailingStatus = mailingStatus;
    }

    public Byte getValidity() {
        return validity;
    }

    public void setValidity(Byte validity) {
        this.validity = validity;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getSalesGroupId() {
        return salesGroupId;
    }

    public void setSalesGroupId(int salesGroupId) {
        this.salesGroupId = salesGroupId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public int getAcquistionVenueId() {
        return acquistionVenueId;
    }

    public void setAcquistionVenueId(int acquistionVenueId) {
        this.acquistionVenueId = acquistionVenueId;
    }

    public Integer getAcquisitionTypeId() {
        return acquisitionTypeId;
    }

    public void setAcquisitionTypeId(Integer acquisitionTypeId) {
        this.acquisitionTypeId = acquisitionTypeId;
    }

    public BigDecimal getAcquisitionCost() {
        return acquisitionCost;
    }

    public void setAcquisitionCost(BigDecimal acquisitionCost) {
        this.acquisitionCost = acquisitionCost;
    }

    public int getAdminIdAdded() {
        return adminIdAdded;
    }

    public void setAdminIdAdded(int adminIdAdded) {
        this.adminIdAdded = adminIdAdded;
    }

    public String getMemberSearch() {
        return memberSearch;
    }

    public void setMemberSearch(String memberSearch) {
        this.memberSearch = memberSearch;
    }

    public Boolean getLead() {
        return isLead;
    }

    public void setLead(Boolean lead) {
        isLead = lead;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getRecurringPoNumber() {
        return recurringPoNumber;
    }

    public void setRecurringPoNumber(String recurringPoNumber) {
        this.recurringPoNumber = recurringPoNumber;
    }

    public Integer getPreferredStoreId() {
        return preferredStoreId;
    }

    public void setPreferredStoreId(Integer preferredStoreId) {
        this.preferredStoreId = preferredStoreId;
    }

    public Boolean getPharmReps() {
        return pharmReps;
    }

    public void setPharmReps(Boolean pharmReps) {
        this.pharmReps = pharmReps;
    }

    public Integer getLeadStatusId() {
        return leadStatusId;
    }

    public void setLeadStatusId(Integer leadStatusId) {
        this.leadStatusId = leadStatusId;
    }

    public String getInternalNote() {
        return internalNote;
    }

    public void setInternalNote(String internalNote) {
        this.internalNote = internalNote;
    }

    public Boolean getLeadToClient() {
        return leadToClient;
    }

    public void setLeadToClient(Boolean leadToClient) {
        this.leadToClient = leadToClient;
    }

    public String getTempTaxExemptNumber() {
        return tempTaxExemptNumber;
    }

    public void setTempTaxExemptNumber(String tempTaxExemptNumber) {
        this.tempTaxExemptNumber = tempTaxExemptNumber;
    }

    public Integer getReferralTypeId() {
        return referralTypeId;
    }

    public void setReferralTypeId(Integer referralTypeId) {
        this.referralTypeId = referralTypeId;
    }

    public Integer getDefaultRevenueSource() {
        return defaultRevenueSource;
    }

    public void setDefaultRevenueSource(Integer defaultRevenueSource) {
        this.defaultRevenueSource = defaultRevenueSource;
    }

    public boolean isEmailInvoiceToMember() {
        return emailInvoiceToMember;
    }

    public void setEmailInvoiceToMember(boolean emailInvoiceToMember) {
        this.emailInvoiceToMember = emailInvoiceToMember;
    }

    public boolean isEmailInvoiceToBilling() {
        return emailInvoiceToBilling;
    }

    public void setEmailInvoiceToBilling(boolean emailInvoiceToBilling) {
        this.emailInvoiceToBilling = emailInvoiceToBilling;
    }

    public boolean isDoNotCall() {
        return doNotCall;
    }

    public void setDoNotCall(boolean doNotCall) {
        this.doNotCall = doNotCall;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getGeolocationSource() {
        return geolocationSource;
    }

    public void setGeolocationSource(String geolocationSource) {
        this.geolocationSource = geolocationSource;
    }

    public boolean isGuestAccount() {
        return isGuestAccount;
    }

    public void setGuestAccount(boolean guestAccount) {
        isGuestAccount = guestAccount;
    }

    public LocalDateTime getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDateTime registeredDate) {
        this.registeredDate = registeredDate;
    }

    public boolean isAccessHouseAccount() {
        return accessHouseAccount;
    }

    public void setAccessHouseAccount(boolean accessHouseAccount) {
        this.accessHouseAccount = accessHouseAccount;
    }

    public boolean isSmsOptIn() {
        return smsOptIn;
    }

    public void setSmsOptIn(boolean smsOptIn) {
        this.smsOptIn = smsOptIn;
    }

    public Integer getExternalId() {
        return externalId;
    }

    public void setExternalId(Integer externalId) {
        this.externalId = externalId;
    }
}
