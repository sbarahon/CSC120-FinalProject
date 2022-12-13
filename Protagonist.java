import java.util.ArrayList;

public class Protagonist {

    public ArrayList<String> inventory;
    public String character_type;

    public Protagonist(){
        inventory = new ArrayList<String>();


    }
    
    public void addInventory(String item){
        this.inventory.add(item);
    }

    public boolean checkInventory(String item){
        return this.inventory.contains(item);
    }

    public String getType(){
        return this.character_type;
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
     * After making certain decisions, this method is called so that in the end, the character type will indicate which ending the user receives.
     */
    public void updateChar(String type){
        this.character_type=type;
    }

    public static void main(String[] args){
        Protagonist myChar = new Protagonist();
        myChar.addInventory("some snacks");
        myChar.addInventory("a blanket");
        myChar.addInventory("water");
        myChar.accessInventory();
    }
}
