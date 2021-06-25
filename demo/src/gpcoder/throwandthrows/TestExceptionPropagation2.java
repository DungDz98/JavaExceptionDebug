package gpcoder.throwandthrows;

import java.io.IOException;

public class TestExceptionPropagation2 {
    void m() {

    }

    void n() {
        m();
    }

    void p() {
        try {
            throw new IOException(); // checked exception
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
    }

    public static void main(String args[]) {
        TestExceptionPropagation2 obj = new TestExceptionPropagation2();
        obj.p();
        System.out.println("normal flow");
    }
}
