package Models;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.Scanner;

public abstract class Services {
    private String id = "Villa";
    private double useArea = 1.0;
    private double rentServices = 1.0;
    private int quantity = 1;
    private int styleServices = 1;

    public Services() {
    }

    public Services(String id, double useArea, double rentServices, int quantity, int styleServices) {
        this.id = id;
        this.useArea = useArea;
        this.rentServices = rentServices;
        this.quantity = quantity;
        this.styleServices = styleServices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getStyleServices() {
        return styleServices;
    }

    public void setStyleServices(int styleServices) {
        this.styleServices = styleServices;
    }

    public abstract void showInfo();
}
