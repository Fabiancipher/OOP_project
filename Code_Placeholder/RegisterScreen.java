/**
 * This class represents a registration screen where the user
 * is prompted to enter a username and password.
 */
public class RegisterScreen extends Screen {
    private String username;
    private String password;

    public RegisterScreen() {
    }

    /**
     * Sets the username.
     * @param username The username to be set.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the password.
     * @param password The password to be set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the entered username.
     * @return The username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns the entered password.
     * @return The password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Displays a registration message asking the username.
     */
    public void ShowFormUsername() {
        System.out.println("U.NAME:");
    }

    /**
     * Displays a registration message asking the password.
     */
    public void ShowFormPassword() {
        System.out.println("PASS:");
    }
}