package com.etao.communityactivity.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CommunityPromotionPayment {
    private Integer id;

    private BigDecimal amount;

    private Integer paymenttype;

    private String paymenttypename;

    private String paymentno;

    private String orderno;

    private Date createdate;

    private Integer paymentsatus;

    private String paymentsatusname;

    private Date lastupdatedate;

    private String partnerid;

    private Boolean isdeleted;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(Integer paymenttype) {
        this.paymenttype = paymenttype;
    }

    public String getPaymenttypename() {
        return paymenttypename;
    }

    public void setPaymenttypename(String paymenttypename) {
        this.paymenttypename = paymenttypename == null ? null : paymenttypename.trim();
    }

    public String getPaymentno() {
        return paymentno;
    }

    public void setPaymentno(String paymentno) {
        this.paymentno = paymentno == null ? null : paymentno.trim();
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

    public Integer getPaymentsatus() {
        return paymentsatus;
    }

    public void setPaymentsatus(Integer paymentsatus) {
        this.paymentsatus = paymentsatus;
    }

    public String getPaymentsatusname() {
        return paymentsatusname;
    }

    public void setPaymentsatusname(String paymentsatusname) {
        this.paymentsatusname = paymentsatusname == null ? null : paymentsatusname.trim();
    }

    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid == null ? null : partnerid.trim();
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