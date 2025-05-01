/**This is the mother class for all buttons
 */
public class Button{
    private String S_Info;
    private int I_Info;
    //Constructor
    public Button(){

    }
    //Methods
    /**This method sends the associated information of the button
     * @param ButtonInfo: The assocaited information
     * @return: The information to be read, a string
    */
    public String Send(String ButtonInfo){
        return S_Info;
    }
    /**This method sends the associated information of the button
     * @param ButtonInfo: The assocaited information
     * @return: The information to be read, an interger
    */
    public Interger Send(int ButtonInfo){
        return I_Info;
    }
}