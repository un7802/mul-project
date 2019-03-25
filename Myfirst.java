import java.util.Scanner;

public class Myfirst {

    public static void main(String[] args) {

        System.out.print("몇단까지 출력하실 겁니까? : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum, i, j;

        if(a < 2) {
            System.out.println("님 병신임?");

            return;
        }

        for( i = 2; i <= a; i++) {
            for( j = 1; j < 10; j++) {
                sum = i*j;

                if(j == 9) {
                    System.out.print(i+" x "+j+" = "+sum);
                }else {
                    System.out.println(i+" x "+j+" = "+sum);
                }
            }
        }

    }
}
