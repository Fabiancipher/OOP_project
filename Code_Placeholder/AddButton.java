/**
 * This class represents an Add button.
 * It inherits from Button and can be used to add Habits, Tasks, or Bad Habits.
 * It stores the name and difficulty level of the item being added.
 */
public class AddButton extends Button {
    private String itemName;


   
    public AddButton() {
    }

    /**
     * Simulates adding a new item (habit, task, or bad habit).
     * @param itemName The name of the item.
     */
    public void click(String itemName) {
        if (itemName == null || itemName.isEmpty()) {
            System.out.println("Item name cannot be empty.");
            return;
        }

        this.itemName = itemName;

        System.out.println("AddButton clicked.");
        System.out.println("Item added: " + this.itemName);
    }

    /**
     * Returns the stored item name.
     */
    public String getItemName() {
        return itemName;
    }
}