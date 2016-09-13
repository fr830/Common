package com.etao.communityactivity.entity;

import java.util.Date;

public class GrouponDataCatagory {
    private Integer groupondatacatagoryid;

    private String groupondatacatagorycode;

    private String groupondatacatagoryname;

    private Integer sort;

    private Date createdate;

    private Boolean isdelete;

    private String remark;

    public Integer getGroupondatacatagoryid() {
        return groupondatacatagoryid;
    }

    public void setGroupondatacatagoryid(Integer groupondatacatagoryid) {
        this.groupondatacatagoryid = groupondatacatagoryid;
    }

    public String getGroupondatacatagorycode() {
        return groupondatacatagorycode;
    }

    public void setGroupondatacatagorycode(String groupondatacatagorycode) {
        this.groupondatacatagorycode = groupondatacatagorycode == null ? null : groupondatacatagorycode.trim();
    }

    public String getGroupondatacatagoryname() {
        return groupondatacatagoryname;
    }

    public void setGroupondatacatagoryname(String groupondatacatagoryname) {
        this.groupondatacatagoryname = groupondatacatagoryname == null ? null : groupondatacatagoryname.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}