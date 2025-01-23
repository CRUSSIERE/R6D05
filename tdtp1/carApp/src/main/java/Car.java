/**
 * La classe Car représente une voiture avec des caractéristiques
 * comme le modèle, la couleur et la vitesse. Elle permet d'accélérer
 * ou de ralentir la voiture.
 */
public final class Car {
    /**
     * Le modèle de la voiture.
     */
    private final String model;

    /**
     * La couleur de la voiture.
     */
    private final String color;

    /**
     * La vitesse actuelle de la voiture.
     */
    private int speed;

    /**
     * Incrément de vitesse lors de l'accélération ou du ralentissement.
     */
    private static final int INCREMENT_SPEED = 10;

    /**
     * Vitesse maximale de la voiture en km/h.
     */
    private static final int SPEED_MAX = 120;

    /**
     * Vitesse minimale de la voiture en km/h.
     */
    private static final int SPEED_MIN = 0;

    /**
     * Constructeur de la classe Car.
     *
     * @param model Le modèle de la voiture.
     * @param color La couleur de la voiture.
     */
    public Car(final String model, final String color) {
        this.model = model;
        this.color = color;
        this.speed = SPEED_MIN;
    }

    /**
     * Obtient la vitesse actuelle de la voiture.
     *
     * @return La vitesse actuelle en km/h.
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Augmente la vitesse de la voiture de 10 km/h,
     * jusqu'à une vitesse maximale de 120 km/h.
     * Affiche les détails après l'accélération.
     */
    public void accelerate() {
        if (speed + INCREMENT_SPEED <= SPEED_MAX) {
            speed += INCREMENT_SPEED;
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
        if (speed - INCREMENT_SPEED >= SPEED_MIN) {
            speed -= INCREMENT_SPEED;
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
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed + " km/h");
    }

    /**
     * Démarre la voiture si le driver est adulte.
     *
     * @param driver
     */
    public void startCar(final Driver driver) {
        if (driver.isAdult()) {
            System.out.println(driver.getName() + " démarre la voiture.");
        } else {
            System.out.println(
                    "Le driver n'est pas assez âgé pour conduire.");
        }
    }

    /**
     * Arrête la voiture.
     *
     * @param driver
     */
    public void stopCar(final Driver driver) {
        System.out.println(driver.getName() + " arrête la voiture.");
    }

    /**
     * Change la vitesse de la voiture à une nouvelle valeur.
     *
     * @param nouvelleVitesse La nouvelle vitesse à atteindre.
     * @param driver
     */
    public void changeSpeed(final int nouvelleVitesse,
                            final Driver driver) {
        System.out.println(driver.getName()
                + " change la vitesse de la voiture à "
                + nouvelleVitesse);

        if (getSpeed() >= nouvelleVitesse) {
            while (getSpeed() > nouvelleVitesse) {
                slow();
            }
        } else {
            while (getSpeed() < nouvelleVitesse) {
                accelerate();
            }
        }
    }
}
