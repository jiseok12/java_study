import java.util.Random;

public class App10 {
    public static void main(String[] args) {

		int money = new Random().nextInt(500)+1;
        int count1 [] = new int[6];


        System.out.println(money);
        int save = money;
        count1[0]= save/500;
        save = save%500;
        count1[1]= save/100;
        save = save%100;
        count1[2]= save/50;
        save = save%50;
        count1[3]= save/10;
        save = save%10;
        for(int i = 0;i<4;i++){
            if(i==0 && count1[i]!=0){
                System.out.print("500원");
            }
            else if(i==1 && count1[i]!=0){
                System.out.print("100원");
            }
            else if(i==2 && count1[i]!=0){
                System.out.print("50원");
            }
            else if(i==3 && count1[i]!=0){
                System.out.print("10원");
            }
            if(count1[i]!=0){
                System.out.print(count1[i]);
                System.out.print("원");
            }
            
        }
    }
}
