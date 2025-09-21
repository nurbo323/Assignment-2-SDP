public class LFAFight implements Fight {
    @Override
    public void startMatch() {
        System.out.println("Начало боя LFA...");
    }

    @Override
    public void announceWinner() {
        System.out.println("Победитель боя LFA объявлен!");
    }
}