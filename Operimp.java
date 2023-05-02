import java.util.HashMap;
import java.util.Map;

public class Operimp implements interope {
    Atm ATM=new Atm();  
    Map<Double,String> ministatement= new HashMap<>(0);
    @Override
    public void viewBalence() {
       System.out.println("Avalable balance:::"+ATM.getBalence());
    }

    @Override
    public void WithdrawAmount(double Withdraw) {
        if(ATM.getBalence()>=Withdraw){
            ministatement.put(Withdraw,   "Amount Withdrawn");
            System.out.println(Withdraw+" Successfully Withdrawn");
          ATM.setBalence(ATM.getBalence()-Withdraw);
                 }              
        else{
            System.out.println("Insufficient balence");
            }
         viewBalence();
    }
    @Override
    public void DepositeAmount(double Deposite) {
        ministatement.put(Deposite,  "Amount Deposited");
        System.out.println(Deposite+" Successfully Deposited");
          ATM.setBalence(ATM.getBalence()+Deposite);
         viewBalence();
    }

    @Override
    public void Ministatement() {
        for(Map.Entry<Double,String> p:ministatement.entrySet()){
            System.out.println(p.getKey()+"  "+p.getValue());
        }
    }
    
}
