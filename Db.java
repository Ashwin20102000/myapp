import java.util.*;
class Db{   
    public ArrayList<User> users;

    Db(){
        this.users = new ArrayList<User>();
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public User getUser(int id){
        return this.users.get(id-1);
    }
    public void showUser(User user){
        System.out.println(user.name + " " + user.password + " " + user.email);
    }
}