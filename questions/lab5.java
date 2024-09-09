import java.util.Scanner;

public class lab5 {
    
    public static void main(String[] args) {
        

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt(), fac = 1;

        for(int i=1 ; i<=a ; i++){

            fac *= i;

        }

        System.out.println("Factorial is: "+ fac);

    }

}
