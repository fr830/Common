package com.etao.communityactivity.entity;

import java.util.Date;

public class CommunityInfo {
    private Integer id;

    private String communityname;

    private String communitymaster;

    private String suppliername;

    private Integer supplierid;

    private Integer firstcategoryid;

    private String firstcategoryname;

    private Integer secondcategoryid;

    private String secondcategoryname;

    private Integer registerlimit;

    private Boolean isregisterlimit;

    private String introduction;

    private String description;

    private String headpic;

    private Date createdate;

    private Integer operatorid;

    private String operatorname;

    private Boolean isdeleted;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname == null ? null : communityname.trim();
    }

    public String getCommunitymaster() {
        return communitymaster;
    }

    public void setCommunitymaster(String communitymaster) {
        this.communitymaster = communitymaster == null ? null : communitymaster.trim();
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