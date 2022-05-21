package Singleton.Solution2;

public class Singleton {
    //DCL(Double-Check-Locking)사용
    //volatile 을 사용하면 멀티스레딩을 사용해도 초기화 과정이 올바르게 진행
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        //인스턴스가 null 이면 동기화 된 블록으로 이동
        if (uniqueInstance == null) {
            //처음에만 동기화
            synchronized (Singleton.class) {
                //변수가 null 인지 다시 한 번 확인 후 인스턴스 생성
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "DCL";
    }
}
