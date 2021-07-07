  
import java.util.Scanner;

class Main{

    

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    boolean server = true;

    Db db = new Db();

    while(server){
        
        int option;

        do
        { 
            
        System.out.println("1.Signup 2.Login 3.Exit");
        option = scan.nextInt();

        int idc = 0;

        switch(option){
            case 1:
                System.out.println("Enter your Username :");
                String username = scan.next();
                System.out.println("Enter your Password :");
                String password = scan.next();
                System.out.println("Enter your Confrimation Password :");
                String passwordC = scan.next();

                // }while(password!=passwordC);
                while(!password.equals(passwordC)){
                    System.out.println("Password not matching Try again");
                System.out.println("Enter your Password :");
                    
                    password = scan.next();
                System.out.println("Enter your Confrimation Password :");

                    passwordC = scan.next();
                    
                }
                System.out.println("Enter your EmailId :");

                String email = scan.next();
                
                User user1 = new User(username,password);
                
                user1.setEmail(email);

                
                db.addUser(user1);

                System.out.println("Successfully Signup!!");
                
                ++idc;

                System.out.println("Your id for Auth : " + idc);
                break;
            case 2:
                
                System.out.println("Enter your Id :");
                int id =  scan.nextInt();
                User user2 = db.getUser(id);
                System.out.println("Enter your Username :");
                String username1 = scan.next();
                System.out.println("Enter your Password :");
                String password1 = scan.next();
                
                while(!(user2.name.equals(username1)) && !(user2.password.equals(password1))){
                    System.out.println("Kindly Enter correct Info");
                System.out.println("Enter your Username :");
                    
                    username1 = scan.next();
                System.out.println("Enter your Password :");

                    password1 = scan.next();
                }
                
                System.out.println("Successfully Authenticated");

                int options = 0;

                System.out.println("Welcome "+user2.name + "!!");

                do
                { 
                    System.out.println("1.Update DOB 2.Update Address 3.Show Dob 4.Show Address 5.Exit");
                    
                    options = scan.nextInt();

                    switch(options){
                        case 1:
                            System.out.println("Enter the Day :");
                            int day = scan.nextInt();
                            System.out.println("Enter the Month :");
                            int month = scan.nextInt();
                            System.out.println("Enter the Year :");
                            int year = scan.nextInt();

                            Dob dob = new Dob(day,month,year);
                            user2.setDob(dob);
                            break;

                        case 2:
                        System.out.println("Enter the doorNo :");
                          String doorNo = scan.next();
                        System.out.println("Enter the StreetName :");

                         String streetName = scan.next();
                         System.out.println("Enter the Pincode :");

                         String pincode = scan.next();
                         
                         Address address = new Address(doorNo,streetName,pincode);
                         user2.setAddress(address);
                         break;
                         
                         case 3:
                         user2.showDob();
                         break;
                         case 4:
                            user2.showAddress();
                            break;
                    }

                }while(options!=5);
                break;

            case 3:
                break;
        }

    }while(option!=3);


    }



    }
}
