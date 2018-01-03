package com.spring61.rest.model;

import java.sql.Date;

import javax.print.DocFlavor.BYTE_ARRAY;

public class ModelAttachFile {
    
    private Integer    attachfileno = 0;
    private String     filename     = "";
    private String     filetype     = "";
    private Integer    filesize     = 0;
    private Integer    articleno    = 0;
    private Boolean    UseYN        = null;
    private String     InsertUID    = "";
    private String       InsertDT     = null;
    private String     UpdateUID    = "";
    private String       UpdateDT     = null;
    private BYTE_ARRAY imageData    = null;
    
    // 생성자
    public ModelAttachFile() {
        super();
    }
    
    // getter & setter
    
    public Integer getAttachfileno() {
        return attachfileno;
    }
    
    public void setAttachfileno(Integer attachfileno) {
        this.attachfileno = attachfileno;
    }
    
    public String getFilename() {
        return filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public String getFiletype() {
        return filetype;
    }
    
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    
    public Integer getFilesize() {
        return filesize;
    }
    
    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }
    
    public Integer getArticleno() {
        return articleno;
    }
    
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
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
    
    public String getInsertDT() {
        return InsertDT;
    }
    
    public void setInsertDT(String date) {
        InsertDT = date;
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
    
    public BYTE_ARRAY getImageData() {
        return imageData;
    }
    
    public void setImageData(BYTE_ARRAY imageData) {
        this.imageData = imageData;
    }

    // toString
    @Override
    public String toString() {
        return "Modelattachfile [attachfileno=" + attachfileno + ", filename="
                + filename + ", filetype=" + filetype + ", filesize=" + filesize
                + ", articleno=" + articleno + ", UseYN=" + UseYN
                + ", InsertUID=" + InsertUID + ", InsertDT=" + InsertDT
                + ", UpdateUID=" + UpdateUID + ", UpdateDT=" + UpdateDT
                + ", imageData=" + imageData + "]";
    }
}
