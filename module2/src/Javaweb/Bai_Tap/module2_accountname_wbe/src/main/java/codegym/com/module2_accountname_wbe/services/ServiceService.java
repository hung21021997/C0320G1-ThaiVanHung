package codegym.com.module2_accountname_wbe.services;

import codegym.com.module2_accountname_wbe.entity.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceService {

    List<Service> getAllServices();

    void saveService(Service service);

    Service getServiceById(Long idService);

    void deleteService(Service service);

    Page<Service> getAllServicesByName(Pageable pageable, String nameServices, String quantityServices);
}
