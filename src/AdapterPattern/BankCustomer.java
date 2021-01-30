package AdapterPattern;

public class BankCustomer extends BankDetails implements CreditCard {

    public BankCustomer() {
        super();
    }

    @Override
    public void giveBankDetails() {
        setAccHolderName("Gosho");
        setBankName("TestaBank");
        setAccNumber(42345);
    }

    @Override
    public String getCreditCard() {
        return "Acc holder name: " + getAccHolderName() + "Bank name: " + getBankName() + "Acc number: "  + getAccNumber();
    }
}
