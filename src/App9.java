import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        int num1 = 0 ;
		int result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수:");
		num1 = sc.nextInt();
		
        for(int i=2;i<num1;i++){
            if(num1 % i == 0){
                result=1;
                break;
            }
        }
        if(result==1)
            System.out.println("소수가 아닙니다");
        else
            System.out.println("소수입니다");
    }
}
