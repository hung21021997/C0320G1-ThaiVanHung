package codegym.com.demothithu.entity;

import javax.naming.Name;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_customer")
    private Long idCustomer;

    @Column(name = "name_customer")
    private String nameCustomer;

    @Column(name = "code_customer")
    private String codeCustomer;

    @Column(name = "birth_customer")
    private String birthCustomer;

    @Column(name = "address_customer")
    private String addressCustomer;

    @Column(name = "cmnd_customer")
    private String cmndCustomer;

    @Column(name = "phone_customer")
    private String phoneCustomer;

    @Column(name = "emailCustomer")
    private String emailCustomer;

    @ManyToOne
    @JoinColumn(name="id_employee")
    private Employee employee;

    public Customers() {
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getBirthCustomer() {
        return birthCustomer;
    }

    public void setBirthCustomer(String birthCustomer) {
        this.birthCustomer = birthCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getCmndCustomer() {
        return cmndCustomer;
    }

    public void setCmndCustomer(String cmndCustomer) {
        this.cmndCustomer = cmndCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
