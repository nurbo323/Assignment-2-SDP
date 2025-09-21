public class FactoryClient {
    public static void main(String[] args) {
        System.out.println("--- Демонстрация Фабричного метода ---");

        PromotionFactory lfaFactory = new LFAFactory();
        Fight lfaFight = lfaFactory.createFight();
        lfaFight.startMatch();
        lfaFight.announceWinner();
        System.out.println();

        PromotionFactory ufctufFactory = new UFC_TUFFactory();
        Fight ufctufFight = ufctufFactory.createFight();
        ufctufFight.startMatch();
        ufctufFight.announceWinner();
    }
}