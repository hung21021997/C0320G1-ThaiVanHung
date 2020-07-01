package codegym.com.module2_accountname_wbe.services;

import codegym.com.module2_accountname_wbe.entity.DetailContract;

import java.util.List;

public interface DetailContractService {
    List<DetailContract> getAllDetailContract();

    void saveDetailContract(DetailContract detailContract);


    DetailContract getDetailContractById(Long idDetailContract);

    void deleteDetailContract(DetailContract detailContract);
}
