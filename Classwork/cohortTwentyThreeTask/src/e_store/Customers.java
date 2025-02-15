package e_store;
import java.util.ArrayList;

public class Customers  extends Users{
    ArrayList <Shopping_Cart> shopping_carts = new ArrayList<>();
    Billing_Information billingInformation;

    public Customers(int age) {
        super(age);
    }
}
