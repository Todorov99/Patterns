package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        CreditCard card = new BankCustomer();
        card.giveBankDetails();
        System.out.println(card.getCreditCard());
    }
}
