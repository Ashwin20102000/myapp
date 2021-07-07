class User{
    public String name;
    public String password;
    public String email;
    public Address address;
    public Dob dob;
    User(String name,String password){
        this.name = name;
        this.password = password;
        this.email = "";
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void showProfile(){
        System.out.println("Username : "+this.name);
        System.out.println("Email: "+this.email);
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public void setDob(Dob dob){
        this.dob = dob;
    }
    public void showAddress(){
        System.out.println("DoorNo :" +this.address.doorNo);
        System.out.println("StreetName :" +this.address.streetName);
        System.out.println("Pincode :" +this.address.pincode);
    }
    public  void showDob(){
        System.out.println(this.dob.day+"-"+this.dob.month+"-"+this.dob.year);
    }
}
