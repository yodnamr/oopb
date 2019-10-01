package chap5;

public class SavingAccount extends BankAccount{

    private SavingAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }

    public static SavingAccount createSA(int accountNo, String accountName, double balance){
        if (balance >= 100) {
            return new SavingAccount(accountNo, accountName, balance);
        } else {
            return null;
        }
    }
    
    @Override
    void withdraw(double amount) {
        System.out.println("ถอนเงินบัญชีออมทรัพย์ จำนวน : "+amount);
        double bal = getBalance() - amount;
        if (bal >= 50) {
            setBalance(bal);
        } else {
            System.out.println("ถอนไม่ได้ค่ะ ยอดเงินคงเหลือ >= 50");
        }
    }
    
    
    
}//end class
