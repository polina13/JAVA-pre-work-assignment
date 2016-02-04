import java.io.Console;

public class Noun {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a noun");
    String nounSelect = myConsole.readLine();
    System.out.println("The noun I picked is " + nounSelect +  "! Me too");
  }
}
