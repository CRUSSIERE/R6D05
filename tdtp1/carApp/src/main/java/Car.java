/**
 * La classe Voiture représente une voiture avec des caractéristiques
 * comme le modèle, la couleur et la vitesse. Elle permet d'accélérer
 * ou de ralentir la voiture.
 */
public final class Voiture {
    /**
     * Le modèle de la voiture.
     */
    private final String modele;

    /**
     * La couleur de la voiture.
     */
    private final String couleur;

    /**
     * La vitesse actuelle de la voiture.
     */
    private int vitesse;

    /**
     * Incrément de vitesse lors de l'accélération ou du ralentissement.
     */
    private static final int INCREMENT_VITESSE = 10;

    /**
     * Vitesse maximale de la voiture en km/h.
     */
    private static final int VITESSE_MAX = 120;

    /**
     * Vitesse minimale de la voiture en km/h.
     */
    private static final int VITESSE_MIN = 0;

    /**
     * Constructeur de la classe Voiture.
     *
     * @param model Le modèle de la voiture.
     * @param color La couleur de la voiture.
     */
    public Voiture(final String model, final String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = VITESSE_MIN;
    }

    /**
     * Obtient la vitesse actuelle de la voiture.
     *
     * @return La vitesse actuelle en km/h.
     */
    public int getVitesse() {
        return this.vitesse;
    }

    /**
     * Augmente la vitesse de la voiture de 10 km/h,
     * jusqu'à une vitesse maximale de 120 km/h.
     * Affiche les détails après l'accélération.
     */
    public void accelerer() {
        if (vitesse + INCREMENT_VITESSE <= VITESSE_MAX) {
            vitesse += INCREMENT_VITESSE;
            showDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    /**
     * Réduit la vitesse de la voiture de 10 km/h, jusqu'à un minimum de 0 km/h.
     * Affiche les détails après le ralentissement.
     */
    public void slow() {
        if (vitesse - INCREMENT_VITESSE >= VITESSE_MIN) {
            vitesse -= INCREMENT_VITESSE;
            showDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    /**
     * Affiche les détails de la voiture,
     * y compris le modèle, la couleur et la vitesse actuelle.
     */
    private void showDetails() {
        System.out.println("Modèle : " + modele);
        System.out.println("Couleur : " + couleur);
        System.out.println("Vitesse actuelle : " + vitesse + " km/h");
    }

    /**
     * Démarre la voiture si le conducteur est adulte.
     *
     * @param conducteur
     */
    public void startCar(final Conducteur conducteur) {
        if (conducteur.estAdulte()) {
            System.out.println(conducteur.getNom() + " démarre la voiture.");
        } else {
            System.out.println(
                    "Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    /**
     * Arrête la voiture.
     *
     * @param conducteur
     */
    public void stopCar(final Conducteur conducteur) {
        System.out.println(conducteur.getNom() + " arrête la voiture.");
    }

    /**
     * Change la vitesse de la voiture à une nouvelle valeur.
     *
     * @param nouvelleVitesse La nouvelle vitesse à atteindre.
     * @param conducteur
     */
    public void changeSpeed(final int nouvelleVitesse,
                            final Conducteur conducteur) {
        System.out.println(conducteur.getNom()
                + " change la vitesse de la voiture à "
                + nouvelleVitesse);

        if (getVitesse() >= nouvelleVitesse) {
            while (getVitesse() > nouvelleVitesse) {
                slow();
            }
        } else {
            while (getVitesse() < nouvelleVitesse) {
                accelerer();
            }
        }
    }
}
