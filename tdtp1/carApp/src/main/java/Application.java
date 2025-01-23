/**
 * La classe Application représente le point d'entrée
 * principal de l'application.
 */
public final class Application {

    /**
     * Méthode principale (point d'entrée) de l'application.
     *
     * @param args les arguments de la ligne de commande
     */
    public static void main(final String[] args) {
        final int ageConducteur = 20;
        final int vitesse80 = 80;
        final int vitesse30 = 30;

        Car maCar = new Car("Sedan", "Bleu");
        Driver moi = new Driver("John", ageConducteur);

        maCar.startCar(moi);
        maCar.accelerate();
        maCar.changeSpeed(vitesse80, moi);
        maCar.slow();
        maCar.changeSpeed(vitesse30, moi);
        maCar.stopCar(moi);
        System.out.println("fini");
    }

    /**
     * Constructeur privé pour empêcher l'instanciation de cette classe.
     */
    private Application() {
        throw new UnsupportedOperationException(
                "Cette classe ne peut pas être instanciée.");
    }
}
