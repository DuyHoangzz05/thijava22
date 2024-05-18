package session5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationDemo {
    public static void main(String[] args) {
       //TryCatchDemo.tryCatchDemo();
        ThrowExceptionDemo.validate();
try {
    int age = intputAge();
    System.out.println("tuoi vua nhap :" +age);
}catch (AgeCheckingException e){
    System.out.println(e.getMessage());
}
    }
static int intputAge() throws AgeCheckingException,InputMismatchException,ArithmeticException,OutOfMemoryError {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap tuoi cua nhan vien");
    int age = 0;
    try {
        age = sc.nextInt();
        if (age < 0)
            throw new AgeCheckingException(" tuoi khong dc < 0");
    } catch (InputMismatchException e) {
        throw new AgeCheckingException(" tuoi phai la number");
    }
return  age;
}
}
