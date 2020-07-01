package codegym.com.module2_accountname_wbe.repository;

import codegym.com.module2_accountname_wbe.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contract,Long> {
    List<Contract> findAllByIsDeleteIsFalse();

    Contract findByIsDeleteIsFalseAndIdContractIs(Long idContract);
}
