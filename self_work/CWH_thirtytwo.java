public class CWH_thirtytwo {
    
    public static class cwh_methodoverloading{

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
        cwh_methodoverloading.foo();
        cwh_methodoverloading.foo(3000);
        cwh_methodoverloading.foo(3000, 4000);
        cwh_methodoverloading.foo(3000, 4000, 5000);
    }

}
