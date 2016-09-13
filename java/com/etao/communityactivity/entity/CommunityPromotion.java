package com.etao.communityactivity.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CommunityPromotion {
    private Integer id;

    private String communitypromotionname;

    private Integer communityid;

    private String communityname;

    private Integer firstcategoryid;

    private String firstcategoryname;

    private Integer secondcategoryid;

    private String secondcategoryname;

    private Integer registerlimit;

    private Boolean isregisterlimit;

    private BigDecimal price;

    private Date applyenddate;

    private Date startdate;

    private Date enddate;

    private String suppliername;

    private Integer supplierid;

    private String place;

    private String baidulong;

    private String baidulat;

    private String introduction;

    private String description;

    private String flow;

    private String headpic;

    private Date createdate;

    private Integer operatorid;

    private String operatorname;

    private String phone;

    private Boolean isdeleted;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommunitypromotionname() {
        return communitypromotionname;
    }

    public void setCommunitypromotionname(String communitypromotionname) {
        this.communitypromotionname = communitypromotionname == null ? null : communitypromotionname.trim();
    }

    public Integer getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname == null ? null : communityname.trim();
    }

    public Integer getFirstcategoryid() {
        return firstcategoryid;
    }

    public void setFirstcategoryid(Integer firstcategoryid) {
        this.firstcategoryid = firstcategoryid;
    }

    public String getFirstcategoryname() {
        return firstcategoryname;
    }

    public void setFirstcategoryname(String firstcategoryname) {
        this.firstcategoryname = firstcategoryname == null ? null : firstcategoryname.trim();
    }

    public Integer getSecondcategoryid() {
        return secondcategoryid;
    }

    public void setSecondcategoryid(Integer secondcategoryid) {
        this.secondcategoryid = secondcategoryid;
    }

    public String getSecondcategoryname() {
        return secondcategoryname;
    }

    public void setSecondcategoryname(String secondcategoryname) {
        this.secondcategoryname = secondcategoryname == null ? null : secondcategoryname.trim();
    }

    public Integer getRegisterlimit() {
        return registerlimit;
    }

    public void setRegisterlimit(Integer registerlimit) {
        this.registerlimit = registerlimit;
    }

    public Boolean getIsregisterlimit() {
        return isregisterlimit;
    }

    public void setIsregisterlimit(Boolean isregisterlimit) {
        this.isregisterlimit = isregisterlimit;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getApplyenddate() {
        return applyenddate;
    }

    public void setApplyenddate(Date applyenddate) {
        this.applyenddate = applyenddate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getBaidulong() {
        return baidulong;
    }

    public void setBaidulong(String baidulong) {
        this.baidulong = baidulong == null ? null : baidulong.trim();
    }

    public String getBaidulat() {
        return baidulat;
    }

    public void setBaidulat(String baidulat) {
        this.baidulat = baidulat == null ? null : baidulat.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow == null ? null : flow.trim();
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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