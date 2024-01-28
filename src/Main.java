//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 5_000;
        int coefficient = 20;
        int bonus = ticketPrice/coefficient;
        System.out.println("Начислено "+(bonus)+" бонусов");
    }
}