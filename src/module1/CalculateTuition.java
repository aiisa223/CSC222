package module1;
import java.util.Scanner;
public class CalculateTuition {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the cost of one creditCost?: ");
        double creditCost = input.nextDouble();

        System.out.println("How many credits are you taking?: ");
        int creditQty = input.nextInt();

        System.out.println("The cost of your tuition is " + creditQty*creditCost);
        System.out.println("The cost of one creditCost is" + creditCost);
        System.out.println("You are taking" +creditQty + " credits. ");




    }
}
