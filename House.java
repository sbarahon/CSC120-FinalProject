import java.util.ArrayList;

public class House {
    int current_floor;
    String current_room = "the bottom floor";

    public House(int floor_num){
        this.current_floor = floor_num;
    }

    public int getCurrent_floor(){
       return this.current_floor;
    }

    public String getCurrent_room(){
        return this.current_room;
     }

    public void goUp(){
        if (this.current_floor == 1){
            this.current_floor=2;
            this.current_room="the top floor";
            System.out.println("You are now on floor "+this.current_floor);
        }
        else {
            System.out.println("You're already on the top floor.");
        }
        printOptions();
    
    }

    //go 'downstairs'
    public void goDown(){
        if (this.current_floor == 2){
            this.current_floor=1;
            this.current_room="the ground floor";
            System.out.println("You are now on floor "+this.current_floor);
        }
        else {
            System.out.println("You're already on the ground floor.");
        }
        printOptions();
    }

    public void enterLivingRoom(){
        if (this.current_floor == 1){
            this.current_room = "the living room";
            System.out.println("You're now in the living room.");
        }
        else {
            System.out.println("You need to go downstairs to go to the living room");
        }
    }

    public void enterBathroom(){
        if (this.current_floor == 2){
            this.current_room = "the bathroom";
            System.out.println("You're now in the bathroom.");
        }
        else {
            System.out.println("You need to go upstairs to go to the bathroom.");
        }
    }

    public void enterKitchen(){
        if (this.current_floor == 1){
            this.current_room = "the kitchen";
            System.out.println("You're now in the kitchen.");
        }
        else {
            System.out.println("You need to go downstairs to go to the kitchen.");
        }
    }

    public void enterBedroom(){
        if (this.current_floor == 2){
            this.current_room = "your bedroom";
            System.out.println("You're now in your bedroom.");
        }
        else {
            System.out.println("You need to go upstairs to go to the bedroom.");
        }

    }

    public void enterParentsRoom(){
        if (this.current_floor == 2){
            this.current_room = "your parents room";
            System.out.println("You're now in your parent\'s room.");
        }
        else {
            System.out.println("You need to go upstairs to go to the bedroom.");
        }
    }

    public void printOptions(){
        ArrayList<String> current_options = new ArrayList<String>();

        if (this.current_floor == 2){
            current_options.add("\n(+)Enter Parents Room");
            current_options.add("(+)Enter Bedroom");
            current_options.add("(+)Enter Bathroom");
            current_options.add("(+)Go Down");
        }

        if (this.current_floor == 1){
            current_options.add("\n(+)Enter Kitchen");
            current_options.add("(+)Enter Living Room");
            current_options.add("(+)Go Up");
        }

        current_options.add("(+)Search for Items");
        current_options.add("(+)Current Floor");
        current_options.add("(+)Current Room");

        int i;

        for (i = 0; i < current_options.size(); i++) {
            System.out.println(current_options.get(i));
          }
    }

    public static void main(String[] args){
        House myHome = new House(1);
        System.out.println(myHome.getCurrent_floor());
        myHome.printOptions();
        myHome.goUp();
        System.out.println(myHome.getCurrent_floor());
        myHome.printOptions();
    }


    
}
