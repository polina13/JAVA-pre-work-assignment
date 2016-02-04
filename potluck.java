import java.io.Console;
  public class potluck {
    public static void main(String[] args) {
      Console myConsole = System.console();

      System.out.println("What is your name?");
      String userName = myConsole.readLine();

      Integer potluckNumber= userName.compareTo("A");

      if(potluckNumber > 20) {
        System.out.println("You can bring tomatoes");
      } else if(potluckNumber > 10) {
        System.out.println("You can bring potatoes");
      } else if (potluckNumber > 0) {
        System.out.println("You can bring coke");

      } else {
        System.out.println("Bring whatever you want!");
      }
    }
  }
