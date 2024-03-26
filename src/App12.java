import java.util.Random;

public class App12 {
    public static void main(String[] args) {
        //int ran_vlaue = new Random().nextInt(45)+1;
        int count =1;
        for(int i=1;i<=10;i++){
            count = i;
            for(int j=1;j<=10;j++){
                if(count==11){
                    count =1;
                }
                System.out.print(count++);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
