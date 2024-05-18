package session6;

import java.util.Scanner;

public class ArrayExample {
    Scanner sc =new Scanner(System.in);
    public void createArray(int arr[]){
        for (int i=0; i< arr.length;i++){
            System.out.println("nhap gia tri ca pt mang");
            arr[i] = sc.nextInt();
        }
    }
    public void showArray(int arr[]){
        for (int i=0;i<arr.length; i++)
        {
            System.out.println(arr[i]+"\t"+"\t");
        }
    }
    public void ascSort(int arr[]){
        for (int i=0 ; i<arr.length;i++){
            for (int j=i+1; j < arr.length;j++)
            {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public void descSort(int arr[]){

    }
}
