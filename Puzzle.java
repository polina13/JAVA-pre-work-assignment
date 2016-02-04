import java.io.Console;

  public class Puzzle {
    public static void main(String[] args) {
      Console myConsole = System.console();

      System.out.println("Give me a noun");
      String noun = myConsole.readLine();
      System.out.println("The noun I picked is " + noun + "?Me too");

      System.out.println("Give me an adjective");
      String adjective = myConsole.readLine();
      System.out.println("The adjective I picked is " + adjective + "?Me too");
    }
  }
