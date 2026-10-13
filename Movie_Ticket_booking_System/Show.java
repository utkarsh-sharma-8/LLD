package Movie_Ticket_booking_System;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Show {
    private int id;
    private Movie movie;
    private Screen screen;
    private LocalDateTime startTime;
    private Map<Integer, ShowSeat> map = new HashMap<>();
    public Show(int id,Movie movie,Screen screen,LocalDateTime startTime,double basePrice){
        this.id=id;
        this.movie = movie;
        this.screen=screen;
        this.startTime=startTime;
        for(Seat seat : screen.getSeats()){
            double price = switch(seat.getSeatType()){
                case REGULAR -> basePrice;
                case PREMIUM -> basePrice+100;
                case RECLINER -> basePrice+200;
            };
            map.put(seat.getId(),new ShowSeat(seat,price));
        }
    }
    public int getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public Collection<ShowSeat> getShowSeats() {
        return Collections.unmodifiableCollection(map.values());
    }
    public ShowSeat getShowSeat(String seatId) {
        throw new UnsupportedOperationException("Unimplemented method 'getShowSeat'");
    }
}
