package lld.SplitWise;

public class User {
    private int userId;
    private String name;
    private String email;

    public User(int userId, String name, String email){
        this.userId=userId;
        this.name=name;
        this.email=email;
    }

    public String getEmail(){
        return this.email;
    }
    public int getUserId(){
        return this.userId;
    }
    public String getname(){
        return this.name;
    }
}
