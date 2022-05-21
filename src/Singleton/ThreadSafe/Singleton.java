package Singleton.ThreadSafe;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    //getInstance 메소드를 동기화
    //한 스레드가 사용을 끝내기 전까지 다른 스레드는 접근 불가
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "thread-safe Singleton";
    }
}
