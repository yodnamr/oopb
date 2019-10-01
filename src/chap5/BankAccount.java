package chap5;

public class BankAccount {
    private int accountNo;
    private String accountName;
    private double balance;

    public BankAccount(int accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    void deposite(double amount){
        System.out.println("ฝากเงิน จำนวน : "+amount);
        balance = balance + amount;
    }
    void withdraw(double amount){
        System.out.println("ถอน จำนวน : "+amount);
        balance = balance - amount;
    }
    
    void printDetails(){
        System.out.println("*******************");
        System.out.println("เลขที่บัญชี : "+accountNo);
        System.out.println("ชื่อบัญชี : "+accountName);
        System.out.println("ยอดคงเหลือ : "+balance);
        System.out.println("*******************");
    }
    
}
