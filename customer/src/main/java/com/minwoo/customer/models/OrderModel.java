package com.minwoo.customer.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class OrderModel {

    private int id;

    private Integer baseId;

    private Integer billingId; //foreign key

    private Integer memberId; //foreign key

    private Integer storeId; //foreign key

    private Integer orderDate;

    private Byte orderTime;

    private Integer dateReq;

    private Byte timeReq;

    private Byte delType;

    private Byte orderType;

    private Integer viewBy; //foreign key

    private Integer orderBy; //foreign key

    private Integer editBy; //foreign key

    private Float orderSubTotal;

    private Float orderDiscount;

    private Float orderGratuity;

    private Float orderTax;

    private BigDecimal orderTotal;

    private Byte orderStatus;

    private Boolean orderPaid;

    private Boolean orderLocked;

    private Boolean orderIsDeleted;

    private Boolean isPromo;

    private boolean isGroupOrder;

    private boolean isActivatedGroupOrder;

    private Boolean preAuthIsRequired;

    private Float deliveryFee;

    private Float deliveryFeeDefault;

    private Boolean deliveryFeeManual;

    private Float orderDiscountSrcCode;

    private Integer sourceCodeId;

    private String sourceCode;

    private Float orderDeliveryFeeDiscount;

    private LocalDateTime orderEditDateTime;

    private Boolean orderTaxExempt;

    private Integer webPromoId;

    private Boolean webPromoAccepted;

    private String posOrderId;

    private Integer confirmBy;

    private LocalDateTime orderConfirmDateTime;

    private LocalDateTime orderAcceptDateTime;

    private Integer orderDiscountType;

    private Float orderDiscountRate;

    private String orderTitle;

    private Byte orderClassId;

    private Integer orderFormatId;

    private Integer adminEventCoordinator;

    private Integer referralTypeId;

    private Integer eventTimeReqStart;

    private Integer eventTimeReqEnd;

    private Float orderGratuityDefault;

    private Boolean orderGratuityManual;

    private Byte orderPosTypeId;

    private LocalDateTime postedOn;

    private BigInteger posBatchId;

    private boolean isToGoOrder;

    private Integer vendorId;

    private Integer revenueSource;

    private Integer acceptedBy;

    private Boolean invoiceEmailed;

    private String posInternalOrderId;

    private Integer defaultStoreId;

    private Byte posOrderType;

    private Integer addressId;

    private Boolean doDayEnd;

    private Integer postedBy;

    private float orderDiscountAmount;

    private String discountId;

    private Integer seqNum;

    private float orderDiscountCoupon;

    private Integer partyId;

    private BigInteger loyaltyBatchId;

    private LocalDateTime postedLoyaltyOn;

    private Integer createdByStandingOrder;

    private Integer sotId; //foreign key

    private Integer freeItemOrdersSubId;

    private boolean isGuestOrder;

    private int applicationId;

    private int serviceChannelId;

    private int distributionTypeId;

    private Float orderRewards;

    protected OrderModel() {
    }

    public int getId() {
        return id;
    }

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Integer orderDate) {
        this.orderDate = orderDate;
    }

    public Byte getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Byte orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getDateReq() {
        return dateReq;
    }

    public void setDateReq(Integer dateReq) {
        this.dateReq = dateReq;
    }

    public Byte getTimeReq() {
        return timeReq;
    }

    public void setTimeReq(Byte timeReq) {
        this.timeReq = timeReq;
    }

    public Byte getDelType() {
        return delType;
    }

    public void setDelType(Byte delType) {
        this.delType = delType;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public Integer getViewBy() {
        return viewBy;
    }

    public void setViewBy(Integer viewBy) {
        this.viewBy = viewBy;
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getEditBy() {
        return editBy;
    }

    public void setEditBy(Integer editBy) {
        this.editBy = editBy;
    }

    public Float getOrderSubTotal() {
        return orderSubTotal;
    }

    public void setOrderSubTotal(Float orderSubTotal) {
        this.orderSubTotal = orderSubTotal;
    }

    public Float getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(Float orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public Float getOrderGratuity() {
        return orderGratuity;
    }

    public void setOrderGratuity(Float orderGratuity) {
        this.orderGratuity = orderGratuity;
    }

    public Float getOrderTax() {
        return orderTax;
    }

    public void setOrderTax(Float orderTax) {
        this.orderTax = orderTax;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getOrderPaid() {
        return orderPaid;
    }

    public void setOrderPaid(Boolean orderPaid) {
        this.orderPaid = orderPaid;
    }

    public Boolean getOrderLocked() {
        return orderLocked;
    }

    public void setOrderLocked(Boolean orderLocked) {
        this.orderLocked = orderLocked;
    }

    public Boolean getOrderIsDeleted() {
        return orderIsDeleted;
    }

    public void setOrderIsDeleted(Boolean orderIsDeleted) {
        this.orderIsDeleted = orderIsDeleted;
    }

    public Boolean getPromo() {
        return isPromo;
    }

    public void setPromo(Boolean promo) {
        isPromo = promo;
    }

    public boolean isGroupOrder() {
        return isGroupOrder;
    }

    public void setGroupOrder(boolean groupOrder) {
        isGroupOrder = groupOrder;
    }

    public boolean isActivatedGroupOrder() {
        return isActivatedGroupOrder;
    }

    public void setActivatedGroupOrder(boolean activatedGroupOrder) {
        isActivatedGroupOrder = activatedGroupOrder;
    }

    public Boolean getPreAuthIsRequired() {
        return preAuthIsRequired;
    }

    public void setPreAuthIsRequired(Boolean preAuthIsRequired) {
        this.preAuthIsRequired = preAuthIsRequired;
    }

    public Float getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Float deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Float getDeliveryFeeDefault() {
        return deliveryFeeDefault;
    }

    public void setDeliveryFeeDefault(Float deliveryFeeDefault) {
        this.deliveryFeeDefault = deliveryFeeDefault;
    }

    public Boolean getDeliveryFeeManual() {
        return deliveryFeeManual;
    }

    public void setDeliveryFeeManual(Boolean deliveryFeeManual) {
        this.deliveryFeeManual = deliveryFeeManual;
    }

    public Float getOrderDiscountSrcCode() {
        return orderDiscountSrcCode;
    }

    public void setOrderDiscountSrcCode(Float orderDiscountSrcCode) {
        this.orderDiscountSrcCode = orderDiscountSrcCode;
    }

    public Integer getSourceCodeId() {
        return sourceCodeId;
    }

    public void setSourceCodeId(Integer sourceCodeId) {
        this.sourceCodeId = sourceCodeId;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Float getOrderDeliveryFeeDiscount() {
        return orderDeliveryFeeDiscount;
    }

    public void setOrderDeliveryFeeDiscount(Float orderDeliveryFeeDiscount) {
        this.orderDeliveryFeeDiscount = orderDeliveryFeeDiscount;
    }

    public LocalDateTime getOrderEditDateTime() {
        return orderEditDateTime;
    }

    public void setOrderEditDateTime(LocalDateTime orderEditDateTime) {
        this.orderEditDateTime = orderEditDateTime;
    }

    public Boolean getOrderTaxExempt() {
        return orderTaxExempt;
    }

    public void setOrderTaxExempt(Boolean orderTaxExempt) {
        this.orderTaxExempt = orderTaxExempt;
    }

    public Integer getWebPromoId() {
        return webPromoId;
    }

    public void setWebPromoId(Integer webPromoId) {
        this.webPromoId = webPromoId;
    }

    public Boolean getWebPromoAccepted() {
        return webPromoAccepted;
    }

    public void setWebPromoAccepted(Boolean webPromoAccepted) {
        this.webPromoAccepted = webPromoAccepted;
    }

    public String getPosOrderId() {
        return posOrderId;
    }

    public void setPosOrderId(String posOrderId) {
        this.posOrderId = posOrderId;
    }

    public Integer getConfirmBy() {
        return confirmBy;
    }

    public void setConfirmBy(Integer confirmBy) {
        this.confirmBy = confirmBy;
    }

    public LocalDateTime getOrderConfirmDateTime() {
        return orderConfirmDateTime;
    }

    public void setOrderConfirmDateTime(LocalDateTime orderConfirmDateTime) {
        this.orderConfirmDateTime = orderConfirmDateTime;
    }

    public LocalDateTime getOrderAcceptDateTime() {
        return orderAcceptDateTime;
    }

    public void setOrderAcceptDateTime(LocalDateTime orderAcceptDateTime) {
        this.orderAcceptDateTime = orderAcceptDateTime;
    }

    public Integer getOrderDiscountType() {
        return orderDiscountType;
    }

    public void setOrderDiscountType(Integer orderDiscountType) {
        this.orderDiscountType = orderDiscountType;
    }

    public Float getOrderDiscountRate() {
        return orderDiscountRate;
    }

    public void setOrderDiscountRate(Float orderDiscountRate) {
        this.orderDiscountRate = orderDiscountRate;
    }

    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    public Byte getOrderClassId() {
        return orderClassId;
    }

    public void setOrderClassId(Byte orderClassId) {
        this.orderClassId = orderClassId;
    }

    public Integer getOrderFormatId() {
        return orderFormatId;
    }

    public void setOrderFormatId(Integer orderFormatId) {
        this.orderFormatId = orderFormatId;
    }

    public Integer getAdminEventCoordinator() {
        return adminEventCoordinator;
    }

    public void setAdminEventCoordinator(Integer adminEventCoordinator) {
        this.adminEventCoordinator = adminEventCoordinator;
    }

    public Integer getReferralTypeId() {
        return referralTypeId;
    }

    public void setReferralTypeId(Integer referralTypeId) {
        this.referralTypeId = referralTypeId;
    }

    public Integer getEventTimeReqStart() {
        return eventTimeReqStart;
    }

    public void setEventTimeReqStart(Integer eventTimeReqStart) {
        this.eventTimeReqStart = eventTimeReqStart;
    }

    public Integer getEventTimeReqEnd() {
        return eventTimeReqEnd;
    }

    public void setEventTimeReqEnd(Integer eventTimeReqEnd) {
        this.eventTimeReqEnd = eventTimeReqEnd;
    }

    public Float getOrderGratuityDefault() {
        return orderGratuityDefault;
    }

    public void setOrderGratuityDefault(Float orderGratuityDefault) {
        this.orderGratuityDefault = orderGratuityDefault;
    }

    public Boolean getOrderGratuityManual() {
        return orderGratuityManual;
    }

    public void setOrderGratuityManual(Boolean orderGratuityManual) {
        this.orderGratuityManual = orderGratuityManual;
    }

    public Byte getOrderPosTypeId() {
        return orderPosTypeId;
    }

    public void setOrderPosTypeId(Byte orderPosTypeId) {
        this.orderPosTypeId = orderPosTypeId;
    }

    public LocalDateTime getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(LocalDateTime postedOn) {
        this.postedOn = postedOn;
    }

    public BigInteger getPosBatchId() {
        return posBatchId;
    }

    public void setPosBatchId(BigInteger posBatchId) {
        this.posBatchId = posBatchId;
    }

    public boolean isToGoOrder() {
        return isToGoOrder;
    }

    public void setToGoOrder(boolean toGoOrder) {
        isToGoOrder = toGoOrder;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getRevenueSource() {
        return revenueSource;
    }

    public void setRevenueSource(Integer revenueSource) {
        this.revenueSource = revenueSource;
    }

    public Integer getAcceptedBy() {
        return acceptedBy;
    }

    public void setAcceptedBy(Integer acceptedBy) {
        this.acceptedBy = acceptedBy;
    }

    public Boolean getInvoiceEmailed() {
        return invoiceEmailed;
    }

    public void setInvoiceEmailed(Boolean invoiceEmailed) {
        this.invoiceEmailed = invoiceEmailed;
    }

    public String getPosInternalOrderId() {
        return posInternalOrderId;
    }

    public void setPosInternalOrderId(String posInternalOrderId) {
        this.posInternalOrderId = posInternalOrderId;
    }

    public Integer getDefaultStoreId() {
        return defaultStoreId;
    }

    public void setDefaultStoreId(Integer defaultStoreId) {
        this.defaultStoreId = defaultStoreId;
    }

    public Byte getPosOrderType() {
        return posOrderType;
    }

    public void setPosOrderType(Byte posOrderType) {
        this.posOrderType = posOrderType;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Boolean getDoDayEnd() {
        return doDayEnd;
    }

    public void setDoDayEnd(Boolean doDayEnd) {
        this.doDayEnd = doDayEnd;
    }

    public Integer getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(Integer postedBy) {
        this.postedBy = postedBy;
    }

    public float getOrderDiscountAmount() {
        return orderDiscountAmount;
    }

    public void setOrderDiscountAmount(float orderDiscountAmount) {
        this.orderDiscountAmount = orderDiscountAmount;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public float getOrderDiscountCoupon() {
        return orderDiscountCoupon;
    }

    public void setOrderDiscountCoupon(float orderDiscountCoupon) {
        this.orderDiscountCoupon = orderDiscountCoupon;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public BigInteger getLoyaltyBatchId() {
        return loyaltyBatchId;
    }

    public void setLoyaltyBatchId(BigInteger loyaltyBatchId) {
        this.loyaltyBatchId = loyaltyBatchId;
    }

    public LocalDateTime getPostedLoyaltyOn() {
        return postedLoyaltyOn;
    }

    public void setPostedLoyaltyOn(LocalDateTime postedLoyaltyOn) {
        this.postedLoyaltyOn = postedLoyaltyOn;
    }

    public Integer getCreatedByStandingOrder() {
        return createdByStandingOrder;
    }

    public void setCreatedByStandingOrder(Integer createdByStandingOrder) {
        this.createdByStandingOrder = createdByStandingOrder;
    }

    public Integer getSotId() {
        return sotId;
    }

    public void setSotId(Integer sotId) {
        this.sotId = sotId;
    }

    public Integer getFreeItemOrdersSubId() {
        return freeItemOrdersSubId;
    }

    public void setFreeItemOrdersSubId(Integer freeItemOrdersSubId) {
        this.freeItemOrdersSubId = freeItemOrdersSubId;
    }

    public boolean isGuestOrder() {
        return isGuestOrder;
    }

    public void setGuestOrder(boolean guestOrder) {
        isGuestOrder = guestOrder;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getServiceChannelId() {
        return serviceChannelId;
    }

    public void setServiceChannelId(int serviceChannelId) {
        this.serviceChannelId = serviceChannelId;
    }

    public int getDistributionTypeId() {
        return distributionTypeId;
    }

    public void setDistributionTypeId(int distributionTypeId) {
        this.distributionTypeId = distributionTypeId;
    }

    public Float getOrderRewards() {
        return orderRewards;
    }

    public void setOrderRewards(Float orderRewards) {
        this.orderRewards = orderRewards;
    }

}
