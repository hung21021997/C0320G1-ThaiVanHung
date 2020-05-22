package Commons;

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
    private static final String FILE_HEADER = "Id,UseArea,RentServices,Quantity,StyleServices,StandardRoomVilla,PoolArea,ComfortsVilla,NumberStoriesVilla";
    public static void writeVillaToFileCSV(ArrayList<Villa> listVilla){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameVilla,true);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa: listVilla) {
                fileWriter.append(villa.getId());
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
                villa.setUseArea(Double.parseDouble(splitData[1]));
                villa.setRentServices(Double.parseDouble(splitData[2]));
                villa.setQuantity(Integer.parseInt(splitData[3]));
                villa.setStyleServices(Integer.parseInt(splitData[4]));
                villa.setStandardRoomVilla(splitData[5]);
                villa.setPoolArea(Double.parseDouble(splitData[6]));
                villa.setComfortsVilla(splitData[7]);
                villa.setNumberStoriesVilla(Integer.parseInt(splitData[8]));
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
