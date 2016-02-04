import java.io.Console;

public class Adjective {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me an adjective");
    String adjectiveSelect = myConsole.readLine();
    System.out.println("Give me a noun");
    System.out.println("The selected adjective is " + adjectiveSelect + "?Me too!");
  }
}
