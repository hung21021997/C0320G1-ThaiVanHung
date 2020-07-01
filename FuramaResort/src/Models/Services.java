package Models;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Objects;
import java.util.Scanner;

public abstract class Services {
    private String id ;
    private String nameServices;
    private String passServices;
    private double useArea = 1.0;
    private double rentServices = 1.0;
    private int quantity = 1;
    private String styleServices;
    private String nameAddServices;


    public Services() {
    }

    public Services(String id, String nameServices, String passServices, double useArea, double rentServices, int quantity, String styleServices, String nameAddServices) {
        this.id = id;
        this.nameServices = nameServices;
        this.passServices = passServices;
        this.useArea = useArea;
        this.rentServices = rentServices;
        this.quantity = quantity;
        this.styleServices = styleServices;
        this.nameAddServices = nameAddServices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getPassServices() {
        return passServices;
    }

    public void setPassServices(String passServices) {
        this.passServices = passServices;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentServices() {
        return rentServices;
    }

    public void setRentServices(double rentServices) {
        this.rentServices = rentServices;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStyleServices() {
        return styleServices;
    }

    public void setStyleServices(String styleServices) {
        this.styleServices = styleServices;
    }

    public String getNameAddServices() {
        return nameAddServices;
    }

    public void setNameAddServices(String nameAddServices) {
        this.nameAddServices = nameAddServices;
    }

    public abstract void showInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Services)) return false;
        Services services = (Services) o;
        return Double.compare(services.getUseArea(), getUseArea()) == 0 &&
                Double.compare(services.getRentServices(), getRentServices()) == 0 &&
                getQuantity() == services.getQuantity() &&
                getId().equals(services.getId()) &&
                getNameServices().equals(services.getNameServices()) &&
                getPassServices().equals(services.getPassServices()) &&
                getStyleServices().equals(services.getStyleServices()) &&
                getNameAddServices().equals(services.getNameAddServices());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNameServices(), getPassServices(), getUseArea(), getRentServices(), getQuantity(), getStyleServices(), getNameAddServices());
    }
}
