package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServicesImpl implements EmployeeServices{
    private static Map<String, Employee> employeeMap;

    static {
        employeeMap = new HashMap<>();
        employeeMap.put("001", new Employee("001","Thai Van Hung",18,"Quang Nam"));
        employeeMap.put("002", new Employee("002","Truong Tan Hai",20,"Da Nang"));
        employeeMap.put("003", new Employee("003","Nguyen Thanh Tu",22,"Hoi An"));
        employeeMap.put("004", new Employee("004","Phan Van Thanh",24,"Da Lat"));
        employeeMap.put("005", new Employee("005","Pham Van Hai",23,"Lam Dong"));
        employeeMap.put("006", new Employee("006","Truong Dinh Phong",21,"Hue"));
        employeeMap.put("007", new Employee("007","Nguyen Quoc Dung",19,"Ha Noi"));
        employeeMap.put("008", new Employee("008","Tran Van Trong",25,"Quang Binh"));
        employeeMap.put("009", new Employee("009","Ho Thi Dieu",20,"Binh Dinh"));
        employeeMap.put("010", new Employee("010","Huynh Quoc Tuan",27,"Da Nang"));
    }

    @Override
    public Map<String, Employee> getAllListEmployee() {
        return employeeMap;
    }
}
