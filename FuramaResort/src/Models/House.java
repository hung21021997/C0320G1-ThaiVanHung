package Models;

public class House extends Services {
    private String standardRoomHouse = "vip";
    private String comfortsHouse;
    private int numberStoriesHouse = 1;

    public House() {
    }

    public House(String id, String nameServices, String passServices, double useArea, double rentServices, int quantity, String styleServices, String nameAddServices, String standardRoomHouse, String comfortsHouse, int numberStoriesHouse) {
        super(id, nameServices, passServices, useArea, rentServices, quantity, styleServices, nameAddServices);
        this.standardRoomHouse = standardRoomHouse;
        this.comfortsHouse = comfortsHouse;
        this.numberStoriesHouse = numberStoriesHouse;
    }

    public String getStandardRoomHouse() {
        return standardRoomHouse;
    }

    public void setStandardRoomHouse(String standardRoomHouse) {
        this.standardRoomHouse = standardRoomHouse;
    }

    public String getComfortsHouse() {
        return comfortsHouse;
    }

    public void setComfortsHouse(String comfortsHouse) {
        this.comfortsHouse = comfortsHouse;
    }

    public int getNumberStoriesHouse() {
        return numberStoriesHouse;
    }

    public void setNumberStoriesHouse(int numberStoriesHouse) {
        this.numberStoriesHouse = numberStoriesHouse;
    }

    @Override
    public void showInfo() {
        System.out.println("Tên dịch vụ: House");
        System.out.println("Diện tích sử dụng: " + this.getUseArea());
        System.out.println("Chi phí thuê: " + this.getRentServices());
        System.out.println("Số lượng người: " + this.getQuantity());
        System.out.println("Kiểu thuê: " + this.getStyleServices());
        System.out.println("Tiêu chuẩn phòng: " + this.getStandardRoomHouse());
        System.out.println("Tiện nghi: " + this.getComfortsHouse());
        System.out.println("Số tầng: " + this.getNumberStoriesHouse());
    }
}
