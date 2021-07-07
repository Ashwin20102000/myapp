class Address{
    public String doorNo;
    public String streetName;
    public String pincode;
    public Address(String doorNo,String streetName,String pincode){
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.pincode = pincode;
    }
    public void setDoorNo(String doorNo){
        this.doorNo = doorNo;
    }
    public void setstreetName(String streetName){
        this.streetName = streetName;
    }  
     public void setPincode(String pincode){
        this.pincode = pincode;
    }
}
