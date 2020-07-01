package codegym.com.module2_accountname_wbe.entity;

import codegym.com.module2_accountname_wbe.validation.customer.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idCustomer;

    @CodeCustomerValid
    @Column(name = "code_customer")
    private String codeCustomer;

    @NameCustomerValid
    @Column(name = "name_customer")
    private String nameCustomer;

    @NameCustomerValid
    @Column(name = "address_customer")
    private String addressCustomer;

    @PhoneCustomerValid
    @Column(name = "phone_customer")
    private String phoneCustomer;

    @CmndCustomerValid
    @Column(name = "cmnd_customer")
    private String cmndCustomer;

    @EmailCustomerValid
    @Column(name = "email_customer")
    private String emailCustomer;

    @DateValid
    @Column(name = "birth_customer")
    private String birthCustomer;

    @Column(name = "is_delete")
    private Boolean isDelete;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    @OneToMany(mappedBy = "customer")
    private Set<Contract> contracts;

    public Customer() {
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getCmndCustomer() {
        return cmndCustomer;
    }

    public void setCmndCustomer(String cmndCustomer) {
        this.cmndCustomer = cmndCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getBirthCustomer() {
        return birthCustomer;
    }

    public void setBirthCustomer(String birthCustomer) {
        this.birthCustomer = birthCustomer;
    }
}
