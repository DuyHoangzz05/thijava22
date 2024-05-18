package session5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
    public static void createArray(){
        Scanner sc =new Scanner(System.in);
        int size =0;
        //nếu nhập dữ lệu <=0 thì nhapj lại
        while (size<=0){
            boolean check =false;
            while (!check){
                //vòng lặp while để lặp lại khi nhảy vào khối catch
                try {
                    System.out.println("nhap vao so luong cac phan tu mang");
                    size = Integer.parseInt(sc.nextLine());
                    check=true;
                }
                catch (ArithmeticException sql) {
                    System.out.println("Arithmetic");
                }
                catch (OutOfMemoryError io){
                    System.out.println("Ofmem");
                }
                catch (InputMismatchException input){
                    System.out.println("Input data wrong!!!");
                }
                catch (NumberFormatException e){
                    System.out.println("nhap sai, vui long nhap lai");
                }
            }
        }
    }
}
