import java.util.List;
import java.util.Scanner;

public class Kebab {
    private final String pain;
    private final List<Ingredient> ingredients;

    Kebab(String pain, List<Ingredient> ingredients) {
        this.pain = pain;
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}
