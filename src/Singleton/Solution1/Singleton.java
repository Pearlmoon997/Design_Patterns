package Singleton.Solution1;

public class Singleton {
    //정적 초기화 부분에서 인스턴스 생성
    //스레드를 사용해도 문제가 발생하지 않음
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public String getDescription() {
        return "정적으로 초기화";
    }
}
