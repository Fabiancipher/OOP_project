/**
 * This class displays the main menu.
 * It displays all habits.
 */
import java.util.*;
public class MainScreen extends Screen {
    //Creates an array
    List<String> HabitNames = new ArrayList<>();

    public MainScreen(){
        
    }

    /**
     * Displays habits.
     */
    public void showHabits() {
        for(String nombre : HabitNames){
            System.out.println(nombre);
        }
    }
}