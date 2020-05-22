package Controllers;

import Commons.FuncFileCSV;
import Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    private static ArrayList<Villa> listVilla = new ArrayList<Villa>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MainController mainController = new MainController();
        mainController.displayMainMenu();


    }
    public void displayMainMenu(){
        System.out.println("----------MENU----------");
        System.out.println("1. Add New Services\n"
                + "2. Show Services\n"
                + "3. Add New Customer\n"
                + "4. Show Information of Customer\n"
                + "5. Add New Booking\n"
                + "6. Show Information of Employee\n"
                + "7. Exit\n");

        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Vui lòng chọn chức năng: ");
            choice = Integer.parseInt(input.nextLine());
        } while (choice<1 || choice>7);
        switch (choice) {
            case 1: {
                addNewServices();
                break;
            }
            case 2: {
                showServices();
                break;
            }
            case 7: {
                System.exit(0);
            }
            default: {
                System.out.println("Fail! Please choice again ! Enter to continue...");
                input.nextLine();
                displayMainMenu();
            }
        }

    }
    public void addNewServices(){
        System.out.println("----------AddNew----------");
        System.out.println("1. Add New Villa\n"
                + "2. Add New House\n"
                + "3. Add New Room\n"
                + "4. Back to menu\n"
                + "5. Exit");

        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Vui lòng chọn trình đơn: ");
            choose = Integer.parseInt(sc.nextLine());
        }while (choose>5||choose<1);
        switch (choose){
            case 1:{
                addNewVilla();
            }
            case 5:{
                System.exit(0);
            }
            default: {
                System.out.println("Fail! Please choose again ! Enter to continue...");
                sc.nextLine();
                addNewServices();
            }
        }
    }

    private void addNewVilla() {
        Scanner sc = new Scanner(System.in);
        Villa villa = new Villa();
        System.out.println("Enter id: ");
        villa.setId(sc.nextLine());
        System.out.println("Enter UseArea: ");
        villa.setUseArea(Double.parseDouble(sc.nextLine()));
        System.out.println("Enter RentServices: ");
        villa.setRentServices(Double.parseDouble(sc.nextLine()));
        System.out.println("Enter Quantity: ");
        villa.setQuantity(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter StyleServices: ");
        villa.setStyleServices(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter StandardRoomVilla: ");
        villa.setStandardRoomVilla(sc.nextLine());
        System.out.println("Enter PoolArea: ");
        villa.setPoolArea(Double.parseDouble(sc.nextLine()));
        System.out.println("Enter ComfortsVilla: ");
        villa.setComfortsVilla(sc.nextLine());
        System.out.println("Enter NumberStoriesVilla: ");
        villa.setNumberStoriesVilla(Integer.parseInt(sc.nextLine()));
        System.out.println("All new complete! Enter to continue...");
        sc.nextLine();
        listVilla.add(villa);
        FuncFileCSV.writeVillaToFileCSV(listVilla);
        displayMainMenu();
    }

    public void showServices(){
        System.out.println("------ShowServices------");
        System.out.println("1. Show all Villa\n"
        + "2. Show all House\n"
        + "3. Show all Room\n"
        + "4. Show all name Villa not duplicate\n"
        + "5. Show all name House not duplicate\n"
        + "6. Show all name Room not duplicate\n"
        + "7. Back to menu\n"
        + "8. Exit\n");
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Vui lòng cho trình đơn: ");
            choose = Integer.parseInt(sc.nextLine());
        }while (choose<1||choose>8);
        switch (choose){
            case 1: {
                showAllVilla();
                break;
            }
            case 8: {
                System.exit(0);
            }
            default:{
                System.out.println("Fail! Please choose again ! Enter to continue...");
                sc.nextLine();
                showServices();
            }
        }
    }

    private void showAllVilla() {
        listVilla = FuncFileCSV.getFileCSVToListVilla();
        for (Villa villa: listVilla) {
            System.out.println("------------------------");
            System.out.println("Id: " + villa.getId() + "\n"
            + "UseArea: " + villa.getUseArea() + "\n"
            + "RentServices: " + villa.getRentServices() + "\n"
            + "Quantity: " + villa.getQuantity() + "\n"
            + "StyleServices: " + villa.getStyleServices() + "\n"
            + "StandardRoomVilla: " + villa.getStandardRoomVilla() + "\n"
            + "PoolArea: " + villa.getPoolArea() + "\n"
            + "ComfortsVilla: " + villa.getComfortsVilla() + "\n"
            + "NumberStoriesVilla: " + villa.getNumberStoriesVilla());
            System.out.println("------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter to continue...");
            sc.nextLine();
            displayMainMenu();
        }
    }
}
