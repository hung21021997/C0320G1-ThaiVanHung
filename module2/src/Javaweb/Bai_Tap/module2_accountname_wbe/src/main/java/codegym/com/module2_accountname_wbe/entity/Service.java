package codegym.com.module2_accountname_wbe.entity;


import codegym.com.module2_accountname_wbe.validation.customer.AmountValid;
import codegym.com.module2_accountname_wbe.validation.customer.NameCustomerValid;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idServices;

    @NameCustomerValid
    @Column(name = "name_services")
    private String nameServices;

    @Column(name = "area_services")
    private String areaServices;

    @AmountValid
    @Column(name = "storey_services")
    private String storeyServices;

    @AmountValid
    @Column(name = "quantity_services")
    private String quantityServices;

    @Column(name = "rent_hire_services")
    private String rentHireServices;

    @Column(name = "state_services")
    private String stateServices;

    @Column(name = "is_delete")
    private Boolean isDelete;

    @OneToMany(mappedBy = "service")
    private Set<Customer> customers;

    public Service() {
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public long getIdServices() {
        return idServices;
    }

    public void setIdServices(long idServices) {
        this.idServices = idServices;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getAreaServices() {
        return areaServices;
    }

    public void setAreaServices(String areaServices) {
        this.areaServices = areaServices;
    }

    public String getStoreyServices() {
        return storeyServices;
    }

    public void setStoreyServices(String storeyServices) {
        this.storeyServices = storeyServices;
    }

    public String getQuantityServices() {
        return quantityServices;
    }

    public void setQuantityServices(String quantityServices) {
        this.quantityServices = quantityServices;
    }

    public String getRentHireServices() {
        return rentHireServices;
    }

    public void setRentHireServices(String rentHireServices) {
        this.rentHireServices = rentHireServices;
    }

    public String getStateServices() {
        return stateServices;
    }

    public void setStateServices(String stateServices) {
        this.stateServices = stateServices;
    }
}
