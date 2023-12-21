package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CinemaHallTest {

    @Test
    public void testBookingSeats() {
        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.initializeSeats();

        int[] seatsToBook = {5, 6, 7};
        assertTrue(cinemaHall.bookSeats(2, 3, seatsToBook));

        int[] alreadyBookedSeats = {6, 7};
        assertFalse(cinemaHall.bookSeats(2, 3, alreadyBookedSeats));
    }

    @Test
    public void testCancelBooking() {
        CinemaHall cinemaHall = new CinemaHall();
        cinemaHall.initializeSeats();

        int[] seatsToBook = {5, 6, 7};
        cinemaHall.bookSeats(2, 3, seatsToBook);

        int[] seatsToCancel = {6, 7};
        cinemaHall.cancelBooking(2, 3, seatsToCancel);

        int[][][] hallArrangement = cinemaHall.getCinemaHall();
        assertEquals(0, hallArrangement[2][3][6]);
        assertEquals(0, hallArrangement[2][3][7]);
    }

}
