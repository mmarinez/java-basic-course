package chapter6;

import java.util.Scanner;

public class PhoneBillCalculatorEnhanced {
    public static void main(String[] args) {
        PhoneBill phoneBill = new PhoneBill("123");
        phoneBill.setNumberOfMinutesUsed(90);
        phoneBill.setAllottedMinutes(50);
        phoneBill.displayPhoneBill();
    }

}
