import java.io.Console;

  public class Drink {
    public static void main(String [] args) {
      Console myConsole = System.console();


      System.out.println("How old are you?");
      String stringUserAge = myConsole.readLine();
      Integer integerUserAge = Integer.parseInt(stringUserAge);

      if(integerUserAge >=21) {
        System.out.println("You can drink legally");
      } else {
        System.out.println("Sorry, you cannot drink alcohol in USA.Go to Europe!");
      }
    }
  }
