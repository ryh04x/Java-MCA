import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        
        
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if (a%2==0) {

            System.out.println("Even number");
            
        }

        else{

            System.out.println("Odd Number");

        }

    }
}
