package codegym.com.module2_accountname_wbe.services.impl;

import codegym.com.module2_accountname_wbe.entity.Customer;
import codegym.com.module2_accountname_wbe.repository.CustomerRepository;
import codegym.com.module2_accountname_wbe.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAllByIsDeleteIsFalse();
    }

    @Override
    public Customer getCustomerById(Long idCustomer) {
        return customerRepository.findByIsDeleteIsFalseAndIdCustomerIs(idCustomer);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customer.setDelete(false);
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customer.setDelete(true);
        customerRepository.save(customer);
    }

    @Override
    public Page<Customer> getAllCustomer(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(),4, Sort.by("codeCustomer"));
        return customerRepository.findAllByIsDeleteIsFalse(pageable);
    }

    @Override
    public Page<Customer> getAllCustomerByName(Pageable pageable, String nameCustomer, String phoneCustomer) {
        pageable = PageRequest.of(pageable.getPageNumber(),3,Sort.by("codeCustomer"));
        return customerRepository.findAllByIsDeleteIsFalseAndNameCustomerContainingAndPhoneCustomerContaining(pageable,nameCustomer,phoneCustomer);
    }
}
