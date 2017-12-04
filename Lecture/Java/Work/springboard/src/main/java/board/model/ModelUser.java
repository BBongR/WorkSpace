package board.model;

import java.util.Date;

public class ModelUser {
    
    private Integer userno    = null;
    private String  userid    = "";
    private String  email     = "";
    private String  passwd    = "";
    private String  name      = "";
    private String  mobile    = "";
    private Boolean retireYN  = null;
    private String  InsertUID = "";
    private Date    InsertDT  = null;
    private String  UpdateUID = null;
    private Date    UpdateDT  = null;
    
    // getter & setter
    public Integer getUserno() {
        return userno;
    }
    
    public void setUserno(Integer userno) {
        this.userno = userno;
    }
    
    public String getUserid() {
        return userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPasswd() {
        return passwd;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public Boolean getRetireYN() {
        return retireYN;
    }
    
    public void setRetireYN(Boolean retireYN) {
        this.retireYN = retireYN;
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
    
    // constructor
    public ModelUser() {
        super();
    }
    
    // toString
    @Override
    public String toString() {
        return "ModelUser [userno=" + userno + ", userid=" + userid + ", email="
                + email + ", passwd=" + passwd + ", name=" + name + ", mobile="
                + mobile + ", retireYN=" + retireYN + ", InsertUID=" + InsertUID
                + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID
                + ", UpdateDT=" + UpdateDT + "]";
    }
}
