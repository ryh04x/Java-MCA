import java.util.Scanner;

public class calc {
    
    public static void main(String[] args) {
        
        int a= 5;
        int b= 5;
        int add= 0;

        System.out.println("Enter 1 for Add\n2 for Sub\nany for multiply");
        Scanner scan = new Scanner(System.in);


        int wish = scan.nextInt();


        if (wish==1) {

        System.out.println("Addition: " + add(a, b));

        }
        else if (wish==2) {
            
        System.out.println("Subtraction: " + subtract(a, b));

        }
        else{
            System.out.println("Multiplication: " + multiply(a, b));
        }


    }
        public static int add(int a , int b) {
            return a + b;
        }
        
        public static int multiply(int a , int b) {
            return a + b;
        }
        
        public static int subtract(int a , int b) {
            return a + b;
        }
        



    }


