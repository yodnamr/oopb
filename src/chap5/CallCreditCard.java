package chap5;

public class CallCreditCard {
    public static void main(String[] args) {
        CreditCard card = CreditCard.creditCardInstance(28000);
        System.out.println("card = "+card);
        CreditCard card2 = CreditCard.creditCardInstance(8000);
        System.out.println("card2 = "+card2);
        
    }
}
