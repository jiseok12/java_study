/*
class A{
    int arraySum(int[] array){
        int sum = 0;
        for(int i=0; i< array.length; i++){
            sum += i;
        }
        return sum;
    }
}

public class App19 {
    public static void main(String[] args) {
        A a = new A();
        int[] data1 = new int[]{1,2,3};
        int[] data2 = {1,2,3};

        System.out.println(a.arraySum(data1));
        System.out.println(a.arraySum(data2));
        System.out.println(a.arraySum(new int[]{1, 2, 3}));
        System.out.println(a.arraySum({1, 2, 3}));
    }
}

System.out.println(a.arraySum({1, 2, 3}));
new 키워드를 사용하여 자바의 배열을 생성 하야 하기 때문이다
 */