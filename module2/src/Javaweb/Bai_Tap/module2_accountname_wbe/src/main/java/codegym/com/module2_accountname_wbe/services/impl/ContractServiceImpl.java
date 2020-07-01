package codegym.com.module2_accountname_wbe.services.impl;
import codegym.com.module2_accountname_wbe.entity.Contract;
import codegym.com.module2_accountname_wbe.repository.ContractRepository;
import codegym.com.module2_accountname_wbe.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractRepository contractRepository;

    @Override
    public void saveContract(Contract contract) {
        contract.setDelete(false);
        contractRepository.save(contract);
    }

    @Override
    public List<Contract> getAllContract() {
        return contractRepository.findAllByIsDeleteIsFalse();
    }

    @Override
    public Contract getContractById(Long idContract) {
        return contractRepository.findByIsDeleteIsFalseAndIdContractIs(idContract);
    }

    @Override
    public void deleteContract(Contract contract) {
        contract.setDelete(true);
        contractRepository.save(contract);
    }
}
