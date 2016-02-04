import java.io.Console;
  public class Number {
    public static void main(String[] args) {
      Console myConsole = System.console();

      System.out.println("Give a number");
      String stringUserNumber = myConsole.readLine();
      Integer integerUserNumber = Integer.parseInt(stringUserNumber);

      if(integerUserNumber >= 0) {
        System.out.println("Your number is " + (integerUserNumber +1));
      } else {
        System.out.println("Your number is " + (integerUserNumber - 1));
      }
    }
  }
