public class UFC_PremiumFactory implements UFCSubscriptionFactory {
    @Override
    public UFCFight createUFCFight() {
        return new PremiumUFCFight();
    }

    @Override
    public UFC_BJJ_Show createBJJShow() {
        return new PremiumBJJShow();
    }

    @Override
    public UFC_Slap_Fight createSlapFight() {
        System.out.println("Эта подписка не включает контент Power Slap.");
        return null; // A premium subscription does not include Power Slap
    }
}