package Commons;

public class FuncValidation {
    private static String regex ="";
    public static boolean checkPassServices(String str){
        regex = "^SVVL-[0-9]{4}$";
        return str.matches(regex);
    }
    public static boolean checkNameServices(String str){
        regex = "^[A-Z][a-z]+$";
        return str.matches(regex);
    }
    public static boolean checkArea(String str){
        regex = "^([3-9][0-9]+|[1-9][0-9]{2,})$";
        return str.matches(regex);
    }
    public static boolean checkRentServices(String str){
        regex = "^[1-9][0-9]*$";
        return str.matches(regex);
    }
    public static boolean checkQuantity(String str){
        regex = "^([1-9]|[1][0-9])$";
        return str.matches(regex);
    }
    public static boolean checkNameAddServices(String str){
        regex = "^massage|karaoke|food|drink|car$";
        return str.matches(regex);
    }
    public static boolean checkNumberStoriesServices(String str){
        regex = "^[1-9][0-9]*$";
        return str.matches(regex);
    }
    public static boolean checkStyleServices(String str){
        regex = "^[A-Z][a-z]+$";
        return str.matches(regex);
    }
    public static boolean checkNameCustomer(String str){
        regex = "^[A-Z][a-z]*(( )([A-Z][a-z]*))*$";
        return str.matches(regex);
    }
    public static boolean checkEmail(String str){
        regex = "^[a-z0-9]+\\@[a-z]+(\\.[a-z]+)*$";
        return str.matches(regex);
    }
    public static boolean checkCmnd(String str){
        regex = "^[0-9]{3}(( )[0-9]{3}){2}$";
        return str.matches(regex);
    }
    public static boolean checkBirthday(String str){
        regex = "^((((0[1-9])|(1[0-9]))\\/((0[1-9])|(1[0-2])))|((2[0-8])\\/02)|((2[0-9])\\/((01)|(0[3-9])|(1[0-2])))|((30)\\/((01)|(0[3-9])|(1[0-2])))|((31)\\/(01|03|05|07|08|10|12)))\\/((190[1-9])|(19[1-9][0-9])|(200[0-2]))$";
        return str.matches(regex);
    }
    public static boolean checkSexual(String str){
        regex = "^(Nam)|(Nu)$";
        return str.matches(regex);
    }
    public static boolean checkNumberPhone(String str){
        regex = "^(0[1-9][0-9]{8})|(\\+84[1-9][0-9]{8})$";
        return str.matches(regex);
    }
    public static boolean checkAddress(String str){
        regex = "^[A-Z][a-z]*(( )([A-Z][a-z]*))*$";
        return str.matches(regex);
    }
}
