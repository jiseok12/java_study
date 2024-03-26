import java.util.Random;

public class App11 {
    public static void main(String[] args) {
        //int ran_vlaue = new Random().nextInt(45)+1;
        int lotto [] = new int[6];

        for(int i = 0; i<6;i++){
            int ran_value = new Random().nextInt(45)+1;
            for(int j=0;j<6;j++){
                if(lotto[j]==ran_value){
                    j = 0;
                    ran_value = new  Random().nextInt(45)+1;
                }
                if(j==i){
                    break;
                }
            }
            lotto[i] = ran_value;
        }

        for(int i =0;i<6;i++){
            System.out.println(lotto[i]);
        }
    }
}
