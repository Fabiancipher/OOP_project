/**This is the mother class for screens 
*/

public class Screen{
    public String Information;
    //Constructor
    public Screen(){

    }
    //Methods
    /**This method displays the screen info
     * @param info: The information to be displayed
     * @return: Said information
     */
    public String Display(String info){
        System.out.println(info);
        return Information;
    }
}