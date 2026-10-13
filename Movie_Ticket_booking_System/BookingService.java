package Movie_Ticket_booking_System;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import Movie_Ticket_booking_System.Enums.BookingStatus;
import Movie_Ticket_booking_System.Enums.SeatStatus;

public class BookingService {
    private AtomicInteger bookingIds = new AtomicInteger(1);
    public Booking bookSeats(User user , Show show,List<String> seatIds){
        if(seatIds == null || seatIds.isEmpty()){
            throw new IllegalArgumentException("Select At Least One Seat");
        }
        if(seatIds == null || seatIds.isEmpty()){
            throw new IllegalArgumentException("Select At Least One Seat");
        }
        if (new HashSet<>(seatIds).size() != seatIds.size()) {
            throw new IllegalArgumentException("Duplicate seat selection");
        }
        synchronized (show) {
            List<ShowSeat> selectedSeats = new ArrayList<>();
            double total = 0;

            // Validate every seat before changing any seat.
            for (String seatId : seatIds) {
                ShowSeat seat = show.getShowSeat(seatId);

                if (seat == null ||
                    seat.showSeatStatus() != SeatStatus.AVAILABLE) {
                    throw new IllegalStateException(
                        "Seat unavailable: " + seatId
                    );
                }

                selectedSeats.add(seat);
                total += seat.getPrice();
            }

            // Lock all selected seats.
            for (ShowSeat seat : selectedSeats) {
                seat.lock();
            }
        }
    }

    public void cancelBooking(Booking booking) {
        synchronized (booking.getShow()) {
            if (booking.getStatus() != BookingStatus.CONFIRMED) {
                throw new IllegalStateException(
                    "Only confirmed bookings can be cancelled"
                );
            }

            booking.getSeats().forEach(ShowSeat::release);
            booking.cancel();
        }
    }
}
