import java.util.Random;
import java.util.Scanner;
public class App16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, m, row, n = 0, count =0;
        System.out.print("층수를 입력하세요: ");
        row = scanner.nextInt();
        for(int i = 0;i <row;i++){
            for(int j = row-1-i;j>0;j--){
                System.out.print("*");
            }
            for(m=0;m<(2*i)+1;m++){
                System.out.print(n);
                n++;
                if(n>=10){
                    n=0;
                    count++;
                }
                    
            }
            for(int j = row-1-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}