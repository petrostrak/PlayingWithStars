package mypackage;

public class MainClass {

    public static void main(String[] args) {
        for (int i = 9; i > -2 ; i-=2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

}
