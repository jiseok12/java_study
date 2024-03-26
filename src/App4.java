public class App4{
    public static void main(String[] args) throws Exception {
        int a=3, b=3, c=3;

        System.out.println(false & a++>6);
        System.out.println(true | b++>6);
        System.out.println(true ^ c++>6);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}