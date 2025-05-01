/**
 * This class represents the user's profile screen.
 * It displays stats such as username, level, habits, tasks, bad habits, and streak days.
 */
public class ProfileScreen extends Screen {
    private String Username;
    private int Level;
    private int HabitCount;
    private int TaskCount;
    private int BadHabitCount;
    private int StreakDays;

   
    public ProfileScreen(String username, int level, int habitCount, int taskCount, int badHabitCount, int streakDays) {
    }

    /**
     * Displays the profile information.
     */
    public void showProfile() {
        System.out.println("=== PROFILE ===");
        System.out.println("Username: " + Username);
        System.out.println("Level: " + Level);
        System.out.println("Habits: " + HabitCount);
        System.out.println("Tasks: " + TaskCount);
        System.out.println("Bad Habits: " + BadHabitCount);
        System.out.println("Streak Days: " + StreakDays);
    }
}
