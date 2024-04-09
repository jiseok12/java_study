class A{
    void averageScore(int... numbers){
        double sum = 0;
        int count = 0;
        for (int number : numbers){
            sum += number;
            count++;
        }
        System.out.println(sum/count);
    }
}

public class App20 {
    public static void main(String[] args) {
        A a = new A();
        a.averageScore(1);
        a.averageScore(1,2);
        a.averageScore(1,2,3);
        a.averageScore(1,2,3,4);
    }
}