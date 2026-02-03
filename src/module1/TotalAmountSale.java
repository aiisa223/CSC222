package module1;

import java.util.Scanner;

public class TotalAmountSale {
    static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int numItem;
        double price;
        String itemName;

        System.out.println("Please enter the name of the item: ");
        itemName = keyboard.next();

        System.out.println("Please enter the number of items: ");
        numItem = keyboard.nextInt();

        System.out.println("Please enter the price for each item: ");
        price = keyboard.nextDouble();

        System.out.println(STR. "If you buy \{numItem} \{itemName}" );
        System.out.println(STR."Your total is: \{numItem * price}");

    }
}
