package codegym.com.module2_accountname_wbe.entity;

import codegym.com.module2_accountname_wbe.validation.customer.AmountValid;
import codegym.com.module2_accountname_wbe.validation.customer.NameCustomerValid;

import javax.persistence.*;

@Entity
@Table(name = "detail_contracts")
public class DetailContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idDetailContract;

    @AmountValid
    @Column(name = "amount_contract")
    private String amountContract;

    @Column(name = "attach_service")
    private String attachService;

    @Column(name = "is_delete")
    private Boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;

    public DetailContract() {
    }

    public String getAttachService() {
        return attachService;
    }

    public void setAttachService(String attachService) {
        this.attachService = attachService;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public long getIdDetailContract() {
        return idDetailContract;
    }

    public void setIdDetailContract(long idDetailContract) {
        this.idDetailContract = idDetailContract;
    }

    public String getAmountContract() {
        return amountContract;
    }

    public void setAmountContract(String amountContract) {
        this.amountContract = amountContract;
    }
}
