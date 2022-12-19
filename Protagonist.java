import java.util.ArrayList;

/**
 * Defines the Protagonist class
 */
public class Protagonist {

    public ArrayList<String> inventory;
    public String character_type;

    /**
     * Constructs the Protagonist object
     */
    public Protagonist(){
        inventory = new ArrayList<String>();


    }
    
    /**
     * Adds the inputted item into the protagonist inventory
     * @param item the item to be added to the inventory
     */
    public void addInventory(String item){
        this.inventory.add(item);
    }

    /**
     * Checks whether the inputted item is within the protagonist inventory
     * @param item an item
     * @return T/F: Whether or not the item is in the inventory
     */
    public boolean checkInventory(String item){
        return this.inventory.contains(item);
    }

    /**
     * Returns the character type
     * @return the character type
     */
    public String getType(){
        return this.character_type;
    }

    /**
     * Remvoes the inputted item into the inventory
     * @param item the item to be removed from the inventory
     */
    public void removeInventory(String item){
        this.inventory.remove(item);
    }

    /**
     * Prints the objects within the Protagonist inventory to the console
     */
    public void accessInventory(){
        int i;
        System.out.println("INVENTORY:");
        for (i=0; i < this.inventory.size();i++){
            int x=i+1;
            System.out.println(x+":"+this.inventory.get(i));
        }        
    }

    /**
     * This method sets the character type
     * @param type the type the character will be assigned to
     */
    public void updateChar(String type){
        this.character_type=type;
    }

    /**
     * Runs the main program that tests Protagonist functionality
     * @param args
     */
    public static void main(String[] args){
        Protagonist myChar = new Protagonist();
        myChar.addInventory("some snacks");
        myChar.addInventory("a blanket");
        myChar.addInventory("water");
        myChar.accessInventory();
    }
}
