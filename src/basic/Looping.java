package basic;

public class Looping {
    public static void main(String[] args) {
        /*
        for (int i = 10;i>=0;i--){
            System.out.println("Hello World");
            System.out.println(i);
        }

         */
        int i = 0;
        while (i<5){
            System.out.println("Hello World "+i);
            i++;
        }

        while (i>=0){
            System.out.println("Hello World "+i);
            i--;
        }
    }
}
