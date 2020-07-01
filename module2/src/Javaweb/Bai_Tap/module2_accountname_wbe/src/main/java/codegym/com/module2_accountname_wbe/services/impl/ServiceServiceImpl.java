package codegym.com.module2_accountname_wbe.services.impl;

import codegym.com.module2_accountname_wbe.repository.ServiceRepository;
import codegym.com.module2_accountname_wbe.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<codegym.com.module2_accountname_wbe.entity.Service> getAllServices() {
        return serviceRepository.findAllByIsDeleteIsFalse();
    }

    @Override
    public void saveService(codegym.com.module2_accountname_wbe.entity.Service service) {
        service.setDelete(false);
        serviceRepository.save(service);
    }


    @Override
    public codegym.com.module2_accountname_wbe.entity.Service getServiceById(Long idService) {
        return serviceRepository.findByIsDeleteIsFalseAndIdServicesIs(idService);
    }

    @Override
    public void deleteService(codegym.com.module2_accountname_wbe.entity.Service service) {
        service.setDelete(true);
        serviceRepository.save(service);
    }

    @Override
    public Page<codegym.com.module2_accountname_wbe.entity.Service> getAllServicesByName(Pageable pageable, String nameService, String quantityServices) {
        pageable = PageRequest.of(pageable.getPageNumber(),3, Sort.by("nameServices"));
        return serviceRepository.findAllByIsDeleteIsFalseAndNameServicesContainingAndQuantityServicesContaining(pageable, nameService, quantityServices);
    }


}
