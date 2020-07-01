package codegym.com.module2_accountname_wbe.entity;

import codegym.com.module2_accountname_wbe.validation.customer.DateValid;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "contracts")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContract;

    @DateValid
    @Column(name = "date_start_contract")
    private String dateStartContract;

    @DateValid
    @Column(name = "date_end_contract")
    private String dateEndContract;

    @Column(name = "deposit_contract")
    private String depositContract;

    @Column(name = "total_contract")
    private  String totalContract;

    @Column(name = "is_delete")
    private Boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "contract")
    private Set<DetailContract> detailContracts;

    public Contract() {
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Set<DetailContract> getDetailContracts() {
        return detailContracts;
    }

    public void setDetailContracts(Set<DetailContract> detailContracts) {
        this.detailContracts = detailContracts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getIdContract() {
        return idContract;
    }

    public void setIdContract(long idContract) {
        this.idContract = idContract;
    }

    public String getDateStartContract() {
        return dateStartContract;
    }

    public void setDateStartContract(String dateStartContract) {
        this.dateStartContract = dateStartContract;
    }

    public String getDateEndContract() {
        return dateEndContract;
    }

    public void setDateEndContract(String dateEndContract) {
        this.dateEndContract = dateEndContract;
    }

    public String getDepositContract() {
        return depositContract;
    }

    public void setDepositContract(String depositContract) {
        this.depositContract = depositContract;
    }

    public String getTotalContract() {
        return totalContract;
    }

    public void setTotalContract(String totalContract) {
        this.totalContract = totalContract;
    }
}
