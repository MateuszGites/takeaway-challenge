package takeaway.challenge;
 
import java.util.ArrayList;

public class Menu {
  private ArrayList<Dish> menu = new ArrayList<Dish>();

  public ArrayList<Dish> getMenu() {
    return menu;
  }

  public void addDish(Dish Dish) {
    menu.add(Dish);
  }
}