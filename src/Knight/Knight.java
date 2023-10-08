package Knight;

public class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.goAndSaveThePrincess();
    }

    public void goAndSaveThePrincess() {
        sharpenBlade();
        getFood();
        assembleTeam();
        useHorse();
        System.out.println("Да иду уже...");
    }

    private void sharpenBlade() {
        System.out.println("Точим мечь");
    }
    private void getFood() {
        System.out.println("Собираем консервы");
    }
    private void assembleTeam() {
        System.out.println("Будим оруженосца");
    }
    private void useHorse() {
        System.out.println("Седлаем коня");
    }
}