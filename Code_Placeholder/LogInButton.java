/**
 * This class represents a login button.
 * It inherits from the Button class and simulates saving user credentials.
 */
public class LogInButton extends Button {
    private String Username;
    private String Password;

    /**
     * Constructor
     */
    public LogInButton() {
    }

    /**
     * Makes a login action by storing the username and password.
     * @param username The username to store.
     * @param password The password to store.
     */
    public void click(String username, String password) {
        this.Username = username;
        this.Password = password;
        System.out.println("Log In button clicked.");
        System.out.println("Username stored: " + Username);
        System.out.println("Login simulated successfully.");
    }

    /**
     * Gets the stored username.
     * @return The stored username.
     */
    public String getStoredUsername() {
        return Username;
    }

    /**
     * Gets the stored password.
     * @return The stored password.
     */
    public String getStoredPassword() {
        return Password;
    }
}