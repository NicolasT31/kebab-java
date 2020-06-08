public class Ingredient {
    private final Boolean isVegetarien;
    private final String nom;

    Ingredient(String nom, Boolean isVegetarien) {
        this.nom = nom;
        this.isVegetarien = isVegetarien;
    }

    Boolean isVegetarien() {
        return this.isVegetarien;
    }

    public String getNom() {
        return nom;
    }
}
