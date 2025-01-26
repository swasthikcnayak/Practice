package Practice.lld.questions.HotelManagementSystem;

import java.util.List;

public class Hotel {
    RoomManager roomManager;
    ReservationManager reservationManager;

    public Hotel(RoomManager roomManager, ReservationManager reservationManager) {
        this.roomManager = roomManager;
        this.reservationManager = reservationManager;
    }

    public List<Room> getRoomAvailability(RoomType roomType, int from, int to) {
        return roomManager.getRoomAvailability(roomType, from, to);
    }

    public void reserveRoom(Room room, int from, int to, Customer customer) {
        reservationManager.reserve(room, from, to, customer);
    }
}
