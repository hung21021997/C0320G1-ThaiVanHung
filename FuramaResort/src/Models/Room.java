package Models;

public class Room extends Services {
    private String freeServices;

    public Room() {
    }

    public Room(String nameServices, double useArea, double rentServices, int quantity, int styleServices, String freeServices) {
        super(nameServices, useArea, rentServices, quantity, styleServices);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public void showInfo() {
        System.out.println("Tên dịch vụ: House");
        System.out.println("Diện tích sử dụng: " + this.getUseArea());
        System.out.println("Chi phí thuê: " + this.getRentServices());
        System.out.println("Số lượng người: " + this.getQuantity());
        System.out.println("Kiểu thuê: " + this.getStyleServices());
    }
}
