import java.util.Scanner;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Демонстрация Абстрактной фабрики ---");
        System.out.println("Выберите подписку:");
        System.out.println("1. Премиум");
        System.out.println("2. Базовая");
        System.out.print(": ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        UFCSubscriptionFactory factory;
        if (choice == 1) {
            factory = new UFC_PremiumFactory();
        } else {
            System.out.println("Неверный выбор. По умолчанию выбрана Премиум-подписка.");
            factory = new UFC_PremiumFactory();
        }

        System.out.println("Выбрана Премиум-подписка. Доступный контент:");

        // Corrected method calls
        UFCFight mainEvent = factory.createUFCFight();
        mainEvent.showMainEvent();

        UFC_BJJ_Show bjjShow = factory.createBJJShow();
        if (bjjShow != null) {
            bjjShow.showHighlights();
        }

        UFC_Slap_Fight slapFight = factory.createSlapFight();
        if (slapFight != null) {
            slapFight.showLiveMatch();
        }

        scanner.close();
    }
}