import java.util.ArrayList;
import java.util.Scanner;

/**
 * Defines a story class
 */
public class Story{

    public Story(){
        
    }

    public static void displayText(String text){
        
        int i;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(40);// slight pause between characters
            } catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }

        }
    }

    public static void main(String[] args){
        // still thinking about if a story class is needed//
        // Story story = new Story();
        Protagonist Me = new Protagonist();

        //uncomment after done testing code
        displayText("You\'re in your dimly lit bedroom reading Harry Potter:The Chamber of Secrets underneath the violet LED lights wrapped around the ceiling. Your pet dog Milo is cuddled up beside you. You\'ve just gotten back from school and your mom is almost done making dinner, spaghetti with shrimp, you\'re favorite! You\'re almost done reading the chapter, until…\n");

        String x="true";

        Scanner input = new Scanner(System.in);

        while (x.equals("true")) {
            
            displayText("\nMom: Honey, food\'s ready! Are you going to join us?");
            System.out.println("\n(+) A: \"Just a second mom! I’m almost done with this chapter!\" \n(+) B: \"Okay! Coming!\"");
            System.out.print("Choose Your Response:");

            // while statement for decision block 1// 
            while (x.equals("true")){
            String user_response = input.nextLine().toUpperCase();
            if (user_response.equals("A")){
                displayText("\nYou: Just a second mom! I’m almost done with this chapter! \n");
                displayText("\n \n  .   .   .    \n \n You continued reading feverishly to meet your parents downstairs for dinner. As you were reading you noticed Milo's ears perk up. He started looking around and whining nervously. He jumped out of the bed and scurried downstairs. \n \n You: Milo! Where are you going? \n \n You chased him down the stairs. As you got to the last step you heard a violently loud crash! BOOM! You quickly follow Milo into the kitchen.");
                break;
            }
            else if (user_response.equals("B")){
                displayText("\nYou: Okay! Coming! \n");
                displayText("\n \n  .   .   .    \n \n You put the book away and wake up Milo to go downstairs. As you get to the last step the smell of freshly made spaghetti fills the house. You sit down at the kitchen table as your mom brings you a hot plate of spaghetti and gives you a kiss on your forehead. \n \n Mom: Ah! Forgot the napkin! \n \n Your mom leaves to bring you a napkin. Suddenly, you hear a loud crash from the kitchen! BOOM! \n \n You: MOM?! \n \n You quickly follow Milo into the kitchen.");
                break;
            }
            else {
                System.out.print("Choose either A or B:");
            }
            }
            //end of decision block 1//

            displayText(" You see a group of green looking goblin creatures kidnapping your parents! They were speaking a strange language that you couldn't understand. Your mom yelled out to you as the creatures had dragged them out. \n \n Mom: Honey! Go hide! Don't worry about us, we'll be okay! \n \n You: But Mom! \n \n Mom: GO! Now! \n \n .   .   .   \n");
            displayText("\nYou dropped to the floor and remained staring at the giant hole in the kitchen where your parents had just been taken through. You started sobbing uncontrollably and Milo came up to you to console you.");
            displayText("\n \nYou: What are we going to do Milo?");
            displayText("\n \nSoon it would be night time and it won't be safe to stay here. A breeze comes through the hole and you see Milo start shivering.");

            ArrayList<String> current_options = new ArrayList<String>();
            current_options.add("(+)A:Get food for you and Milo");
            current_options.add("(+)B:Pack a to-go bag");
            current_options.add("(+)C:Go and find Shelter");

            //tasks for user to complete//
            while (x.equals("true")){
                System.out.println("\n");
            
                try {System.out.println(current_options.get(0));
                } catch(Exception xException){;}

                try {System.out.println(current_options.get(1));
                } catch(Exception xException){;}

                try {System.out.println(current_options.get(2));
                } catch(Exception xException){;}
                System.out.println("\n");
                System.out.print("Choose an action:");

                String user_response = input.nextLine().toUpperCase();
                
                if (user_response.equals("A")){
                    displayText("You approach the dining table and become very sadenned as you see a served plate of spaghetti. You eat the meal and take out some doggie kibble for Milo.");
                    current_options.remove("(+)A:Get food for you and Milo");
                }

                if (user_response.equals("B")){
                    displayText("You: I\'m probably going to need water, some snacks, a blanket, and my phone charger.");
                    House home = new House(1);
                    home.printOptions();

                    //for the purposes of knowing when the person has completed their task of getting the recquired items
                    ArrayList<String> items = new ArrayList<String>();
                    items.add("some snacks");
                    items.add("water");
                    items.add("a blanket");
                    items.add("my phone charger");

                    while (x.equals("true")){
                        System.out.print("\nChoose Action(enter 'options' for moves list):");
                        String user_input = input.nextLine().toUpperCase();

                        if (user_input.equals("GO UP")){
                            home.goUp();
                        }
                        if (user_input.equals("GO DOWN")){
                            home.goDown();
                        }
                        if (user_input.equals("ENTER LIVING ROOM")){
                            home.enterLivingRoom();
                        }
                        if (user_input.equals("ENTER BEDROOM")){
                            home.enterBedroom();
                        }
                        if (user_input.equals("ENTER PARENTS ROOM")){
                            home.enterParentsRoom();
                        }
                        if (user_input.equals("ENTER KITCHEN")){
                            home.enterKitchen();
                        }
                        if (user_input.equals("ENTER BATHROOM")){
                            home.enterBathroom();
                        }
                        if (user_input.equals("CURRENT FLOOR")){
                            System.out.println("You're currently on floor "+ home.getCurrent_floor()+".");
                        } 
                        if (user_input.equals("CURRENT ROOM")){
                            System.out.println("You're currently in "+ home.getCurrent_room()+".");
                        }
                        if (user_input.equals("OPTIONS")){
                            home.printOptions();
                        }

                        if (user_input.equals("SEARCH FOR ITEMS")||user_input.equals("SEARCH ITEMS")){
                            if (home.current_room.equals("the living room")){
                                if (Me.checkInventory("my phone charger")==false){
                                    displayText("\nYou: Ah! There's my charger! \n \nYou put your charger into your bookbag.");
                                    //this is a separate inventory where the user can acquire more items than needed to complete the task
                                    Me.addInventory("my phone charger");
                                    items.remove("my phone charger");
                                } else {
                                    displayText("So many memories here...");
                                }

                            }
                            
                            if (home.current_room.equals("the bathroom")){
                                if (Me.checkInventory("tooth paste")==false){
                                    displayText("\nYou: I should probably take my toothbrush and toothpaste, just in case. \n\nYou put these items into your bookbag.");
                                    Me.addInventory("tooth paste");
                                    Me.addInventory("tooth brush");
                                } else {
                                    displayText("I got my tooth brush and tooth paste already so I should be good.");
                                }
                            }

                            if (home.current_room.equals("the kitchen")){
                                if (Me.checkInventory("some snacks")==false){
                                    displayText("\nYou opened the cabinet in the kitchen and took some water bottles, granola bars, and fruit snacks. You also packed a bag of some dog kibble for Milo.");
                                    Me.addInventory("some snacks");
                                    Me.addInventory("water");
                                    items.remove("some snacks");
                                    items.remove("water");
                                } else {
                                    displayText("I got some snacks and water already so I should be good.");
                                }
                            }

                            if (home.current_room.equals("your bedroom")){

                                if (Me.checkInventory("a blanket")==false){
                                    displayText("\nYou opened the door into your dimly lit room. You walked to your bed where you got your blanket and put it into your bookbag. As you were zipping it up, you saw the book you were last reading. You took a pause and decided you'll take it along with you too.");
                                    Me.addInventory("a blanket");
                                    items.remove("a blanket");
                                } else {
                                    displayText("I'm really going to miss my room.");
                                }

                            }

                            if (home.current_room.equals("your parents room")){
                                if (Me.checkInventory("picture of parents")==false){
                                    displayText("Being in your parent's room makes you realize how much you miss them. As you walk along their bedside table, you see a picture of all three of you on your 5th birthday. You decide to take the picture with you.");
                                    Me.addInventory("picture of parents");
                                } else {
                                    displayText("There's not much here. At least I got a picture of my parents so I'll always have them with me.");
                                }
                            }

                            if (items.size()>2){
                                displayText("\n\nYou: Alright, so all I'm missing is ");
                                int i;
                                for (i = 0; i < (items.size()-1); i++) {
                                    displayText(items.get(i)+", ");;
                                }
                                displayText("and "+items.get(items.size()-1)+".");                                
                            }
                            if (items.size()==2){
                                displayText("\n\nOkay, I'm missing "+items.get(0)+" and "+items.get(1)+".");
                            }

                            if (items.size()==1){
                                displayText("\n\nOkay, all I'm missing is "+items.get(0)+".");
                            }

                            if (items.size()==0){
                                displayText("\n\nYou: Great, I've got mostly everything I need, I think. We should probably go and find some shelter soon.");
                                break;
                            }

                        }
                    }

                    current_options.remove("(+)B:Pack a to-go bag");
                }

                //CHANGE BACK TO TRUE AFTER DONE TESTING
                if (user_response.equals("C")){
                    if (current_options.contains("(+)B:Pack a to-go bag")==true){
                        displayText("I should probably pack some things before I leave.");

                    }
                    else if (current_options.contains("(+)A:Get food for you and Milo")==true){
                        displayText("I should probably eat something before I leave.");
                    }
                    else{
                        break;
                    }
                }
            }
            //end of tasks for user to complete//


            displayText("You walked out of your house with Milo. There was nobody outside. It was getting dark and the sun would soon set. You looked around the houses in your neighborhood. A lot of them also looked abandoned.");
            displayText("\n\nYou: I can probably go to my uncle Mikey's house. He'll know what to do.");
            displayText(" \n\nAs you were walking down the street, you heard screams coming from a nearby house. You picked Milo up and hid behind a bush across the street. You heard a kid yelling for his parents.");
            displayText("\n\nKid: MOM! DAD!");
            displayText("\nYou peaked through the bush and saw a giant crater in the house. There was also a mysterious floating ship on top of it.");
            displayText("\n\nYou: They're taking them too! . . .");

            //decision block 2//

            System.out.println("\n\nA:(+) Go and help them.");
            System.out.println("B:(+) Keep watching.");
            System.out.println("C:(+) Run Away");
            System.out.print("\nMake a decision:");


            while (x.equals("true")){
                String user_response = input.nextLine().toUpperCase();

                //this user will gain a friend
                if (user_response.equals("A")){
                    displayText("You attached Milo's leash to a fence behind the bush and placed your bookbag next to him. \n\nYou: I'll be right back!");
                    displayText("\n\nYou crept up to the house and looked through the window.");
                    displayText("\n\nYou: What can I possibly do to help this family?\nYou looked around and saw a couple rocks near the house garden.\n\nYou: Maybe I can throw these rocks at them!");
                    displayText("\n\nYou began throwing many rocks at the goblins as they were hauling out the kid's parents. The kid came outside and began throwing rocks with you!");
                    displayText("\n\nKid: Please, don't take them!");
                }

                if (user_response.equals("B")){
                    displayText("You remained watching the events from behind the bush.");
                    displayText(" The kid cried out for his parents as the goblins dragged them out.");
                    displayText("\n\nKid: Please, don't take them! \n\nThe kid became so desparate he started hauling rocks at the goblins to try and stop them.");

                }
                if (user_response.equals("C")){
                    displayText("You notice an opening within a fence nearby. You decided to run with Milo through the opening in the fence.");
                    break;
                }

                displayText("\n\nThe goblins looked very confused as to where the rocks were coming from. That's when you realized . . .");
                displayText("\n\nYou: They can't see us!");
                displayText("\n\nThe attacks were no match for the 7ft tall goblins. They stood below the floating ship where they became transparent and dissappeared into the air. His parents were gone.");
                displayText(" The kid began crying in the spot where his parents vanished . . .");
                break;
            }
            displayText("\n\nAt this point in the story, the user's who decided to help the kid will make a friend that can help them with their travels and get their parents back. The users who ran away won't know about their invisibility or have a friend that helps them in their troubles.");
            displayText(" This hasn't been implemented yet, but, there will be a method updateChar() that updates the character based off of the decisions they make that will dictate the remainder of the game.");
            displayText(" The next part will be similar to the House simulation, where the user can travel within a neighborhood map ...");
            break;
        } 
        displayText("\n\n\nRest of the game . . . coming soon :)");
        input.close();

    }

}



    



