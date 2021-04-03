//George Marais Gr12 IT PAT - Infosave
public class info {
    
    private Integer ID;
    private String FirstName;
    private String LastName;
    private String IDNum;
    private String PassportNum;
    private String PhoneNum;
    private String Email;
    private String Address;
    private Integer CID;
    
    //creates blank constructor info
    public info() {}
    
    //creates constructor info with parameters
    public info(Integer ID, String FirstName, String LastName, String IDNum, String PassportNum, String PhoneNum, String Email, String Address, Integer CID) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.IDNum = IDNum;
        this.PassportNum = PassportNum;
        this.PhoneNum = PhoneNum;
        this.Email = Email;
        this.Address = Address;
        this.CID = CID;
    }
    //returns CID
    public Integer getCID() {
        return CID;
    }
    //assigns value to CID
    public void setCID(Integer CID) {
        this.CID = CID;
    }
    //returns ID
    public Integer getID() {
        return ID;
    }
    //assigns value to ID
    public void setID(Integer ID) {
        this.ID = ID;
    }
    //returns FirstName
    public String getFirstName() {
        return FirstName;
    }
    //assigns value to FirstName
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    //returns LastName
    public String getLastName() {
        return LastName;
    }
    //assigns value to LastName
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    //returns IDNum
    public String getIDNum() {
        return IDNum;
    }
    //assigns value to IDNum
    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }
    //returns PassportNum
    public String getPassportNum() {
        return PassportNum;
    }
    //assigns value to PassportNum
    public void setPassportNum(String PassportNum) {
        this.PassportNum = PassportNum;
    }
    //returns PhoneNum
    public String getPhoneNum() {
        return PhoneNum;
    }
    //assigns value to PhoneNum
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }
    //returns Email
    public String getEmail() {
        return Email;
    }
    //assigns value to Email
    public void setEmail(String Email) {
        this.Email = Email;
    }
    //returns Address
    public String getAddress() {
        return Address;
    }
    //assigns value to Address
    public void setAddress(String Address) {
        this.Address = Address;
    }    
}
