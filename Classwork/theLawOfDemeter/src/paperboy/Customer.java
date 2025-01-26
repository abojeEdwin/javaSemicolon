package paperboy;

public class Customer {
    private String firstName;
    private String lastName;
    Wallet myWallet;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getPayment(float bills) {
        if(myWallet != null) {
            if(myWallet.getTotalMoney() >= bills) {
                myWallet.subMoney(bills);
                return bills;
            }
        }
        return 0;
    }


}
