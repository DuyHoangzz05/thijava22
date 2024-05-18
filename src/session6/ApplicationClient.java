package session6;

import java.util.Scanner;

public class ApplicationClient {
    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        System.out.println("ban muon luu bao nhieu pt mang");
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int intArray[]=new int[size];// mảng tạm
        //truyền mảng tạm cho hàm createArray(int ar[])
        arrayExample.createArray(intArray);
        System.out.println("mảng vừa nhập là:");
        arrayExample.showArray(intArray);
        System.out.println("mảng sau khi sắp xếp:");
        arrayExample.ascSort(intArray);
        arrayExample.showArray(intArray);
    }
}
