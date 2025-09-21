import java.util.Scanner;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Демонстрация Абстрактной фабрики ---");
        System.out.println("Выберите подписку:");
        System.out.println("1. Премиум");
        System.out.println("2. Базовая");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the rest of the line

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
        mainEvent.showMainEvent(); // Correct method from UFCFight interface

        UFC_BJJ_Show bjjShow = factory.createBJJShow();
        if (bjjShow != null) {
            bjjShow.showHighlights(); // Correct method from UFC_BJJ_Show interface
        }

        UFC_Slap_Fight slapFight = factory.createSlapFight();
        if (slapFight != null) {
            slapFight.showLiveMatch(); // Correct method from UFC_Slap_Fight interface
        }

        scanner.close();
    }
}