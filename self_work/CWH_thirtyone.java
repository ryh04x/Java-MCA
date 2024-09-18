public class CWH_thirtyone {


    public static class cwh_31_methods {
    
        static int mySum(int a, int b) {
            int c = a+b;
            return c;	//Return value
        }
        
        
    }

    public static void main(String[] args) {
        
        int x = 21;
        int y = 21;
        int z; 
        z = cwh_31_methods.mySum(x,y);
        System.out.println(z);

        // cwh_31_methods obj = new cwh_31_methods(); //Object Creation
        // System.out.println(obj.mySum(x,y));
        
    }
    
}