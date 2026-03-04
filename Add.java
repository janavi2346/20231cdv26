import java.util.Scanner; 

public class OddEvenCheck {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter an integer number: ");
        num = input.nextInt(); 
        if (num % 2 == 0) {
            System.out.println("The given number " + num + " is Even");
        } else {
            System.out.println("The given number " + num + " is Odd");
        }

        input.close(); 
    }
}
