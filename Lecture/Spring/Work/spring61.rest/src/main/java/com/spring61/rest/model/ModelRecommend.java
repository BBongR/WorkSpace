package com.spring61.rest.model;

public class ModelRecommend {
    
    private String  userid    = "";
    private Integer articleno = 0;
    private Boolean good      = null;
    private Boolean bad       = null;
    
    // 생성자
    public ModelRecommend() {
        super();
    }
    
    // getter & setter
    public String getUserid() {
        return userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    public Integer getArticleno() {
        return articleno;
    }
    
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    
    public Boolean getGood() {
        return good;
    }
    
    public void setGood(Boolean good) {
        this.good = good;
    }
    
    public Boolean getBad() {
        return bad;
    }
    
    public void setBad(Boolean bad) {
        this.bad = bad;
    }
    
    // toString
    @Override
    public String toString() {
        return "ModelRecommend [userid=" + userid + ", articleno=" + articleno
                + ", good=" + good + ", bad=" + bad + "]";
    }
}
