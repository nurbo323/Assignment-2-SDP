public class LFAFactory implements PromotionFactory {
    @Override
    public Fight createFight() {
        System.out.println("Фабрика LFA создает бой...");
        return new LFAFight();
    }
}