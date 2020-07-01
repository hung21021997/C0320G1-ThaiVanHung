package Controllers;

import Commons.FuncFileCSV;
import Commons.FuncValidation;
import Libs.Customer;
import Models.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class MainController {
    private static ArrayList<Villa> listVilla = new ArrayList<Villa>();
    private static  ArrayList<Customer> listCustomer = new ArrayList<Customer>();


    public static void main(String[] args) {
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
            case 3:{
                addNewCustomer();
                break;
            }
            case 4: {
                showCustomer();
                break;
            }
            case 5: {
                addNewBooking();
                break;
            }
            case 6: {
                showInformationOfEmployee();
                break;
            }
            case 7: {
                addBookingCinema();
                break;
            }
            case 9: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Fail! Please choice again ! Enter to continue...");
                input.nextLine();
                displayMainMenu();
            }
        }

    }

    private void addBookingCinema() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ticket: ");
        int numberTicket = sc.nextInt();
        while (numberTicket<1){
            System.out.println("Số lượng vé là số nguyên dương.");
        }
        for (int i = 0; i < numberTicket; i++) {

        }
    }

    private void showInformationOfEmployee() {
        Scanner sc = new Scanner(System.in);
        EmployeeServices employeeServices = new EmployeeServicesImpl();
        Map<String, Employee> employees = employeeServices.getAllListEmployee();
        Set<String> employeeSet = employees.keySet();
        for (String em: employeeSet) {
            System.out.println("----------");
            System.out.println(em + ". " + employees.get(em));
        }
        System.out.println("\n Enter to continue...");
        sc.nextLine();
        displayMainMenu();
    }

    private void addNewBooking() {
        System.out.println("------AddNewBooking------");
        System.out.println("1. Booking Villa\n"
        + "2. Booking House\n"
        + "3. Booking Room\n"
        + "4. Exit");
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Vui lòng chọn trình đơn: ");
            choice = Integer.parseInt(sc.nextLine());
        } while (choice>4||choice<1);
        switch (choice){
            case 1: {
                addNewBookingVilla();
                break;
            }
            case 2: {
                addNewBookingHouse();
                break;
            }
            case 3: {
                addNewBookingRoom();
                break;
            }
            case 4: {
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Fail! Please choice again ! Enter to continue...");
                sc.nextLine();
                addNewBooking();
            }
        }
    }

    private void addNewBookingRoom() {
        showRoom();
    }

    private void addNewBookingHouse() {
        showHouse();
    }

    private void addNewBookingVilla() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        listCustomer = FuncFileCSV.getFileCSVToListCustomer();
        for (int i = 0; i < listCustomer.size();i++){
            System.out.println("--------------");
            System.out.println("No."+(i));
            System.out.println(listCustomer.get(i).toString());
            System.out.println("--------------");
        }
        System.out.println("Enter number of Customer");
        int temp = Integer.parseInt(sc.nextLine());
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        listVilla = FuncFileCSV.getFileCSVToListVilla();
        for (int i = 0; i < listVilla.size();i++){
            System.out.println("--------------");
            System.out.println("No."+(i));
            listVilla.get(i).showInfo();
            System.out.println("--------------");
        }
        System.out.println("Enter number of Villa");
        Villa villa = listVilla.get(Integer.parseInt(sc.nextLine()));
        listCustomer.get(temp).setServices(villa);
        FuncFileCSV.writeBookingToFileCSV(listCustomer.get(temp));
        System.out.println("Done Enter to continue");
        sc.nextLine();
        addNewBooking();

