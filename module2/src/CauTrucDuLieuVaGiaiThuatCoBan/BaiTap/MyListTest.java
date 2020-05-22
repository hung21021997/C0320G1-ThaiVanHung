package CauTrucDuLieuVaGiaiThuatCoBan.BaiTap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("element 2: " + listInteger.get(2));
        System.out.println(listInteger.indexOf(3));
        System.out.println(listInteger.contains(3));
        System.out.println(listInteger.size());
        System.out.println(listInteger.clone());
        System.out.println(listInteger.get(3));
        System.out.println(listInteger.remove(3));
    }
}
