class Test{
    public double get_Bal(){
        double min_Bal=500.00;
        double acc_Bal=15000.00;
        return acc_Bal-min_Bal;
    }
    public static void main(String[] args) {
        Test t1=new Test();
        System.out.println(t1.get_Bal());
    }   
}
