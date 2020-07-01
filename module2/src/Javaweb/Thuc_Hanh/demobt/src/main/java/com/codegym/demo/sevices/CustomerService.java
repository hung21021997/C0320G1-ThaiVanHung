package com.codegym.demo.sevices;

import com.codegym.demo.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();

    Page<Customer> getAllCustomer(Pageable pageable);

    void saveCustomer(Customer customer);

    Customer getCustomerById(Long id);

    void deleteCustomer(Customer customer);

    Page<Customer> getAllCustomerByName(Pageable pageable, String lastName,String firstName,String nameProvince);

    Customer findById(Long id);

    void save(Customer customer);
}
