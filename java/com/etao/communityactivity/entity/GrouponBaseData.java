package com.etao.communityactivity.entity;

import java.util.Date;

public class GrouponBaseData {
    private Integer grouponbasedataid;

    private String grouponbasedataname;

    private String grouponbasedatacode;

    private Integer sort;

    private Integer groupondatacategoryid;

    private String actionurl;

    private Date createdate;

    private Boolean isdelete;

    private String remark;

    public Integer getGrouponbasedataid() {
        return grouponbasedataid;
    }

    public void setGrouponbasedataid(Integer grouponbasedataid) {
        this.grouponbasedataid = grouponbasedataid;
    }

    public String getGrouponbasedataname() {
        return grouponbasedataname;
    }

    public void setGrouponbasedataname(String grouponbasedataname) {
        this.grouponbasedataname = grouponbasedataname == null ? null : grouponbasedataname.trim();
    }

    public String getGrouponbasedatacode() {
        return grouponbasedatacode;
    }

    public void setGrouponbasedatacode(String grouponbasedatacode) {
        this.grouponbasedatacode = grouponbasedatacode == null ? null : grouponbasedatacode.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getGroupondatacategoryid() {
        return groupondatacategoryid;
    }

    public void setGroupondatacategoryid(Integer groupondatacategoryid) {
        this.groupondatacategoryid = groupondatacategoryid;
    }

    public String getActionurl() {
        return actionurl;
    }

    public void setActionurl(String actionurl) {
        this.actionurl = actionurl == null ? null : actionurl.trim();
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