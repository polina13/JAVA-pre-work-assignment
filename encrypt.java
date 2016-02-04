import java.io.Console;
  public class encrypt {
    public static void main(String[] args) {
      Console myConsole = System.console();

      System.out.println("Create an encrypt sentence");
      String myResults = myConsole.readLine();
      String myEncryptedResults = myResults.replaceAll("e", "friendly hippopotamus");

      System.out.println("Your encrypted phrase is " + myEncryptedResults);

    }
  }
