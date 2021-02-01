
import java.util.ArrayList;


public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // adds meal to meals
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            meals.add(meal);
        }

    }
    
    //prints all meals that this.meals contains
    public void printMeals() {
        for(String each: this.meals) {
            System.out.println(each);
        }
    }
    
    //clears all the items in a list
    public void clearMenu() {
        meals.clear();
    }
}
