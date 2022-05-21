package Singleton.Chocolate;

public class ChocoController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        //존재하는 Instance 반환
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}
