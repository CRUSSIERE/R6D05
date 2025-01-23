/**
 * La classe Conducteur représente un conducteur capable
 * de manipuler une voiture.
 * Elle contient les informations personnelles
 * et les actions possibles du conducteur.
 */
// La classe est marquée comme 'final' pour empêcher l'héritage.
public final class Conducteur {
    /**
     * Le nom du conducteur.
     */
    private String nom;

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
     * Constructeur de la classe Conducteur.
     *
     * @param name  Le nom du conducteur.
     * @param years L'âge du conducteur.
     */
    public Conducteur(final String name, final int years) {
        this.nom = name;
        this.age = years;
    }

    /**
     * Vérifie si le conducteur est adulte (âgé d'au moins ageMax).
     *
     * @return true si le conducteur est adulte, false sinon.
     */
    public boolean estAdulte() {
        return age >= ageMax;
    }

    /**
     * Obtient le nom du conducteur.
     *
     * @return Le nom du conducteur.
     */
    public String getNom() {
        return this.nom;
    }

}
