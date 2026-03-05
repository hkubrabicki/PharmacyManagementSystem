package labproject;

import java.util.ArrayList;

/**
 * Represents a completed sale transaction.
 * Stores customer info, list of purchased medicines, and total price.
 */
public class SaleRecord {

    private CustomerInformation customer;
    private ArrayList<Medicine> purchasedMedicines;
    private double totalPrice;

    /**
     * Constructs a SaleRecord with given customer, medicine list, and total price.
     *
     * @param customer the customer who made the purchase
     * @param selectedMedicines the list of medicines purchased
     * @param totalPrice the total cost of the sale
     */
    public SaleRecord(CustomerInformation customer, ArrayList<Medicine> selectedMedicines, double totalPrice) {
        this.customer = customer;
        this.purchasedMedicines = new ArrayList<>(selectedMedicines); // clone to avoid modification
        this.totalPrice = totalPrice;
    }

    // Returns the customer of the sale
    public CustomerInformation getCustomer() {
        return customer;
    }

    // Returns the list of purchased medicines
    public ArrayList<Medicine> getPurchasedMedicines() {
        return purchasedMedicines;
    }

    // Returns the total price of the sale
    public double getTotalPrice() {
        return totalPrice;
    }

}
