package Singleton.Chocolate;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    //하나뿐인 인스턴스 저장
    private static ChocolateBoiler uniqueInstance;

    //비어있을 때만 돌아가는 코드
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        //uniqueInstance == null << 아직 인스턴가 생성되지 않음
        if (uniqueInstance == null) {
            System.out.println("unique Instance 생성");
            //private 로 선언 된 생성자를 사용하여 싱글턴 객체 생성
            //uniqueInstance 에 객체 대입
            //게으른 인스턴스 생성 방법
           uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("초콜렛 보일러의 Instance 반환");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
