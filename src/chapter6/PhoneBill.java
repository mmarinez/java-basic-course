package chapter6;


public class PhoneBill {

    private String id;
    private double baseCost;
    private double allottedMinutes;
    private double numberOfMinutesUsed;

    private void setId(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setAllottedMinutes(double allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public double getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setNumberOfMinutesUsed(double numberOfMinutesUsed) {
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    public double getNumberOfMinutesUsed() {
        return numberOfMinutesUsed;
    }

    public PhoneBill() {
        this.id = "0";
        this.baseCost = 10;
        this.allottedMinutes = 100;
        this.numberOfMinutesUsed = 50;
    }

    public PhoneBill(String id) {
        this.id = id;
        this.baseCost = 10;
        this.allottedMinutes = 100;
        this.numberOfMinutesUsed = 500;
    }

    public PhoneBill(String id, double baseCost, double allottedMinutes, double numberOfMinutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    public double calculateOverageFee() {
        if(numberOfMinutesUsed <= allottedMinutes){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = numberOfMinutesUsed - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax() {
        double taxFee = 0.15;
        return taxFee * (baseCost + calculateOverageFee());
    }

    public double calculateTotal() {
        return baseCost + calculateTax() + calculateOverageFee();
    }

    public void displayPhoneBill() {
        System.out.format("Phone Bill Statement ID: %s\n", id);
        System.out.format("Plan: %.2f\n", baseCost);
        System.out.format("Overage: %.2f\n", calculateOverageFee());
        System.out.format("Tax: %.2f\n", calculateTax());
        System.out.format("Total: %.2f\n", calculateTotal());
    }

}
