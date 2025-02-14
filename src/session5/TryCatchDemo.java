package session5;

public class TryCatchDemo {
    public static void tryCatchDemo(){
        int a=20;
        int b=0;
        try {
           int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("khong the chia cho 0"  + e.getMessage());
        }finally {
            System.out.println("khoi lenh nay lun dc thuc thi");
        }
    }
    public static void tryCatchFinallyDemo(){
        /**
         * try-catch lồng nhau , khi khối try-catch lồng trong một khối try-catch khác
         * ử dụng khi tình huống có thể phát sinh trong đó 1 phần của khối có thể gây ra lỗi
         */

    }
    public static void nestedTryCatchDemo(){
     try {
         try {
             System.out.println("thuc hien phep chia");
             int b =10000/0;
         }catch (ArithmeticException e){
             System.out.println(e.getMessage());
         }
         try {
             int a[]=new int[10];
             a[10]=20;
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println(e.getMessage());
         }
     }catch (Exception e) {
         System.out.println("kiem soat dc loi");
     }
    }
}
