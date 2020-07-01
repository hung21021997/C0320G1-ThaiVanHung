package codegym.com.module2_accountname_wbe.services;

import codegym.com.module2_accountname_wbe.entity.Contract;

import java.util.List;

public interface ContractService {
    void saveContract(Contract contract);

    List<Contract> getAllContract();

    Contract getContractById(Long idContract);

    void deleteContract(Contract contract);
}
