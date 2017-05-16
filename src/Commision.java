import java.util.Scanner;

/**
 * Created by maboonga on 14.05.17.
 */
public class Commision {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String transactionType;
        String transactionLocation;
        Double transactionAmount;
        Double commission = 0.00;

        System.out.println("Is this SALE or PURCHASE?");
        transactionType = sc.nextLine();

        System.out.println("What is location of this transaction?");
        transactionLocation = sc.nextLine();

        System.out.println("Whats is the amount?");
        transactionAmount = sc.nextDouble();

        if (transactionType.toLowerCase().equals("sale")) {
            if (transactionLocation.toLowerCase().equals("e")) {
                commission = ((double) 5 / 100) * transactionAmount;
            } else if (transactionLocation.toLowerCase().equals("c")) {
                commission = (3.7 / 100) * transactionAmount;
            } else if (transactionLocation.toLowerCase().equals("m")) {
                commission = (4.2 / 100) * transactionAmount;
            }
        } else if (transactionType.toLowerCase().equals("purchase")) {
            if (transactionLocation.toLowerCase().equals("e")) {
                commission = (6.3 / 100) * transactionAmount;
            } else if (transactionLocation.toLowerCase().equals("c")) {
                commission = (4.3 / 100) * transactionAmount;
            } else if (transactionLocation.toLowerCase().equals("m")) {
                commission = (5.7 / 100) * transactionAmount;
            }
        }

        System.out.printf("For %s of $%.2f amount, at %s location, the commission will be: $%.2f.",
                transactionType.toLowerCase(), transactionAmount, transactionLocation.toUpperCase(), commission);
    }
}

//A commodities broker requires a program to calculate brokerage commission.
//Write a program that asks the user if the transaction was a sale or a purchase and then asks for the amount of the transaction.
//The program should then ask the user where the transaction was made.
//The user should enter E for the Commodity Exchange, C for the New York Cotton Exchange, or M for the Mercantile Exchange.
//If the amount was a sale, and was made at the Commodity Exchange, the commission rate is 5.0% of the amount.
//If a sale is made at the New York Cotton Exchange, the commission rate is 3.7% of the amount.
//If a sale is made at the Mercantile Exchange, the commission rate is 4.2% of the amount.
//If the transaction was a purchase at the Commodity Exchange, the rate commission is 6.3% of the amount.
//If a purchase is made at the Cotton Exchange, the commission rate is 4.3% of the amount.
//If a purchase is made at the Mercantile Exchange, the commission rate is 5.7% of the amount.