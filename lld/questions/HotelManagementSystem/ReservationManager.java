package Practice.lld.questions.HotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    int incrementalReservationId;
    List<Reservation> reservationList;
    private RoomManager roomManager;


    ReservationManager(RoomManager roomManager){
        this.roomManager = roomManager;  
        incrementalReservationId = 0;
        reservationList = new ArrayList<>();
    } 
    
    public Reservation reserve(Room room, int from, int to, Customer customer) {
        int cost = roomManager.getPrice(room, from, to);
        Reservation reservation = new Reservation(room, from, to, cost, customer, incrementalReservationId);
        incrementalReservationId++;
        reservationList.add(reservation);
        return reservation;
    }
}
