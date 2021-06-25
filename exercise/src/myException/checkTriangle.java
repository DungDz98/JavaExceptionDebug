package myException;

import java.util.Scanner;

public class checkTriangle {
    static void check(double a, double b, double c) throws IllegalTriangleException {
        if (a > 0 & b > 0 & c > 0 & ((a + b > c) || (a + c > b) || (b + c > a))) {
            System.out.println("3 canh nay la 3 canh tam giac");
        } else {
            throw new IllegalTriangleException("Day khong phai 3 canh tam giac");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh thu nhat: ");
        double a = sc.nextDouble();
        System.out.println("Nhap canh thu hai: ");
        double b = sc.nextDouble();
        System.out.println("Nhap canh thu ba: ");
        double c = sc.nextDouble();
        try {
            check(a, b, c);
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
