package Models;

import Libs.Customer;

import java.util.Comparator;

public class SortNameAndYear implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        int resultComparatorName = o1.getNameCustomer().compareTo(o2.getNameCustomer());
        if (resultComparatorName == 0){
            compareYear(o1,o2);
        }
        return resultComparatorName;
    }
    public  int compareYear(Customer o1, Customer o2){
        int yearCustomer1 = (Integer.parseInt(o1.getBirthdayCustomer().substring(6,10)));
        int yearCustomer2 = (Integer.parseInt(o2.getBirthdayCustomer().substring(6,10)));
        if (yearCustomer1 == yearCustomer2){
            return 0;
        } else if (yearCustomer1>yearCustomer2){
            return 1;
        } else {
            return -1;
        }
    }
}
