import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String userInput = sc.nextLine();
        if (StringUtils.isNumeric(userInput) == false) {
            System.out.println(userInput + " is not a number");
        } else  {
            System.out.println(userInput + " is a number");
        }
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}
