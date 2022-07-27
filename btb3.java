import java.util.Scanner;

public class btb3 {
    public static void main(String[] args) {

        // bài 1
        System.out.println("----------------------bài 1-----------------------------------");
        Scanner scanner = new Scanner(System.in );
        System.out.println("mời bạn nhập số bất kì ");
        int i = scanner.nextInt();
        if( i>0 ){
        System.out.println("tổng của 1 -->"+i +" = "+ (i+1)*i/2);

        }

        // bài 2
        System.out.println("----------------------bài 2-----------------------------------");
        int dem = 0;
        int tongSoNt = 0;
        int soNt = 2;
        while (dem < 100) {
            boolean isPrime = true;
            for (int j = 2; j <= soNt / 2; j++) {

                int temp = soNt % j;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                tongSoNt = tongSoNt + soNt;
                dem++;
            }
            soNt++;

        }

        System.out.println("tổng 100 số nguyên tố đầu tiên là " + tongSoNt);

        // bài 3
        System.out.println("----------------------bài 3-----------------------------------");
        System.out.println("mời bạn nhập số ");
        int positiveNumber = scanner.nextInt();
        int sum = 0;
        while(positiveNumber>0) {
        int lastDigit = positiveNumber % 10;
        sum = sum + lastDigit;
        positiveNumber=positiveNumber/10;
        }
        System.out.println("tổng số ngyên vừa nhập là "+sum);

    }

   

}