//        String choose;
//        choose =sc.nextLine();
//        for (Villa villa: listVilla
//             ) {
//            if (villa.getId().equals(choose)){
//
//            }
//        }
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
                break;
            }
            case 2:{
                addNewHouse();
                break;
            }
            case 3: {
                addNewRoom();
                break;
            }
            case 4: {
                addNewServices();
                break;
            }
            case 5:{
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Fail! Please choose again ! Enter to continue...");
                sc.nextLine();
                addNewServices();
            }
        }
    }

    private void addNewRoom() {
    }

    private void addNewHouse() {
    }


    private void addNewCustomer() {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter nameCustomer: ");
        String nameTempCus = scanner.nextLine();
        while (!FuncValidation.checkNameCustomer(nameTempCus)){
            System.out.println("NameCus is invalid! Enter nameCus again: ");
            nameTempCus = scanner.nextLine();
        }
        customer.setNameCustomer(nameTempCus);

        System.out.println("Enter birthdayCustomer: ");
        String birthCus = scanner.nextLine();
        while (!FuncValidation.checkBirthday(birthCus)){
            System.out.println("BirthCus is invalid! Enter birthCus again: ");
            birthCus = scanner.nextLine();
        }
        customer.setBirthdayCustomer(birthCus);

        System.out.println("Enter sexual: ");
        String sexualCus = scanner.nextLine();
        while (!FuncValidation.checkSexual(sexualCus)){
            System.out.println("SexualCus is invalid! Enter sexualCus again: ");
            sexualCus = scanner.nextLine();
        }
        customer.setSexual(sexualCus);

        System.out.println("Enter CMND: ");
        String cmndCus = scanner.nextLine();
        while (!FuncValidation.checkCmnd(cmndCus)){
            System.out.println("CmndCus is invalid! Enter cmndCus again: ");
            cmndCus = scanner.nextLine();
        }
        customer.setCmnd(cmndCus);

        System.out.println("Enter numberPhone: ");
        String numberPhoneCus = scanner.nextLine();
        while (!FuncValidation.checkNumberPhone(numberPhoneCus)){
            System.out.println("NumberPhoneCus is invalid! Enter numberPhoneCus again: ");
            numberPhoneCus = scanner.nextLine();
        }
        customer.setNumberPhone(Integer.parseInt(numberPhoneCus));

        System.out.println("Enter email: ");
        String emailCus = scanner.nextLine();
        while (!FuncValidation.checkEmail(emailCus)){
            System.out.println("EmailCus is invalid! Enter emailCus again: ");
            emailCus = scanner.nextLine();
        }
        customer.setEmail(emailCus);

        System.out.println("Enter TypesOfCustomer: ");
        customer.setTypesOfCustomer(scanner.nextLine());

        System.out.println("Enter address: ");
        String addressCus = scanner.nextLine();
        while (!FuncValidation.checkAddress(addressCus)){
            System.out.println("AddressCus is invalid! Enter addressCus again: ");
            addressCus = scanner.nextLine();
        }
        customer.setAddress(addressCus);

        System.out.println("All new complete! Enter to continue...");
        scanner.nextLine();
        listCustomer.add(customer);
        FuncFileCSV.writeCustomerToFileCSV(listCustomer);
        displayMainMenu();

    }

    private void addNewVilla() {
        Scanner sc = new Scanner(System.in);
        Villa villa = new Villa();
        System.out.println("Enter id: ");
        villa.setId(sc.nextLine());

        System.out.println("Enter NameServices: ");
        String nameTemp = sc.nextLine();
        while (!FuncValidation.checkNameServices(nameTemp)){
            System.out.println("Name is invalid! Enter name again: ");
            nameTemp = sc.nextLine();
        }
        villa.setNameServices(nameTemp);

        System.out.println("Enter PassServices: ");
        String passTemp = sc.nextLine();
        while (!FuncValidation.checkPassServices(passTemp)){
            System.out.println("Pass is invalid! Enter pass again: ");
            passTemp = sc.nextLine();
        }
        villa.setPassServices(passTemp);

        System.out.println("Enter UseArea: ");
        String areaTemp = sc.nextLine();
        while (!FuncValidation.checkArea(areaTemp)){
            System.out.println("Area is invalid! Enter area again:");
            areaTemp = sc.nextLine();
        }
        villa.setUseArea(Double.parseDouble(areaTemp));

        System.out.println("Enter RentServices: ");
        String rentTemp = sc.nextLine();
        while (!FuncValidation.checkRentServices(rentTemp)){
            System.out.println("Rent is invalid! Enter rent again: ");
            rentTemp =sc.nextLine();
        }
        villa.setRentServices(Double.parseDouble(rentTemp));

        System.out.println("Enter Quantity: ");
        String quantityTemp = sc.nextLine();
        while (!FuncValidation.checkQuantity(quantityTemp)){
            System.out.println("Quantity is invalid! Enter quantity again: ");
            quantityTemp =sc.nextLine();
        }
        villa.setQuantity(Integer.parseInt(quantityTemp));

        System.out.println("Enter StyleServices: ");
        String styleTemp = sc.nextLine();
        while (!FuncValidation.checkStyleServices(styleTemp)){
            System.out.println("Style is invalid! Enter style again: ");
            styleTemp =sc.nextLine();
        }
        villa.setStyleServices(styleTemp);

        System.out.println("Enter StandardRoomVilla: ");
        villa.setStandardRoomVilla(sc.nextLine());

        System.out.println("Enter PoolArea: ");
        String areaPoolTemp = sc.nextLine();
        while (!FuncValidation.checkArea(areaPoolTemp)){
            System.out.println("AreaPool is invalid! Enter areaPool again: ");
            areaPoolTemp =sc.nextLine();
        }
        villa.setPoolArea(Double.parseDouble(areaPoolTemp));

        System.out.println("Enter ComfortsVilla: ");
        villa.setComfortsVilla(sc.nextLine());

        System.out.println("Enter NumberStoriesVilla: ");
        String numberStoriesTemp = sc.nextLine();
        while (!FuncValidation.checkNumberStoriesServices(numberStoriesTemp)){
            System.out.println("NumberStories is invalid! Enter numberStories again: ");
            numberStoriesTemp =sc.nextLine();
        }
        villa.setNumberStoriesVilla(Integer.parseInt(numberStoriesTemp));

        System.out.println("Enter NameAddServices: ");
        String nameAddTemp = sc.nextLine();
        while (!FuncValidation.checkNameAddServices(nameAddTemp)){
            System.out.println("NameAdd is invalid! Enter nameAdd again: ");
            nameAddTemp =sc.nextLine();
        }
        villa.setNameAddServices(nameAddTemp);

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
            case 2:{
                showHouse();
                break;
            }
            case 3:{
                showRoom();
                break;
            }
            case 4: {
                ArrayList<Villa> listVilla = FuncFileCSV.getFileCSVToListVilla();
                TreeSet<Villa> treeSet = new TreeSet<>();
                treeSet.addAll(listVilla);
                for (Villa vi: treeSet) {
                    System.out.println(vi.getNameServices());
                }
                System.out.println("Enter to continue ...");
                sc.nextLine();
                showServices();
            }
            case 7: {
                showServices();
                break;
            }
            case 8: {
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Fail! Please choose again ! Enter to continue...");
                sc.nextLine();
                showServices();
            }
        }
    }

    private void showRoom() {
    }

    private void showHouse() {
    }

    private void showCustomer() {
        listCustomer = FuncFileCSV.getFileCSVToListCustomer();
        Collections.sort(listCustomer, new SortNameAndYear());
        for (Customer customer: listCustomer) {
            System.out.println("------showCustomer------");
            System.out.println("NameCustomer: " + customer.getNameCustomer() + "\n"
            + "BirthdayCustomer: " + customer.getBirthdayCustomer() + "\n"
            + "Sexual: " + customer.getSexual() + "\n"
            + "Cmnd: " + customer.getCmnd() + "\n"
            + "NumberPhone: " + customer.getNumberPhone() + "\n"
            + "Email: " + customer.getEmail() + "\n"
            + "TypesOfCustomer" + customer.getTypesOfCustomer() + "\n"
            + "Address: " + customer.getAddress());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to continue...");
         scanner.nextLine();
        displayMainMenu();
    }

    private void showAllVilla() {
        listVilla = FuncFileCSV.getFileCSVToListVilla();
        for (Villa villa: listVilla) {
            System.out.println("------showVilla------");
            System.out.println("Id: " + villa.getId() + "\n"
            + "NameServices: " + villa.getNameServices() + "\n"
            + "PassServices: " + villa.getPassServices() + "\n"
            + "UseArea: " + villa.getUseArea() + "\n"
            + "RentServices: " + villa.getRentServices() + "\n"
            + "Quantity: " + villa.getQuantity() + "\n"
            + "StyleServices: " + villa.getStyleServices() + "\n"
            + "StandardRoomVilla: " + villa.getStandardRoomVilla() + "\n"
            + "PoolArea: " + villa.getPoolArea() + "\n"
            + "ComfortsVilla: " + villa.getComfortsVilla() + "\n"
            + "NumberStoriesVilla: " + villa.getNumberStoriesVilla() + "\n"
            + "NameAddServices: " + villa.getNameAddServices());
            System.out.println("------------------------");

        }
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to continue...");
        sc.nextLine();
        System.out.println("1. Back displayMainMenu.\n"
        + "2. Booking services.\n"
        + "3. Exit.");
        do {
            System.out.println("Chọn để tiếp tục chương trình: ");
            choice = Integer.parseInt(sc.nextLine());
        }while (choice>3|choice<1);
        switch (choice){
            case 1: {
                displayMainMenu();
                break;
            }
            case 2: {
                System.out.println("Vui lòng chọn Id thích hợp: ");
                break;
            }
            case 3: {
                System.exit(0);
            }
            default: {
                System.out.println("Fail! Please choose again ! Enter to continue...");
                sc.nextLine();
            }
        }
    }
}
