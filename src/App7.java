public class App7{
    public static void main(String[] args) {
        int a=3, b=5, c=7;
        System.out.println((a>b) ? "안녕하세요" : "JAVA수업");
        System.out.println((a<b) ? (b>c) ? "타입 A" : "타입 B" : (b>c) ? "타입 C" : "타입 D");
    }
}