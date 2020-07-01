package codegym.com.module2_accountname_wbe.services;

import codegym.com.module2_accountname_wbe.entity.Customer;
import codegym.com.module2_accountname_wbe.entity.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();

    Customer getCustomerById(Long id);

    void saveCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Page<Customer> getAllCustomer(Pageable pageable);

    Page<Customer> getAllCustomerByName(Pageable pageable, String nameCustomer, String phoneCustomer);
}
