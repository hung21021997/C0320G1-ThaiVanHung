package Models;

import Libs.Customer;

import java.util.Queue;

public interface BookingCinema4DServices {
    void addBookingCinema(Customer customer);
    Queue<Customer>getAllBookingCinema();
}
