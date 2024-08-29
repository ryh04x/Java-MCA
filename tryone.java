import java.util.Scanner;

public class tryone {

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        // String input = scan.nextLine();

        // System.out.println("Good Morning " + input.toUpperCase());
        // System.out.println("Good Morning " + input.toLowerCase());

        // int a = 45;
        // int b = 50;

        // System.out.println(a + b);
        // System.out.println(a);
        // System.out.println(a++);
        // System.out.println(++a);
        // System.out.println(a--);
        // System.out.println(--a);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int age = scan.nextInt();
        
        if (age>=21) {

            System.out.println("You Can drink");
            
        }

        else if (age>=18) {

            System.out.println("Chup ke Pile Bhai");
            
        }
        
        else{

            System.out.println("You can't drink");
        }


    }

}
