public class TestOne{
    public static void main(String[] args) {
        int[] numbers;    
        numbers=new int[4];
        numbers[1]=102;
        numbers[2]=103;
        for( int number:numbers){
            System.out.println(number);
        }
    }
}