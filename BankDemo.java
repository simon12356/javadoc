class BankAccount {
    double balance; BankAccount(double b){balance=b;}
    void deposit(double a){balance+=a;}
    void deposit(double a,String s){balance+=a;}
    boolean withdraw(double a){if(balance>=a){balance-=a;return true;}return false;}
    double getBalance(){return balance;}
}
class SavingsAccount extends BankAccount {
    double minBalance=1000; SavingsAccount(double b){super(b);}
    @Override boolean withdraw(double a){if(balance-a>=minBalance){balance-=a;return true;}return false;}
}
class CurrentAccount extends BankAccount {
    CurrentAccount(double b){super(b);}
    @Override boolean withdraw(double a){if(balance>=a){balance-=a;return true;}double od=a-balance;balance=-(od*1.02);return true;}
}
public class BankDemo {
    public static void main(String[] args){
        SavingsAccount sa=new SavingsAccount(10000);System.out.println("Savings withdraw 9200: Allowed? "+sa.withdraw(9200)+", Bal="+sa.getBalance());
        CurrentAccount ca=new CurrentAccount(5000);System.out.println("Current withdraw 6000: Allowed? "+ca.withdraw(6000)+", Bal="+ca.getBalance());
    }
}
