package Commons;

import Libs.Customer;
import Models.Employee;
import Models.House;
import Models.Villa;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameVilla = "src/Data/Villa.csv";
//    private static final String FILE_HEADER = "Id, NameServices, PassServices, UseArea, RentServices, Quantity, StyleServices, StandardRoomVilla, PoolArea, ComfortsVilla, NumberStoriesVilla, NameAddServices";

    private static final String fileNameCustomer = "src/Data/Customer.csv";
//    private static final String FILE_HEADER_CUSTOMER = "NameCustomer, BirthdayCustomer, Sexual, CMND, NumberPhone, Email, TypesOfCustomer, Address";

    private static final String fileNameBooking = "src/Data/Booking.csv";

//    private static final String fileEmployee = "src/Data/Employee.csv";
//
//    public static void writeEmployeeToFileCSV(Employee employee){
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter(fileEmployee, true);
//            fileWriter.append(employee.getIdEmployee());
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(employee.getNameEmployee());
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(String.valueOf(employee.getAgeEmployee()));
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(employee.getAddressEmployee());
//            fileWriter.append(NEW_LINE_SEPARATOR);
//        } catch (Exception e){
//            System.out.println("Error in CsvFileWrite !!!");
//        }finally {
//            try {
//                fileWriter.flush();
//                fileWriter.close();
//            }catch (Exception e){
//                System.out.println("Error when flush or close");
//            }
//        }
//    }

    public static void writeBookingToFileCSV(Customer customer){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameBooking, true);
            fileWriter.append(customer.getNameCustomer());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getBirthdayCustomer());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getSexual());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getCmnd());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getNumberPhone()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getEmail());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getTypesOfCustomer());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getAddress());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getServices().getId());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getServices().getNameServices());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getServices().getPassServices());
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getServices().getUseArea()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getServices().getRentServices()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getServices().getQuantity()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(String.valueOf(customer.getServices().getStyleServices()));
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(customer.getServices().getNameAddServices());
            fileWriter.append(NEW_LINE_SEPARATOR);

        }catch (Exception e){
            System.out.println("Error in CsvFileWrite !!!");
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception e){
                System.out.println("Error when flush or close");
            }
        }

    }

    public static void writeCustomerToFileCSV(ArrayList<Customer>listCustomer){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameCustomer,true);
//            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer: listCustomer) {
                fileWriter.append(customer.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthdayCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getSexual());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getCmnd());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getNumberPhone()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypesOfCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception e){
            System.out.println("Error in CsvFileWrite !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e){
                System.out.println("Error when flush or close");
            }
        }
    }





    public static void writeVillaToFileCSV(ArrayList<Villa> listVilla){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameVilla,true);
//            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa: listVilla) {
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getPassServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getUseArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentServices()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getQuantity()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getStyleServices()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getStandardRoomVilla());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getPoolArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getComfortsVilla());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberStoriesVilla()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getNameAddServices());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception e){
            System.out.println("Error in CsvFileWrite !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e){
                System.out.println("Error when flush or close");
            }
        }
    }

    public static ArrayList<Customer> getFileCSVToListCustomer(){
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameCustomer));
            while ((line = br.readLine())!=null){
                String[] splitDataCus = line.split(",");
                if (splitDataCus[0].equals("NameCustomer")){
                    continue;
                }

                Customer customer = new Customer();
                customer.setNameCustomer(splitDataCus[0]);
                customer.setBirthdayCustomer((splitDataCus[1]));
                customer.setSexual(splitDataCus[2]);
                customer.setCmnd(splitDataCus[3]);
                customer.setNumberPhone(Integer.parseInt(splitDataCus[4]));
                customer.setEmail(splitDataCus[5]);
                customer.setTypesOfCustomer(splitDataCus[6]);
                customer.setAddress(splitDataCus[7]);
                listCustomer.add(customer);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listCustomer;
    }



    public static ArrayList<Villa> getFileCSVToListVilla(){
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameVilla));
            while ((line =br.readLine())!=null){
                String[] splitData = line.split(",");
                if (splitData[0].equals("Id")){
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(splitData[0]);
                villa.setNameServices(splitData[1]);
                villa.setPassServices(splitData[2]);
                villa.setUseArea(Double.parseDouble(splitData[3]));
                villa.setRentServices(Double.parseDouble(splitData[4]));
                villa.setQuantity(Integer.parseInt(splitData[5]));
                villa.setStyleServices(splitData[6]);
                villa.setStandardRoomVilla(splitData[7]);
                villa.setPoolArea(Double.parseDouble(splitData[8]));
                villa.setComfortsVilla(splitData[9]);
                villa.setNumberStoriesVilla(Integer.parseInt(splitData[10]));
                villa.setNameAddServices(splitData[11]);
                listVilla.add(villa);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return listVilla;
    }
}
