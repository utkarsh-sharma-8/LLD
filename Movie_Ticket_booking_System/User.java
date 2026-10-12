package Movie_Ticket_booking_System;

public class User {
    private int id;
    private String name;
    User(int id , String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return this.id;
    }
}
