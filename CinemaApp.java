package org.example;

import java.util.Arrays;

public class CinemaApp {
    private CinemaHall cinemaHall;

    public CinemaApp() {
        this.cinemaHall = new CinemaHall();
    }

    public static void main(String[] args) {
        CinemaApp app = new CinemaApp();
        app.run();
    }

    public void run() {
        cinemaHall.initializeSeats();

        int[] seatsToBook = {5, 6, 7};
        boolean booked = cinemaHall.bookSeats(2, 3, seatsToBook);
        if (booked) {
            System.out.println("Місця успішно заброньовані.");
        } else {
            System.out.println("Певні місця вже заброньовані.");
        }

        cinemaHall.printSeatingArrangement(2);

        cinemaHall.cancelBooking(2, 3, new int[]{6, 7});
        cinemaHall.printSeatingArrangement(2);

        boolean availability = cinemaHall.checkAvailability(2, 4);
        if (availability) {
            System.out.println("Доступно 4 послідовних місця у залі 2.");
        } else {
            System.out.println("Немає доступних 4 послідовних місць у залі 2.");
        }
    }
}

