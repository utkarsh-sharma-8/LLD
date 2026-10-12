package Movie_Ticket_booking_System;

public class Movie{
    private int id;
    private String title;
    private int duration;

    public Movie(int id, String title, int duration){
        this.id=id;
        this.duration=duration;
        this.title=title;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public int duration(){
        return duration;
    }
}