//VALIDATOR APP
import java.util.Scanner;

public class ValidatorApp {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        String name = "";
        int age = 0;
        double height = 0.0;
        double weight = 0.0;
        double favDec = 0.0;
        		
        
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            name = Validator2.getString(
                sc, "Enter name: ");
            age = Validator2.getInt(
                sc, "Enter age 0-100:     ", 1, 100);
           height = Validator2.getDouble(
                    sc, "Enter height 36-92:     ", 36.0, 92.0);
            weight = Validator2.getDouble(
                    sc, "Enter weight 80-400:     ", 80.0, 400.0);
            favDec = Validator2.getDouble(
                    sc, "Enter favorite decimal 0-1:     ", 0.0, 1.0);
            // see if the user wants to continue
            choice = Validator2.getString(
                sc, "Another assignment? (y/n): ");
            System.out.println();
            System.out.println("PERSONAL INFORMATION");
            System.out.println("Name:	" +name);
            System.out.println("Age:	" +age);
            System.out.println("Height:	" +height);
            System.out.println("Weight:	" +weight);
            System.out.println("FavDec:	" +favDec);

        }
  }
}