package com.spring61.rest.model;

import java.sql.Date;

public class ModelComments {
    
    private Integer commentno = 0;
    private Integer articleno = 0;
    private String  email     = "";
    private String  memo      = "";
    private String  regdate   = null;
    private Boolean UseYN     = null;
    private String  InsertUID = "";
    private Date    InsertDT  = null;
    private String  UpdateUID = "";
    private Date    UpdateDT  = null;
    
    // 생성자
    public ModelComments() {
        super();
    }
    // getter & setter
    
    public Integer getCommentno() {
        return commentno;
    }


    public void setCommentno(Integer commentno) {
        this.commentno = commentno;
    }

    

    public Integer getArticleno() {
        return articleno;
    }

    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getMemo() {
        return memo;
    }
    
    public void setMemo(String memo) {
        this.memo = memo;
    }
    
    public String getRegdate() {
        return regdate;
    }
    
    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }
    
    public Boolean getUseYN() {
        return UseYN;
    }
    
    public void setUseYN(Boolean useYN) {
        UseYN = useYN;
    }
    
    public String getInsertUID() {
        return InsertUID;
    }
    
    public void setInsertUID(String insertUID) {
        InsertUID = insertUID;
    }
    
    public Date getInsertDT() {
        return InsertDT;
    }
    
    public void setInsertDT(Date insertDT) {
        InsertDT = insertDT;
    }
    
    public String getUpdateUID() {
        return UpdateUID;
    }
    
    public void setUpdateUID(String updateUID) {
        UpdateUID = updateUID;
    }
    
    public Date getUpdateDT() {
        return UpdateDT;
    }
    
    public void setUpdateDT(Date updateDT) {
        UpdateDT = updateDT;
    }
    
    // toString
    @Override
    public String toString() {
        return "Modelcomments [commentno=" + commentno + ", articleno="
                + articleno + ", email=" + email + ", memo=" + memo
                + ", regdate=" + regdate + ", UseYN=" + UseYN + ", InsertUID="
                + InsertUID + ", InsertDT=" + InsertDT + ", UpdateUID="
                + UpdateUID + ", UpdateDT=" + UpdateDT + "]";
    }
}
