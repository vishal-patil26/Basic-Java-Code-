
//Method Overriding

class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}
class CashPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using Cash.");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

class UPIPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using UPI.");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Payment payment;


        payment = new CashPayment();
        payment.pay();

        payment = new CreditCardPayment();
        payment.pay();

        payment = new UPIPayment();
        payment.pay(); 
    }
}
