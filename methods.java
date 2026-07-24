import java.util.ArrayList;

public class methods {
    public static void main(String[] args) {
        CashRegister obj = new CashRegister();
        obj.recordPurchase(100);
        obj.receivePayment(90);
        System.out.println("Purchase: " + obj.getPurchase());
        System.out.println("Payment: " + obj.getPayment());
        System.out.println("Change: " + obj.giveChange());
        System.out.println(obj.countTotal(obj.getItemCount()));

        obj.recordPurchase(100);
        obj.receivePayment(90);
        System.out.println("Purchase: " + obj.getPurchase());
        System.out.println("Payment: " + obj.getPayment());
        System.out.println("Change: " + obj.giveChange());
        System.out.println("Total items: " + obj.countTotal(obj.getItemCount()));
    }
}

class CashRegister {
    private double purchase;
    private double payment;
    private int items;

    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = purchase - payment;
        purchase = 0;
        payment = 0;
        items += 1;
        return change;
    }

    public double getItemCount(){
        return items;
    }

    public double getPayment(){
        return payment;
    }

    public double getPurchase(){
        return purchase;
    }

    public ArrayList countTotal(double item){
        ArrayList total = new ArrayList<>();
        total.add(item);
        return total;
    }

    // additional methods not shown
}
