public class UFC_TUF_Fight implements Fight {
    @Override
    public void startMatch() {
        System.out.println("Начало матча The Ultimate Fighter...");
    }

    @Override
    public void announceWinner() {
        System.out.println("Победитель матча The Ultimate Fighter объявлен!");
    }
}