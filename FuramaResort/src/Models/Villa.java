package Models;

public class Villa extends Services {
    private String standardRoomVilla = "vip";
    private double poolArea = 1.0;
    private int numberStoriesVilla =1;
    private String comfortsVilla;

    public Villa() {
    }

    public Villa(String id, double useArea, double rentServices, int quantity, int styleServices, String standardRoomVilla, double poolArea, int numberStoriesVilla, String comfortsVilla) {
        super(id, useArea, rentServices, quantity, styleServices);
        this.standardRoomVilla = standardRoomVilla;
        this.poolArea = poolArea;
        this.numberStoriesVilla = numberStoriesVilla;
        this.comfortsVilla = comfortsVilla;
    }

    public String getStandardRoomVilla() {
        return standardRoomVilla;
    }

    public void setStandardRoomVilla(String standardRoomVilla) {
        this.standardRoomVilla = standardRoomVilla;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberStoriesVilla() {
        return numberStoriesVilla;
    }

    public void setNumberStoriesVilla(int numberStoriesVilla) {
        this.numberStoriesVilla = numberStoriesVilla;
    }

    public String getComfortsVilla() {
        return comfortsVilla;
    }

    public void setComfortsVilla(String comfortsVilla) {
        this.comfortsVilla = comfortsVilla;
    }

    @Override
    public void showInfo() {
        System.out.println("Tên dịch vụ: Villa");
        System.out.println("Diện tích sử dụng: " + this.getUseArea());
        System.out.println("Chi phí thuê: " + this.getRentServices());
        System.out.println("Số lượng người: " + this.getQuantity());
        System.out.println("Kiểu thuê: " + this.getStyleServices());
        System.out.println("Tiêu chuẩn phòng: " + this.getStandardRoomVilla());
        System.out.println("Diện tích hồ bơi: " + this.getPoolArea());
        System.out.println("Tiện nghi: " + this.getComfortsVilla());
        System.out.println("Số tầng: " + this.getNumberStoriesVilla());
    }
}
