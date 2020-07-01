package Models;

import Libs.Customer;

import java.util.LinkedList;
import java.util.Queue;

public class BookingCinema4DServicesImpl implements BookingCinema4DServices {
    private static Queue<Customer> customers = new LinkedList<>();
    @Override
    public void addBookingCinema(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Queue<Customer> getAllBookingCinema() {
        return customers;
    }
}
