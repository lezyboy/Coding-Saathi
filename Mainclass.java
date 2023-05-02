import java.io.ObjectInputFilter.Status;
import java.util.Scanner;
public class Mainclass {

    public static void main(String[] args) {
        interope op=new Operimp();
        int Atmnumber=123456789;
        int pincode=123254;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome User");
        System.out.print("Enter Atm number::");
        int AtmNumber=in.nextInt();
        System.out.print("Enter Pin number::");
        int PinCode=in.nextInt();
    
    if((Atmnumber==AtmNumber)&&(pincode==PinCode)){
    //   System.out.println("Enter successfully"); 
    while(true) {
        System.out.println("1->::check current Balance\n");
        System.out.println("2->::check withdraw Amount\n");
        System.out.println("3->::check deposite Amount\n");
        System.out.println("4->::View Ministatement\n");
        System.out.println("5->::Exit\n");
        System.out.println("::Enter your choice::");
        int ch=in.nextInt();
        if(ch==1){
            op.viewBalence();
        }
        else if(ch==2){
            System.out.println("Enter the Amount for Withdrawn");
            double Withdraw=in.nextDouble();
            op.WithdrawAmount(Withdraw);
        }
        else if(ch==3){
            System.out.println("Enter the amount to deposit");
            double Deposite=in.nextDouble();
            op.DepositeAmount(Deposite);
        }
        else if(ch==4){
            op.Ministatement();
        }
        else if(ch==5){
          System.out.println("Collect your Atm card\n"); 
          System.out.println("Thank You"); 
        }
        else{
            System.out.println("select correct choice");
        }
    }

    }
    else{
        System.out.println("Wrong Atm number or pin");
       
        
        }
    }
}
