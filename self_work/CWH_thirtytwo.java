public class CWH_thirtytwo {
    
    public static class cwh_methodoverloading{

        // Arry changing
        
        static void change(int a){
            a = 98;
        }
    
        static void change2(int [] arr){
            arr[0] = 98;
        }


        // Method overloading 


        static void foo(){
            System.out.println("Good Morning!");
        }
        static void foo(int a){
            System.out.println("Good Morning " + a + " bro");
        }
        static void foo(int a, int b){
            System.out.println("Good Morning " + a+b);
        }
        static void foo(int a, int b, int c){
            System.out.println("Good Morning " + a + b + c + " bro");
        }
        
    }

    public static void main(String[] args) {

        // Case 1: Changing the Integer

        int x = 45;
        cwh_methodoverloading.change(x);
        System.out.println("The value of x after running change is: " + x);

        // Case 1: Changing the Array

        int [] marks = {52, 73, 77, 89, 98, 94};
        cwh_methodoverloading.change2(marks);
        System.out.println("The value of x after running change is: " + marks[0]);


        cwh_methodoverloading.foo();
        cwh_methodoverloading.foo(3000);
        cwh_methodoverloading.foo(3000, 4000);
        cwh_methodoverloading.foo(3000, 4000, 5000);
    }

}
