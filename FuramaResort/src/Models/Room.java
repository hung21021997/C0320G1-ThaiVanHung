package Models;

public class Room extends Services {
    private String freeServices;

    public Room() {
    }

    public Room(String id, String nameServices, String passServices, double useArea, double rentServices, int quantity, String styleServices, String nameAddServices, String freeServices) {
        super(id, nameServices, passServices, useArea, rentServices, quantity, styleServices, nameAddServices);
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
