package gpcoder.exceptionhandling;

public class ExceptionExample1 {
    public static int getValueAtIndex5() {
        try {
            int res = 10/ 0;
            System.out.println("res = " + res);
            return 1;
        } catch (Exception ex) {
            System.out.println(ex);
            return 0;
        } finally {
            System.out.println("FinallY!");
        }
    }

    public static void main(String[] args) {
        System.out.println(getValueAtIndex5());
    }


}
