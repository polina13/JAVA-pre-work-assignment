import java.io.Console;

public class groceryList {
  public static void main(String [] args) {
    Console myConsole = System.console();

    System.out.println("Please enter your packages weight?");
    String yourPackageWeight = myConsole.readLine();
    Integer weight = Integer.parseInt(yourPackageWeight);

    System.out.println("How many miles ..");
    String yourMilesDistance = myConsole. readLine();
    Integer miles = Integer.parseInt(yourMilesDistance);

    calculateShippingCost(weight, miles);
  }

  public static void calculateShippingCost(Integer weight, Integer miles) {
    Integer priceModifier = 2;
    Integer price = ((weight / 10)+(miles / 5)) * priceModifier;
    System.out.println("Your packeage cost is $" + price);
  }
}
