import java.util.ArrayList;
import java.util.Scanner;

/**
 * Defines a story class
 */
public class Story{
    Protagonist character;
    House home;
    Ship myShip;

    public Story(){
        this.character= new Protagonist();
        this.home = new House(1);
        this.myShip = new Ship(1);
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

    public void ending(){
        if (character.getType().equals("A")){
            displayText("The Goblins discover you and Jay in your attempts to hijack the ship. However, you are able to strike a deal in which the Goblins inhabit Mars instead and leave the humans on Earth");
        }
        if (character.getType().equals("B")){
            displayText("The goblins discover you in your attempt to hijack the ship. They take you to their lair and try to dissect you but then you wake up and it was all a dream!");
        }
        if (character.getType().equals("C")){
            displayText("You were able to help the Goblins update their system and identify the missing kids on Earth!");
        }
    }

    //this character knows about invisiblity and has a friend, they will go and fight the goblins together in their space ship
    public void story_one(){
        character.updateChar("A");
        displayText("\n\n\nYou: Hey, the same thing happened to me. One moment everything was normal, and then the next, my parents were just gone. I don't know what they are or why they're doing this.");
        displayText("\n\nKid: Do you think they're still alive?");
        displayText("\n\nYou: I really hope so. You should pack a bag though, we can't stay here. I'll be right back.\n\nYou went back behind the bush to get Milo and brought him to the kid's house.");
        displayText("\n\nKid: You have a dog?!\n\nYou: Yeah, this is Milo. \n\nThe kid petted Milo and giggled as Milo licked his face.");
        displayText("\n\nYou: So, what's your name?\n\nKid: My name is Jay. What about you?\n\nYou: I'm Riley. How old are you?");
        displayText("\n\nJay: I'm 10.\n\nYou: I'm 12. I guess I was young enough not to be seen by those . . . things.");
        displayText("\n\nJay: Where do you think we should go?");
        displayText("\n\nYou: I thought about going to my uncle Mikey's house, but, they seem to be hitting all the houses. There must be some place they won't think to go . . .");
        displayText("\n\nKid: What about the library?");
        displayText("\n\nYou: Hmmmm. Actually, that doesn't sound like a bad idea. We'll pack some things and head to the library!");        
        displayText("\n\nYou and Jay packed some things up and you all went out into the night  .  .  .");
        displayText("\n\nAs you all were walking in the dark street, you both saw a dim light in the distance. As you all got closer, you realized it was another ship!");
        displayText("\n\nYou: Jay, let's stand under the ship.");
        displayText("\n\nJay: We should what?!");
        displayText("\n\nYou: Think about it! They can't see us! We can go in without being seen and get our parents back!");
        displayText("\n\nJay: I don't know about this . . .");
        displayText("\n\nYou: Come on! We can do it!\n\nYou walked toward the ship with Milo and Jay followed behind you. You both took a deep breath and then stepped under the fluorecent lights shining down from the ship.");
        displayText("\n\nThe air around turned misty until you were all engulfed in a white expanse.");
    }

    //this character knows about invisibility but does not have a friend
    public void story_two(){
        character.updateChar("B");
        displayText("You and Milo made your way across the neighborhood.");
        displayText("\n\nYou: It seems like they're hitting all the houses so going to Uncle Mikey's doesn't sound like a good idea. The best place to go to might be the library.");
        displayText("\n\nAs you and Milo were walking down the quiet streets, you saw a dim light in the distance. As you got closer, you realized it was another ship!");
        displayText("\n\nYou: Maybe if I stand under the ship, I'll go to the same place my parents went.");
        displayText("\n\nYou picked up Milo, took a deep breath, and then stepped under the fluorecent lights shining down from the ship.\n\nThe air around turned misty until you were both engulfed in a white expanse.");
    }

    //this character does not know about invisibility and does not have a friend
    public void story_three(){
        character.updateChar("C");
        displayText("\n\nYou and Milo made your way across the neighborhood. After a couple minutes you made it to your uncle Mikey's house. As you got closer you realized there was also a giant hole in his house.");
        displayText("\n\nYou: This can't be true. They also took uncle Mikey? Did they hit every house in this neighborhood?");
        displayText("\n\nYou looked around at the vacant house and became very frustrated.\n\nYou: What are we going to do Milo?");
        displayText("\n\nYou started sobbing in the middle of the living room. As you were sniffling, you heard shuffling noises. Milo started barking and ran towards the kitchen.");
        displayText("\n\nYou ran right after him. When you turned the corner into the hallway you bumped into a shorter sized green goblin. You both fell to the floor and you both yelled out!");
        displayText("\n\nYou: AHH!!");
        displayText("\n\nGoblin:$###%@!!");
        displayText("\n\nYou: What are you!?\n\nThe goblin stammered as it lifted itself off the floor.");
        displayText("\n\nGoblin: $$#$ %&*$$#$ @#$$#");
        displayText("\n\nYou waved your hands in frustration.\n\nYou: I can't understand you!");
        displayText("\n\nThe goblin seemed to understand that you couldn't understand it's language. It pulled out a small black box from a satchel attached to it's clothing. The goblin held it up to you and scanned you with a dark blue light.");
        displayText("\n\nThe goblin took the black box and blew into it like a harmonica. The noise it created sounded like the entire english language spoken in a single syllable.");
        displayText("\n\nThe goblin then put the black box away and braced itself to say . . .");
        displayText("\n\nGoblin: Hello?");
        displayText("\n\nYou: What on earth is going on?");
        displayText("\n\nGoblin: Human, you are in grave danger, what are you still doing on this planet?");
        displayText("\n\nYou: UM, I don't know. One moment I was in my house with my parents and the next a bunch of green monster things kidnapped my parents and left me and my dog stranded.");
        displayText("\n\nGoblin: Well, we're not monsters. We are inhabitants of a neighboring galaxy. You can call us goblins. Also, you can't be here! A meteor is making it's way to this planet in 2 days. Why didn't the others take you along with your parents?");
        displayText("\n\nYou: You're the only one whose been able to see me so far. It seems like kids or dogs can't be seen by older goblins.");
        displayText("\n\nGoblin: Hmmmm, something is definitely wrong. We'll have to alert all the elders at the base.");
        displayText("\n\nYou picked up Milo and followed the goblin to the back of the house where a smaller ship was hovering. The goblin beckoned you to join him underneath the fluorecent lights shining down from the ship. You took a deep breath and stepped into the lights.\n\nThe air around turned misty until you were all engulfed in a white expanse.");
    }

    public void intoTheShip(){
        if (character.getType().equals("C")){
            displayText("\n\n   .   .   .  Transporting to the base  .    .    .   ");
            displayText("\n\nYou, Milo, and the goblin all appeared in a giant white room with a bunch of people from the neighborhood everywhere.");
            displayText("\n\nEveryone was wearing dark blue overalls and sitting around round tables. There was a 360 degree view of space across the room and Earth was visible below the ship.");
            displayText("\n\nYou: Oh my god. We are no longer on Earth. ");
            displayText("\n\nGoblin: Welcome to the base! This is the central hub. You see, we're keeping the entire human race in these satellites until Earth is safe to inhabit again.");
            displayText("\n\nI have to take you to the elders and let them know there are still humans on the planet.");
            displayText("\n\nThe goblin handed you a black box and clipped it to your clothing. \n\nGoblin: This will translate the elder's speech for you.");
            displayText("\n\nThe goblin took you and Milo through a very long hallway. At the end there was a big golden door that opened into a giant red auditorium with four giant chairs.");
            displayText("\n\nWithin the chairs sat four immense goblins facing the door.");
            displayText("\n\nGoblin: Hello . . . your greatness . . . I've returned from Earth with crucial information that you must know immediately.");
            displayText("\n\nElder 1: Go on . . .");
            displayText("\n\nGoblin: Well .  . you see . . the issue is that, there are still inhabitants on planet Earth.");
            displayText("\n\nElder 3: Impossible! We've sent the troops and got wind that Earth has been wiped clean of all humans.");
            displayText("\n\nGoblin: Well, they just forgot .. some. You see there are younger . . smaller humans on Earth that haven't been detected by the system.");
            displayText("\n\nElder 3: Nonsense!");
            displayText("\n\nElder 1:Do you have any way to prove your allegations?");
            displayText("\n\nGoblin: Well ... um . . . I brought one with me. The human is standing right next to me!");
            displayText("\n\nElder 2: I don't see a thing.");
            displayText("\n\nElder 3: Has he gone mad?");
            displayText("\n\nYou: I have an idea! \n\nYou pulled out your blanket from your bookbag and draped it over yourself. You began to jump up and down and flail your arms.");
            displayText("\n\nYou: I'm right here!");
            displayText("\n\nThe elders gasped!");
            displayText("\n\nElder 4: Brothers, we have made a grave mistake! We must acquire a specimen at once, update the system, and prepare the troops for a second trip to Earth.");
            displayText("\n\nThe elders reconvened with the goblin while you waited outside. Shortly after, the goblin exited the room.");
            displayText("\n\nGoblin: Okay, so, since you're the only young human we've come in contact with, we need you to do a couple things for us.");
            displayText("\n\nFirst, we need you to go to the Medical Bay to acquire a specimen. You'll upload that specimen in the Navigations room but you need to go to Security for the secret code first.");
            displayText("\n\nI would help you but I have to join the troops ready to embark. Good luck!");
        } 

        if (character.getType().equals("B")){
            displayText("\n\n   .   .   .  Transporting to the base  .    .    .   ");
            displayText("\n\nYou and Milo appeared in a giant white room with a bunch of people from the neighborhood everywhere.");
            displayText("\n\nEveryone was wearing dark blue overalls and sitting around round tables. There was a 360 degree view of space across the room and Earth was visible below the ship.");
            displayText("\n\nYou: Oh my god. We are no longer on Earth.");
            displayText("\n\nA women noticed that you were the only kid in the room. She went up to you and asked . . .");
            displayText("\n\nWoman: Hey kid, how'd you get here?");
            displayText("'\n\nYou: I just stood under one of the ships and it transported me here. It doesn't appear as if the goblins can see kids.");
            displayText("\n\nWoman: None of us have any idea why we're here but since you can roam around undetected maybe you can figure out for us!");
            displayText("\n\nWoman: There's a communications room where you can get a translator. They won't grant us access but maybe you can sneak in.");
            displayText("\n\nThen you can take a goblin outfit from the barracks and sneak get into the weapons room. They keep smaller ships there so we may be able to escape!");
            displayText("\n\nThe fate of humanity may very well be in your hands kid. Good luck!");
        }

        if (character.getType().equals("A")){
            displayText("\n\n   .   .   .  Transporting to the base  .    .    .   ");
            displayText("\n\nYou all appeared in a giant white room with a bunch of people from the neighborhood everywhere.");
            displayText("\n\nEveryone was wearing dark blue overalls and sitting around round tables. There was a 360 degree view of space across the room and Earth was visible below the ship.");
            displayText("\n\nYou: Oh my god. We are no longer on Earth.\n\nYou and Jay looked through the glass with amazement.");
            displayText("\n\nJay: Woah. This is trippy.");
            displayText("\n\nA women noticed that you and Jay were the only kids in the room. She went up to you and asked . . .");
            displayText("\n\nWoman: Hey, how'd you kids get here?");
            displayText("'\n\nYou: We just stood under one of the ships and it transported us here. It doesn't appear as if the goblins can see kids.");
            displayText("\n\nWoman: None of us have any idea why we're here but since you two can roam around undetected maybe you can figure out for us!");
            displayText("\n\nWoman: There's a communications room where you can get a translator. They won't grant us access but maybe you can sneak in.");
            displayText("\n\nThen you find the secret code to the weapons room in the security room. They keep the ships in the weapons room so we may be able to escape!");
            displayText("\n\nThe fate of humanity may very well be in your hands. Good luck!");
        }

        ArrayList<String> tasks = new ArrayList<String>();

        if (character.getType().equals("A") || character.getType().equals("B")){
            tasks.add("get a translator from the communications room");
            tasks.add("get the secret code to the weapons room in the Security room");
            tasks.add("sneak into the weapons room and hijack a ship");
        }

        if (character.getType().equals("C")){
            tasks.add("get a specimen of my DNA in the Medical Bay");
            tasks.add("get the secret code to the Navigation room in the Security room");
            tasks.add("upload my DNA to the system in the Navigation room");
        }

        String x="true";
        Scanner input = new Scanner(System.in);

        myShip.printOptions();

        while (x.equals("true")) {

            System.out.print("\nChoose an Action(Enter 'options' for moves list):");
            String user_response = input.nextLine().toUpperCase();

            if (user_response.equals("GO UP")){
                myShip.goUp();
            }
            if (user_response.equals("GO DOWN")){
                myShip.goDown();
            }
            if (user_response.equals("CURRENT ROOM")){
                System.out.println("You're currently in "+ myShip.getCurrent_room()+"\n");
            }
            if (user_response.equals("CURRENT LEVEL")){
                System.out.println("You're currently on level "+ myShip.getCurrent_floor()+"\n");
            }
            if (user_response.equals("ENTER CENTRAL HUB")){
                myShip.enterCentralHub();
            }

            if (user_response.equals("ENTER NAVIGATION")){
                if (myShip.current_floor==1){
                    System.out.print("\nEnter the secret code to access the Navigation Room:");
                    String user_input = input.nextLine().toUpperCase();
                    if (user_input.equals("1234")){
                        displayText("\nSuccess! Access Granted.\n");
                        
                        myShip.enterNavigation();

                        System.out.println("(+)Look Around");

                        if (character.getType().equals("C") && tasks.contains("upload my DNA to the system in the Navigation room")){
                            System.out.println("(+)Upload Specimen");
                        }
                    } else {
                        displayText("Error. Incorrect code. Access Denied.");
                    }
                } else {
                    System.out.println("\nYou need to go to Level 1 to go to the Navigation Room.");
                }   
                
            }

            if (user_response.equals("ENTER COMMUNICATIONS" )){
                myShip.enterCommunications();
                System.out.println("(+)Look Around");

                if (character.getType().equals("A")|| character.getType().equals("B")){
                   if (character.checkInventory("translator")==false){
                    System.out.println("(+)Look for Translator");
                    }
                }
            }

            if (user_response.equals("ENTER BARRACKS" )){
                myShip.enterBarracks();
            }

            if (user_response.equals("ENTER SECURITY" )){
                myShip.enterSecurity();
                System.out.println("(+)Look Around");

                //all characters have to acquire a secret code
                if (character.checkInventory("secret code")==false){
                    System.out.println("(+)Find Secret Code");
                }
            }

            if (user_response.equals("ENTER MEDICAL BAY" )){
                myShip.enterMedBay();
                System.out.println("(+)Look Around");

                if (character.getType().equals("C") && character.checkInventory("specimen")==false){
                    System.out.println("(+)Get the Specimen");
                }

            }

            if (user_response.equals("ENTER ENGINE ROOM" )){
                myShip.enterEngineRoom();
            }

            if (user_response.equals("ENTER WEAPONS" )){

                if (myShip.current_floor==2){
                    System.out.print("\nEnter the secret code to access the Weapons Room:");
                    String user_input = input.nextLine().toUpperCase();
                    if (user_input.equals("5678")){
                        displayText("\nSuccess! Access Granted.\n");
                        
                        myShip.enterWeaponsRoom();
                        System.out.println("(+)Look Around");

                        if (character.getType().equals("A") || character.getType().equals("B")){
                            if(tasks.contains("sneak into the weapons room and hijack a ship")){
                                System.out.println("(+)Hijack Ship");
                            }

                        } else {
                        displayText("Error. Incorrect code. Access Denied.");
                        }
                    } else {
                        System.out.println("\nYou need to go to Level 2 to go to the Weapons Room.");
            
                    }
                }

            }
            

            if (user_response.equals("OPTIONS")){
                myShip.printOptions();
            }

            //character A//
            if (character.getType().equals("A")){

                if (user_response.equals("FIND SECRET CODE")){
                    if (myShip.current_room.equals("the Security Room")&& character.checkInventory("secret code")==false && character.checkInventory("translator")==true){
                        displayText("You looked amoung the various computers and monitors. You saw a directory on the wall that had all the areas on the ship.");
                        displayText(" You observed the directory until you found . . .");
                        displayText("\n\nYou: Aha! The secret code to the Weapons Room is . . . 5678?");
                        displayText("\n\nYou looked at Jay who looked back up at you.");
                        displayText("\n\nYou: Not very creative for a high-tech goblin ship. Let's write this down so we don't forget when we go to the Weapons Room!");
                        character.addInventory("secret code");
                        tasks.remove("get the secret code to the weapons room in the Security room");
                    } else { 
                        displayText("We should really get that translator so I can understand what all these signs mean . . .");
                    }
                } 

                if (user_response.equals("LOOK FOR TRANSLATOR") && myShip.current_room.equals("the Communications Room")&& character.checkInventory("translator")==false){
                    displayText("\n\nYou looked amoung the various speaking devices within the room. You saw a little black box that had strange text inscribed on it.");
                    displayText("\n\nYou: What's this thing?\n\nUpon touching the black box it shot out a dark blue light and began scanning you. After it was done you held up the black box to your ear and it was letting out very faint whispering noises.");
                    displayText("\n\nLittle by little, you looked around the room and the various signs and texts began to make sense!");
                    displayText("\n\nYou: This must be the translator! We'll be able to understand their language now!");
                    character.addInventory("translator");
                    tasks.remove("get a translator from the communications room");
                }
                if (user_response.equals("HIJACK SHIP")&& myShip.current_room.equals("the Weapons Room")){
                    displayText("You and Jay looked around the numerous ships and climbed the stairs into one of them.");
                    displayText("\n\nYou: How do we turn this on?\n\nYou both looked through the various buttons and found a big large green button.");
                    displayText("\n\nJay: Maybe it's this one . . .");
                    displayText("\n\nUpon pressing the button all the lights in the ship turned on and it made a very loud humming noise");
                    tasks.remove("sneak into the weapons room and hijack a ship");
                } 
            }

            //character B//

            if (character.getType().equals("B")){

                if (user_response.equals("FIND SECRET CODE")){
                    if (myShip.current_room.equals("the Security Room")&& character.checkInventory("secret code")==false && character.checkInventory("translator")==true){
                        displayText("You looked amoung the various computers and monitors. You saw a directory on the wall that had all the areas on the ship.");
                        displayText(" You observed the directory until you found . . .");
                        displayText("\n\nYou: Aha! The secret code to the Weapons Room is . . . 5678?");
                        displayText("\n\nYou looked down at Milo who looked back up at you.");
                        displayText("\n\nYou: Not very creative for a high-tech goblin ship. I'll write this down so I won't forget when we go to the Weapons Room!");
                        character.addInventory("secret code");
                        tasks.remove("get the secret code to the weapons room in the Security room");
                    } else { 
                        displayText("I should really get that translator so I can understand what all these signs mean . . .");
                    }
                } 

                if (user_response.equals("LOOK FOR TRANSLATOR") && myShip.current_room.equals("the Communications Room")&& character.checkInventory("translator")==false){
                    displayText("\n\nYou looked amoung the various speaking devices within the room. You saw a little black box that had strange text inscribed on it.");
                    displayText("\n\nYou: What's this thing?\n\nUpon touching the black box it shot out a dark blue light and began scanning you. After it was done you held up the black box to your ear and it was letting out very faint whispering noises.");
                    displayText("\n\nLittle by little, you looked around the room and the various signs and texts began to make sense!");
                    displayText("\n\nYou: This must be the translator! I'll be able to understand their language now!");
                    character.addInventory("translator");
                    tasks.remove("get a translator from the communications room");
                }
                if (user_response.equals("HIJACK SHIP")&& myShip.current_room.equals("the Weapons Room")){
                    displayText("You looked around the numerous ships and climbed the stairs into one of them.");
                    displayText("\n\nYou: How do I turn this on?\n\nYou looked through the various buttons and found a big large green button.");
                    displayText("\n\nYou: Maybe it's this one . . .");
                    displayText("\n\nUpon pressing the button all the lights in the ship turned on and it made a very loud humming noise");
                    tasks.remove("sneak into the weapons room and hijack a ship");
                } 

            }

            
            //character C//
            if (character.getType().equals("C")){
               if (user_response.equals("FIND SECRET CODE")&& myShip.current_room.equals("the Security Room")&& character.checkInventory("secret code")==false){
                    displayText("You looked amoung the various computers and monitors. You saw a directory on the wall that had all the areas on the ship.");
                    displayText(" You observed the directory until you found . . .");
                    displayText("\n\nYou: Aha! The secret code to the Navigation Room is . . . 1234?");
                    displayText("\n\nYou looked down at Milo who looked back up at you.");
                    displayText("\n\nYou: Not very creative for a high-tech goblin ship. I'll write this down so I won't forget when we go to the Navigation Room!");
                    character.addInventory("secret code");
                    tasks.remove("get the secret code to the Navigation room in the Security room");
                }
                if (user_response.equals("GET THE SPECIMEN")&& myShip.current_room.equals("the Medical Bay")&& character.checkInventory("specimen")==false){
                    displayText("You walked up to one of the platforms in the medical bay. You stood on top of it and a bunch of lasers began scanning you from every direction.");
                    displayText(" After you were done being scanned the machine made several whirring noises and finally spit out a small grey USB");
                    displayText("\n\nYou: This must be the specimen! I have to take this to the Navigation Room");
                    character.addInventory("specimen");
                    tasks.remove("get a specimen of my DNA in the Medical Bay");
                }
                if (user_response.equals("UPLOAD SPECIMEN")&& myShip.current_room.equals("the Navigation Room")&& character.checkInventory("specimen")==true){
                    displayText("You went up to the giant computer in the navigation room. There were various ports and cords coming in and out of the computer.");
                    displayText("\n\nYou: Hmmm . . . I can't seem to find the USB port anywhere . . .");
                    displayText("\n\nYou: Oh! There it is!");
                    displayText("\n\nYou took out the USB and connected it into the port. The screen switched on and displayed a loading bar.");
                    displayText("\n\n SPECIMEN LOADING . . . . . . . . . Complete.");
                    displayText("\n\nAwesome! I've completed all tasks I had to do. I guess I'll go back to the Central Hub now and wait with the others...");
                    tasks.remove("upload my DNA to the system in the Navigation room");
                } 
            }

            if (tasks.size()==0){
                break;
            }

        }
        
         input.close();
    }

    public void packBag(){
        String x="true";
        Scanner input = new Scanner(System.in);
        displayText("You: I\'m probably going to need water, some snacks, a blanket, and my phone charger.");
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
                    if (character.checkInventory("my phone charger")==false){
                        displayText("\nYou: Ah! There's my charger! \n \nYou put your charger into your bookbag.");
                        //this is a separate inventory where the user can acquire more items than needed to complete the task
                        character.addInventory("my phone charger");
                        items.remove("my phone charger");
                    } else {
                        displayText("So many memories here...");
                    }

                }
                
                if (home.current_room.equals("the bathroom")){
                    if (character.checkInventory("tooth paste")==false){
                        displayText("\nYou: I should probably take my toothbrush and toothpaste, just in case. \n\nYou put these items into your bookbag.");
                        character.addInventory("tooth paste");
                        character.addInventory("tooth brush");
                    } else {
                        displayText("I got my tooth brush and tooth paste already so I should be good.");
                    }
                }

                if (home.current_room.equals("the kitchen")){
                    if (character.checkInventory("some snacks")==false){
                        displayText("\nYou opened the cabinet in the kitchen and took some water bottles, granola bars, and fruit snacks. You also packed a bag of some dog kibble for Milo.");
                        character.addInventory("some snacks");
                        character.addInventory("water");
                        items.remove("some snacks");
                        items.remove("water");
                    } else {
                        displayText("I got some snacks and water already so I should be good.");
                    }
                }

                if (home.current_room.equals("your bedroom")){

                    if (character.checkInventory("a blanket")==false){
                        displayText("\nYou opened the door into your dimly lit room. You walked to your bed where you got your blanket and put it into your bookbag. As you were zipping it up, you saw the book you were last reading. You took a pause and decided you'll take it along with you too.");
                        character.addInventory("a blanket");
                        items.remove("a blanket");
                    } else {
                        displayText("I'm really going to miss my room.");
                    }

                }

                if (home.current_room.equals("your parents room")){
                    if (character.checkInventory("picture of parents")==false){
                        displayText("Being in your parent's room makes you realize how much you miss them. As you walk along their bedside table, you see a picture of all three of you on your 5th birthday. You decide to take the picture with you.");
                        character.addInventory("picture of parents");
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
        input.close();
    }

    public static void main(String[] args){

        Story story = new Story();
        //uncomment after done testing code
        displayText("You\'re in your dimly lit bedroom reading Harry Potter: The Chamber of Secrets underneath the violet LED lights wrapped around the ceiling. Your pet dog Milo is cuddled up beside you. You\'ve just gotten back from school and your mom is almost done making dinner, spaghetti with shrimp, you\'re favorite! You\'re almost done reading the chapter, until…\n");

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
                    story.packBag();
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
            displayText("\n\nYou peaked through the bush and saw a giant crater in the house. There was also a mysterious floating ship on top of it.");
            displayText("\n\nYou: They're taking them too! . . .");

            //decision block 2//

            System.out.println("\n\nA:(+) Go and help them.");
            System.out.println("B:(+) Keep watching.");
            System.out.println("C:(+) Run Away");
            System.out.print("\nChoose an action:");


            while (x.equals("true")){
                String user_response = input.nextLine().toUpperCase();

                //this user will gain a friend
                if (user_response.equals("A")){
                    displayText("\nYou attached Milo's leash to a fence behind the bush and placed your bookbag next to him. \n\nYou: I'll be right back!");
                    displayText("\n\nYou crept up to the house and looked through the window.");
                    displayText("\n\nYou: What can I possibly do to help this family?\n\nYou looked around and saw a couple rocks near the house garden.\n\nYou: Maybe I can throw these rocks at them!");
                    displayText("\n\nYou began throwing many rocks at the goblins as they were hauling out the kid's parents. The kid came outside and began throwing rocks with you!");
                    displayText("\n\nKid: Please, don't take them!");
                }

                //make each branch a method in story class
                if (user_response.equals("B")){
                    displayText("\nYou remained watching the events from behind the bush.");
                    displayText(" The kid cried out for his parents as the goblins dragged them out.");
                    displayText("\n\nKid: Please, don't take them! \n\nThe kid became so desparate he started hauling rocks at the goblins to try and stop them.");

                }
                if (user_response.equals("C")){
                    displayText("You notice an opening within a fence nearby. You decided to run with Milo through the opening in the fence.");
                    story.story_three();
                    break;
                }

                displayText("\n\nThe goblins looked very confused as to where the rocks were coming from. That's when you realized . . .");
                displayText("\n\nYou: They can't see us!");
                displayText("\n\nThe attacks were no match for the 7ft tall goblins. They stood below the floating ship where they became transparent and dissappeared into the air. His parents were gone.");
                displayText(" The kid began crying in the spot where his parents vanished   .   .   .  ");

                if (user_response.equals("B")){

                    System.out.println("\n\nA:(+) Go and console him.");
                    System.out.println("B:(+) Runaway.");
                    System.out.print("\nChoose an action:");

                    String response = input.nextLine();

                    if(response.equals("A")){
                        displayText("\n\nYou attached Milo's leash to a fence behind the bush and placed your bookbag next to him. \n\nYou: I'll be right back!");
                        displayText("\n\nYou walked up to the kid and sat next to him.");
                        story.story_one();
                        

                    }
                    if(response.equals("B")){
                        story.story_two();
                    }
                    break;

                }

                story.story_one();
                break;
            }
            break;
        } 

        story.intoTheShip();
        story.ending();
        displayText("\n\n\nThanks for playing :) . . .");
        input.close();
    }

}



    



