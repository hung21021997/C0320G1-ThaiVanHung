package codegym.com.module2_accountname_wbe.repository;

import codegym.com.module2_accountname_wbe.entity.DetailContract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailContractRepository extends JpaRepository<DetailContract,Long> {
    List<DetailContract> findAllByIsDeleteIsFalse();

    DetailContract findByIsDeleteIsFalseAndIdDetailContractIs(Long idDetailContract);
}
