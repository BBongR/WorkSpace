package com.spring61.rest.model;

import java.sql.Date;

public class ModelArticle {
    
    private Integer articleno = 0;
    private String  boardcd   = "";
    private String  title     = "";
    private String  content   = "";
    private String  email     = "";
    private Integer hit       = 0;
    private Date    regdate   = null;
    private Integer countgood = 0;
    private Integer countbad  = 0;
    private Boolean UseYN     = null;
    private String  InsertUID = "";
    private Date    InsertDT  = null;
    private String  UpdateUID = "";
    private String    UpdateDT  = null;
    
    // 생성자
    public ModelArticle() {
        super();
    }
    
    // getter & setter
    public Integer getArticleno() {
        return articleno;
    }
    
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    
    public String getBoardcd() {
        return boardcd;
    }
    
    public void setBoardcd(String boardcd) {
        this.boardcd = boardcd;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Integer getHit() {
        return hit;
    }
    
    public void setHit(Integer hit) {
        this.hit = hit;
    }
    
    public Date getRegdate() {
        return regdate;
    }
    
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
    
    public Integer getCountgood() {
        return countgood;
    }
    
    public void setCountgood(Integer countgood) {
        this.countgood = countgood;
    }
    
    public Integer getCountbad() {
        return countbad;
    }
    
    public void setCountbad(Integer countbad) {
        this.countbad = countbad;
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
    
    public String getUpdateDT() {
        return UpdateDT;
    }
    
    public void setUpdateDT(String updateDT) {
        UpdateDT = updateDT;
    }
    
    // toString
    @Override
    public String toString() {
        return "Modelarticle [articleno=" + articleno + ", boardcd=" + boardcd
                + ", title=" + title + ", content=" + content + ", email="
                + email + ", hit=" + hit + ", regdate=" + regdate
                + ", countgood=" + countgood + ", countbad=" + countbad
                + ", UseYN=" + UseYN + ", InsertUID=" + InsertUID
                + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID
                + ", UpdateDT=" + UpdateDT + "]";
    }
}
