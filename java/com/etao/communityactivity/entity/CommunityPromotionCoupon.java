package com.etao.communityactivity.entity;

import java.util.Date;

public class CommunityPromotionCoupon {
    private Integer id;

    private String couponno;

    private String orderno;

    private Date createdate;

    private Integer customerid;

    private Integer communitypromotionid;

    private Integer couponstatus;

    private String couponstatusname;

    private Integer usesupplierid;

    private String usesuppliername;

    private Date usedate;

    private Date refunddate;

    private Boolean isdeleted;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponno() {
        return couponno;
    }

    public void setCouponno(String couponno) {
        this.couponno = couponno == null ? null : couponno.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getCommunitypromotionid() {
        return communitypromotionid;
    }

    public void setCommunitypromotionid(Integer communitypromotionid) {
        this.communitypromotionid = communitypromotionid;
    }

    public Integer getCouponstatus() {
        return couponstatus;
    }

    public void setCouponstatus(Integer couponstatus) {
        this.couponstatus = couponstatus;
    }

    public String getCouponstatusname() {
        return couponstatusname;
    }

    public void setCouponstatusname(String couponstatusname) {
        this.couponstatusname = couponstatusname == null ? null : couponstatusname.trim();
    }

    public Integer getUsesupplierid() {
        return usesupplierid;
    }

    public void setUsesupplierid(Integer usesupplierid) {
        this.usesupplierid = usesupplierid;
    }

    public String getUsesuppliername() {
        return usesuppliername;
    }

    public void setUsesuppliername(String usesuppliername) {
        this.usesuppliername = usesuppliername == null ? null : usesuppliername.trim();
    }

    public Date getUsedate() {
        return usedate;
    }

    public void setUsedate(Date usedate) {
        this.usedate = usedate;
    }

    public Date getRefunddate() {
        return refunddate;
    }

    public void setRefunddate(Date refunddate) {
        this.refunddate = refunddate;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}