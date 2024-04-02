import java.util.Random;

public class App15 {
    public static void main(String[] args) {
        int [][] arr = {
            {5, 5, 5, 5, 5},
            {10, 10, 10, 10, 10},
            {20, 20, 20, 20, 20},
            {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;

        for(int i = 0;i < arr.length; i++){
            for(int k : arr[i]){
                total += k;
            }
        }
        average = total/20.f;
        System.out.println("total = "+total);
        System.out.println("average = " + average);
    }
}