package com.kc.demo.model;

import java.sql.Timestamp;
import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private Integer userid;

    private Integer articletypeid;

    private Integer articlestatus;

    private String ip;

    private String location;

    private Integer collectionedcounts;

    private String praisecount;

    private String treadcount;

    private Date createtime;

    private String content;

    private String usernickname;

    private String timeAgo;

    private Integer topicid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getArticletypeid() {
        return articletypeid;
    }

    public void setArticletypeid(Integer articletypeid) {
        this.articletypeid = articletypeid;
    }

    public Integer getArticlestatus() {
        return articlestatus;
    }

    public void setArticlestatus(Integer articlestatus) {
        this.articlestatus = articlestatus;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getCollectionedcounts() {
        return collectionedcounts;
    }

    public void setCollectionedcounts(Integer collectionedcounts) {
        this.collectionedcounts = collectionedcounts;
    }

    public String getPraisecount() {
        return praisecount;
    }

    public void setPraisecount(String praisecount) {
        this.praisecount = praisecount == null ? null : praisecount.trim();
    }

    public String getTreadcount() {
        return treadcount;
    }

    public void setTreadcount(String treadcount) {
        this.treadcount = treadcount == null ? null : treadcount.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUsernickname() { return usernickname;}

    public void setUsernickname(String usernickname) {this.usernickname = usernickname;}

    public String getTimeAgo() {return timeAgo;}

    public void setTimeAgo(String timeAgo) {this.timeAgo = timeAgo;}

    public Integer getTopicid() {return topicid;}

    public void setTopicid(Integer topicid) {this.topicid = topicid;}
}