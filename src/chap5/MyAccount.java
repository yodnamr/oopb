package chap5;

public class MyAccount {
    public static void main(String[] args) {
//        //instanciate object of BankAccount
//        BankAccount ba = new BankAccount(1001, "nalinee", 1000);
//        System.out.println("ba = "+ba);
//        ba.printDetails();
//        //ฝาก 500
//        ba.deposite(500);
//        ba.printDetails();
//        //ฝาก 300
//        ba.deposite(300);
//        ba.printDetails(); 
//        
//        //ถอน 500
//        ba.withdraw(500);
//        ba.printDetails();        
//        //ถอน 300
//        ba.withdraw(300);
//        ba.printDetails();     

        SavingAccount sa = SavingAccount.createSA(2001, "Nalinee", 100);
        System.out.println("sa = "+sa);
        if (sa == null) {
            System.out.println("ต้องเปิดบัญชีขั้นต่ำ 100 บาทค่ะ");
        } else {
            sa.printDetails();
            
            sa.deposite(100);
            sa.printDetails();
            
            sa.withdraw(170);
            sa.printDetails();
        }
    }
}
