import java.util.ArrayList;

public class Protagonist {

    public boolean home_items_found;
    public ArrayList<String> inventory;
    public int character_type = 0;

    public Protagonist(){
        inventory = new ArrayList<String>();
        home_items_found = false;
    }
    
    public void addInventory(String item){
        this.inventory.add(item);
    }

    public boolean checkInventory(String item){
        return this.inventory.contains(item);
    }

    public void removeInventory(String item){
        this.inventory.remove(item);
    }

    public void accessInventory(){
        int i;
        System.out.println("INVENTORY:");
        for (i=0; i < this.inventory.size();i++){
            int x=i+1;
            System.out.println(x+":"+this.inventory.get(i));
        }        
    }

    /**
     * After making a decision, this method is called so that in the end, the character type will indicate which ending the user receives.
     */
    public void updateChar(){
        this.character_type+=1;
    }

    public static void main(String[] args){
        Protagonist myChar = new Protagonist();
        myChar.addInventory("some snacks");
        myChar.addInventory("a blanket");
        myChar.addInventory("water");
        myChar.accessInventory();
    }


}
