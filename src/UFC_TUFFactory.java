public class UFC_TUFFactory implements PromotionFactory {
    @Override
    public Fight createFight() {
        System.out.println("Фабрика UFC TUF создает бой...");
        return new UFC_TUF_Fight();
    }
}