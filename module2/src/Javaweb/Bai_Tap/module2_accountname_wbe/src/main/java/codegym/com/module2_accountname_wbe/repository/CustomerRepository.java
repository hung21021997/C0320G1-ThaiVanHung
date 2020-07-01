package codegym.com.module2_accountname_wbe.repository;

import codegym.com.module2_accountname_wbe.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findAllByIsDeleteIsFalse();

//    @Query(value = "select * from customers where is_delete=false and id_customer = ?1", nativeQuery = true)
    Customer findByIsDeleteIsFalseAndIdCustomerIs(Long id);

    Page<Customer> findAllByIsDeleteIsFalse(Pageable pageable);

    Page<Customer> findAllByIsDeleteIsFalseAndNameCustomerContainingAndPhoneCustomerContaining(Pageable pageable, String nameCustomer, String phoneCustomer);
}
