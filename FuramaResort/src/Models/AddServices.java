package Models;

public class AddServices {
    private String nameAddServices = "karaoke";
    private int amountServices =1;
    private double moneyServices =1.0;

    public AddServices() {
    }

    public AddServices(String nameAddServices, int amountServices, double moneyServices) {
        this.nameAddServices = nameAddServices;
        this.amountServices = amountServices;
        this.moneyServices = moneyServices;
    }

    public String getNameAddServices() {
        return nameAddServices;
    }

    public void setNameAddServices(String nameAddServices) {
        this.nameAddServices = nameAddServices;
    }

    public int getAmountServices() {
        return amountServices;
    }

    public void setAmountServices(int amountServices) {
        this.amountServices = amountServices;
    }

    public double getMoneyServices() {
        return moneyServices;
    }

    public void setMoneyServices(double moneyServices) {
        this.moneyServices = moneyServices;
    }
}
