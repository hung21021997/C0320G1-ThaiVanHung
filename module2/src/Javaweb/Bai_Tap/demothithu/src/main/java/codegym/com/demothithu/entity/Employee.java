package codegym.com.demothithu.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_employee")
    private Long idEmployee;

    @Column(name = "name_employee")
    private String nameEmployee;

    @Column(name = "address_employee")
    private String addressEmployee;

    @Column(name = "cmnd_employee")
    private String cmndEmployee;

    @Column(name = "email_employee")
    private String emailEmployee;

    @Column(name = "level_employee")
    private String levelEmployee;

    @Column(name = "position_employee")
    private String positionEmployee;

    @OneToMany(mappedBy = "employee")
    private Set<Customers> customers;

    public Employee() {
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public String getCmndEmployee() {
        return cmndEmployee;
    }

    public void setCmndEmployee(String cmndEmployee) {
        this.cmndEmployee = cmndEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public Set<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customers> customers) {
        this.customers = customers;
    }
}
