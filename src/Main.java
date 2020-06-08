import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Ingredient> ingredients = new ArrayList<>();
        Kebab kebab = new Kebab("pain classique", ingredients);

        while(true) {
            System.out.println("Voulez-vous ajouter un ingrédient ?");

            Scanner scan = new Scanner(System.in);
            String s = scan.next();

            if(s.equals("exit")) {
                break;
            }

            Ingredient ingredient = new Ingredient(s, true);
            kebab.addIngredient(ingredient);
        }

        for(int i=0; i<ingredients.size(); i++){
            System.out.println(ingredients.get(i).getNom());
        }
    }
}
