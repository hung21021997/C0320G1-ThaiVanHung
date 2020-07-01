package codegym.com.module2_accountname_wbe.repository;

import codegym.com.module2_accountname_wbe.entity.Customer;
import codegym.com.module2_accountname_wbe.entity.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service,Long> {
    List<Service> findAllByIsDeleteIsFalse();

    Service findByIsDeleteIsFalseAndIdServicesIs(Long idService);

    Page<Service> findAllByIsDeleteIsFalseAndNameServicesContainingAndQuantityServicesContaining(Pageable pageable, String nameServices, String quantityServices);
}
