package session5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowExceptionDemo {
    public static void validate(){
        try {
            int age = inputAge();
            if (age<18)
                throw new ArithmeticException("ban chua du tuoi di lam");
            else
                System.out.println("ban da du tuoi di lam");
        }catch (InputMismatchException e){
            System.out.println("Nhap vao tuoi hop le");
        }
    }
    public static int inputAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tuoi vao:");
        int age =sc.nextInt();
        return age;
    }
}
