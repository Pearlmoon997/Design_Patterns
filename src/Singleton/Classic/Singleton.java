package Singleton.Classic;

public class Singleton {
    //하나뿐인 인스턴스를 저장하는 정적 변수
    private static Singleton uniqueInstance;

    //private 로 선언했으므로 singleton 에서만 인스턴스 생성 가능
    private Singleton() {}

    //인스턴스 == null >> 인스턴스가 아직 생성되지 않음
    public static Singleton getInstance() {
        //싱글턴 객체 생성 후 uniqueInstance 에 객체 대입
        //게으른 인스턴스 생성 이라고 부름
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "클래식 싱글턴";
    }
}
