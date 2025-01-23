/**
 * La classe Driver représente un conducteur capable
 * de manipuler une voiture.
 * Elle contient les informations personnelles
 * et les actions possibles du conducteur.
 */
// La classe est marquée comme 'final' pour empêcher l'héritage.
public final class Driver {
    /**
     * Le nom du conducteur.
     */
    private String name;

    /**
     * L'âge du conducteur.
     */
    private int age;

    /**
     * L'âge minimal requis pour qu'un
     * conducteur soit considéré comme adulte.
     */
    // Champ marqué comme 'private final' pour protéger l'encapsulation.
    private final int ageMax = 10;

    /**
     * Constructeur de la classe Driver.
     *
     * @param name  Le nom du conducteur.
     * @param years L'âge du conducteur.
     */
    public Driver(final String name, final int years) {
        this.name = name;
        this.age = years;
    }

    /**
     * Vérifie si le conducteur est adulte (âgé d'au moins ageMax).
     *
     * @return true si le conducteur est adulte, false sinon.
     */
    public boolean isAdult() {
        return age >= ageMax;
    }

    /**
     * Obtient le nom du conducteur.
     *
     * @return Le nom du conducteur.
     */
    public String getName() {
        return this.name;
    }

}
