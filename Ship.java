import java.util.ArrayList;

/**
 * Defines the Ship class
 */
public class Ship {
    int current_floor;
    String current_room = "the Central Hub";
    
    /**
     * Constructs the ship object
     * @param level_num the current level the user is on
     */
    public Ship(int level_num){
        this.current_floor = level_num;
    }

    /**
     * Returns the current floor the user is on
     * @return the current floor the user is on
     */
    public int getCurrent_floor(){
        return this.current_floor;
    }

    /**
     * Returns the current room the user is on
     * @return the current room the user is on
     */
    public String getCurrent_room(){
         return this.current_room;
    }
    
    /**
     * Allows the user to go up a floor
     */
    public void goUp(){
        if (this.current_floor == 1){
            this.current_floor=2;
            this.current_room="the top level";
            System.out.println("You are now on floor "+this.current_floor);
        }
        else {
            System.out.println("You're already on the top level.");
        }
        printOptions();
    
    }

    /**
     * Allows the user to go down a floor
     */
    public void goDown(){
        if (this.current_floor == 2){
            this.current_floor=1;
            this.current_room="the ground level";
            System.out.println("You are now on floor "+this.current_floor);
        }
        else {
            System.out.println("You're already on the ground level.");
        }
        printOptions();
    }

    /**
     * Allows the user to enter the central hub if on correct floor
     */
    public void enterCentralHub(){
        if (this.current_floor == 1){
            this.current_room = "the Central Hub";
            System.out.println("\nYou're now in the Central Hub.");
        }
        else {
            System.out.println("\nYou need to go to Level 1 to go to the Central Hub.");
        }
    }

    /**
     * Allows the user to enter the Navigation Room if on correct floor
     */
    public void enterNavigation(){
        if (this.current_floor == 1){
            this.current_room = "the Navigation Room";
            System.out.println("\nYou're now in the Navigation Room.");
        }
        else {
            System.out.println("\nYou need to go to Level 1 to go to the Navigation Room.");
        }
    }

    /**
     * Allows the user to enter the Barracks if on correct floor
     */
    public void enterBarracks(){
        if (this.current_floor == 1){
            this.current_room = "the Barracks";
            System.out.println("\nYou're now in the Barracks.");
        }
        else {
            System.out.println("\nYou need to go to Level 1 to go to the Barracks.");
        }
    }

    /**
     * Allows the user to enter the Communications Room if on correct floor
     */
    public void enterCommunications(){
        if (this.current_floor == 1){
            this.current_room = "the Communications Room";
            System.out.println("\nYou're now in the Communications Room.");
        }
        else {
            System.out.println("\nYou need to go to Level 1 to go to the Communications Room.");
        }
    }

    /**
     * Allows the user to enter the Security Room if on correct floor
     */
    public void enterSecurity(){
        if (this.current_floor == 2){
            this.current_room = "the Security Room";
            System.out.println("\nYou're now in the Security Room.");
        }
        else {
            System.out.println("\nYou need to go to Level 2 to go to the Security Room.");
        }
    }
    

    /**
     * Allows the user to enter the Medical Bay if on correct floor
     */
    public void enterMedBay(){
        if (this.current_floor == 2){
            this.current_room = "the Medical Bay";
            System.out.println("\nYou're now in the Medical Bay.");
        }
        else {
            System.out.println("\nYou need to go to Level 2 to go to the Medical Bay.");
        }
    }

    /**
     * Allows the user to enter the Engine Room if on correct floor
     */
    public void enterEngineRoom(){
        if (this.current_floor == 2){
            this.current_room = "the Engine Room";
            System.out.println("\nYou're now in the Engine Room.");
        }
        else {
            System.out.println("\nYou need to go to Level 2 to go to the Engine Room.");
        }
    }

    /**
     * Allows user to enter the Weapons Room if on correct floor
     */
    public void enterWeaponsRoom(){
        if (this.current_floor == 2){
            this.current_room = "the Weapons Room";
            System.out.println("\nYou're now in the Weapons Room.");
        }
        else {
            System.out.println("\nYou need to go to Level 2 to go to the Weapons Room.");
        }
    }
    

    /**
     * Prints the current available options to the console
     */
    public void printOptions(){
        ArrayList<String> current_options = new ArrayList<String>();

        if (this.current_floor == 2){
            current_options.add("\n\n(+)Enter Security Room");
            current_options.add("(+)Enter Medical Bay");
            current_options.add("(+)Enter Engine Room");
            current_options.add("(+)Enter Weapons Room");

        }

        if (this.current_floor == 1){
            current_options.add("\n\n(+)Enter Central Hub");
            current_options.add("(+)Enter Navigation Room");
            current_options.add("(+)Enter Communications Room");
            current_options.add("(+)Enter Barracks");
        }

        current_options.add("(+)Look Around");
        current_options.add("(+)Current Level");
        current_options.add("(+)Current Room");

        int i;

        for (i = 0; i < current_options.size(); i++) {
            System.out.println(current_options.get(i));
          }
    }

    /**
     * Runs the main program that tests the Ship object functionality
     * @param args
     */
    public static void main(String[] args){
        Ship myShip = new Ship(1);
        System.out.println(myShip.getCurrent_floor());
        myShip.printOptions();
        myShip.goUp();
        System.out.println(myShip.getCurrent_floor());
        myShip.printOptions();
    }
}
