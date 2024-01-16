package laba6;

public class ex2 {
    public static void main(String[] args) {

        myClass task2 = new myClass();

        task2.setX();
    }

    public static class myClass {
        private static int x = 0;

        static void setX () {
            int y = x + 1;
            System.out.println("x = " + x);
            System.out.println("x = " + y);
        }
    }

}
