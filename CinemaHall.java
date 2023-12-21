package org.example;

public class CinemaHall {
    private int[][][] cinemaHall;

    public CinemaHall() {
        this.cinemaHall = new int[5][10][20];
    }
    public int[][][] getCinemaHall() {
        return cinemaHall;
    }
    public void initializeSeats() {
        for (int i = 0; i < cinemaHall.length; i++) {
            for (int j = 0; j < cinemaHall[i].length; j++) {
                for (int k = 0; k < cinemaHall[i][j].length; k++) {
                    cinemaHall[i][j][k] = 0;
                }
            }
        }
    }

    public boolean bookSeats(int hallNumber, int row, int[] seats) {
        for (int seat : seats) {
            if (cinemaHall[hallNumber][row][seat] == 0) {
                cinemaHall[hallNumber][row][seat] = 1;
            } else {
                return false;
            }
        }
        return true;
    }

    public void cancelBooking(int hallNumber, int row, int[] seats) {
        for (int seat : seats) {
            cinemaHall[hallNumber][row][seat] = 0;
        }
    }

    public boolean checkAvailability(int screen, int numSeats) {
        for (int i = 0; i < cinemaHall[screen].length; i++) {
            int count = 0;
            for (int j = 0; j < cinemaHall[screen][i].length; j++) {
                if (cinemaHall[screen][i][j] == 0) {
                    count++;
                    if (count == numSeats) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public void printSeatingArrangement(int hallNumber) {
        System.out.println("Схема залу " + hallNumber + ":");
        for (int i = 0; i < cinemaHall[hallNumber].length; i++) {
            for (int j = 0; j < cinemaHall[hallNumber][i].length; j++) {
                System.out.print(cinemaHall[hallNumber][i][j] + " ");
            }
            System.out.println();
        }
    }
}

