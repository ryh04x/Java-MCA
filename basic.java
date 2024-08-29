public class basic {

    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            if (i % 3 == 0)
                continue;
            System.out.println("hrello");
            if (i % 6 == 0)
                break;

        }
    }
}