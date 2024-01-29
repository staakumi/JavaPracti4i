
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ввод граммовок для каждого типа ингредиента
        int pasta = 200;
        int sauce = 150;
        int cheese = 50;

        // Написание полного способа приготовления
        String recipe = "1. Вскипятить воду в кастрюле и добавить пасту.\n" +
                "2. Поварить пасту в течение 10 минут.\n" +
                "3. Откинуть воду и добавить соус.\n" +
                "4. Перемешать и посыпать тертым сыром.";

        // Запись в txt файл
        try (PrintWriter writer = new PrintWriter(new FileWriter("favorite_dish_recipe.txt"))) {
            writer.println("Ингредиенты:");
            writer.println("Паста: " + pasta + " г");
            writer.println("Соус: " + sauce + " г");
            writer.println("Сыр: " + cheese + " г");
            writer.println("\nСпособ приготовления:");
            writer.println(recipe);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        System.out.println("Рецепт успешно записан в файл favorite_dish_recipe.txt");
    }
}