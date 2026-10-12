package Movie_Ticket_booking_System;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {
    private List<Screen> screens = new ArrayList<>();
    private String location;
    private String name;
    private int id;

    public Theatre(int id , String location, String name){
        this.id=id;
        this.location=location;
        this.name=name;
    }

    public void addScreen(Screen screen){
        this.screens.add(screen);
    }
    public List<Screen> getScreens(){
        return Collections.unmodifiableList(screens);
    }
    public String getLocation(){
        return this.location;
    }
    public String getname(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
}
