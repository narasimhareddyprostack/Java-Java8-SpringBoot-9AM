public class TestFour {
    public static void main(String[] args) {
        String esal="45000.45";
        //String Object
        Double es1=Double.valueOf(esal);
        //String to primitive Data Type
        double es2=Double.parseDouble(esal);
        System.out.println(esal);
        System.out.println(es1);
        System.out.println(es2);
    }
}
