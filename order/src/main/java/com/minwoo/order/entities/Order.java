package com.minwoo.order.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(schema = "dbo", name = "orders")
public class Order {
    private int order_id;
    private Integer base_id;
    private Integer billing_id; //foreign key
    private Integer member_id; //foreign key
    private Integer store_id; //foreign key
    private Integer order_date;
    private Short order_time;
    private Integer date_req;
    private Byte time_req;
    private Byte del_type;
    private Byte order_type;
    private Integer viewBy; //foreign key
    private Integer orderBy; //foreign key
    private Integer editBy; //foreign key
    private Float order_subtotal;
    private Float order_discount;
    private Float order_gratuity;
    private Float order_tax;
    private BigDecimal order_total;
    private Byte order_status;
    private Boolean order_paid;
    private Boolean order_locked;
    private Boolean order_isDeleted;
    private Boolean isPromo;
    private boolean isGroupOrder;
    private boolean isActivatedGroupOrder;
    private Boolean preAuthIsRequired;
    private Float delivery_fee;
    private Float delivery_fee_default;
    private Boolean delivery_fee_manual;
    private Float order_discount_src_code;
    private Integer source_code_id;
    private String source_code;
    private Float order_delivery_fee_discount;
    private LocalDateTime order_edit_date_time;
    private Boolean order_tax_exempt;
    private Integer web_promo_id;
    private String web_promo_accepted;
    private String pos_order_id;
    private String confirmBy;
    private String order_confirm_date_time;
    private String order_accept_date_time;
    private String order_discount_type;
    private String order_discount_rate;
    private String order_title;
    private String order_class_id;
    private String order_format_id;
    private String admin_event_coordinator;
    private String referral_type_id;
    private String event_time_req_start;
    private String event_time_req_end;
    private String order_gratuity_default;
    private String order_gratuity_manual;
    private String order_pos_type_id;
    private String posted_on;
    private String pos_batch_id;
    private String isToGoOrder;
    private String vendor_id;
    private String revenue_source;
    private String acceptedBy;
    private String invoice_emailed;
    private String pos_internal_order_id;
    private String default_store_id;
    private String pos_order_type;
    private String address_id;
    private String do_day_end;
    private String posted_by;
    private String order_discount_amount;
    private String discount_id;
    private String seq_num;
    private String order_discount_coupon;
    private String party_id;
    private String loyalty_batch_id;
    private String posted_loyalty_on;
    private String created_by_standing_order;
    private String sot_id;
    private String free_item_orders_sub_id;
    private String is_guest_order;
    private String application_id;
    private String service_channel_id;
    private String distribution_type_id;
    private String order_rewards;

}
