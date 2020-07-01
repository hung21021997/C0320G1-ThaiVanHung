package codegym.com.module2_accountname_wbe.services.impl;

import codegym.com.module2_accountname_wbe.entity.DetailContract;
import codegym.com.module2_accountname_wbe.repository.DetailContractRepository;
import codegym.com.module2_accountname_wbe.services.DetailContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailContractServiceImpl implements DetailContractService {

    @Autowired
    private DetailContractRepository detailContractRepository;

    @Override
    public List<DetailContract> getAllDetailContract() {

        return detailContractRepository.findAllByIsDeleteIsFalse();
    }

    @Override
    public void saveDetailContract(DetailContract detailContract) {
        detailContract.setDelete(false);
        detailContractRepository.save(detailContract);
    }

    @Override
    public DetailContract getDetailContractById(Long idDetailContract) {
        return detailContractRepository.findByIsDeleteIsFalseAndIdDetailContractIs(idDetailContract);
    }

    @Override
    public void deleteDetailContract(DetailContract detailContract) {
        detailContract.setDelete(true);
        detailContractRepository.save(detailContract);
    }
}
