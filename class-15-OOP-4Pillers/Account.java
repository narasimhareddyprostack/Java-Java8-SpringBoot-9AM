public class Account extends Bank{
    String acc_Name;
    String acc_Email;
    String acc_Addr;
    public Account(String name,String email,String addr){
        this.acc_Name=name;
        this.acc_Email=email;
        this.acc_Addr=addr;
    }

    //implimenting the abstract method
    public void cal_Bal(){}//implimentaiton
}