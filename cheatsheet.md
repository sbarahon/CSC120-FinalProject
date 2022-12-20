This file will contain documentation for all commands available in your game.

Note:  It's a good idea to also make this list available inside the game, in response to a `HELP` command.

This game is a choose your own adventure kind of story. There aren't neccesarily any cheats within the game and any possible commands or moves are provided by the prompts. As the story unfolds, most often, the only options available are A,B, or C. Which are decisions the user makes within the story. There are two interactive spaces within the game which is the House and the Ship.

Within the house simulation the user is prompted to find a list of items before they leave the house. It is also possible to acquire more items than indicated by the prompt by calling 'search items' or 'search for items' in different rooms. 

When the user is on floor 2, they have following options:
(+)Enter Parents Room
(+)Enter Bedroom
(+)Enter Bathroom
(+)Go Down
(+)Search for Items
(+)Current Floor
(+)Current Room

and when the user is on floor 1, they have the following options:
(+)Enter Kitchen
(+)Enter Living Room
(+)Go Up
(+)Search for Items
(+)Current Floor
(+)Current Room

Then, there is also the Ship simulation where depending on the User type, the user will have to complete certain tasks in order to save the world. For all users, when on level 1 of the ship they have the following options:
(+)Enter Central Hub
(+)Enter Navigation Room
(+)Enter Communications Room
(+)Enter Barracks
(+)Go Up
(+)Look Around
(+)Current Level
(+)Current Room

and when they are on level 2 they have the following options:

(+)Enter Security Room
(+)Enter Medical Bay
(+)Enter Engine Room
(+)Enter Weapons Room
(+)Go Down
(+)Look Around
(+)Current Level
(+)Current Room

all users will see the same display if they call (+)Look Around in any of the rooms and all users will see the prompt (+)Find Secret Code
when they enter the security room.

Users that are type A and B will see the prompt (+)Look for Translator when inside the Communications room and (+)Hijack Ship when they are in the Weapons room.

Users that are type C will see the prompt, (+)Get the Specimen when they are in the medical bay and (+)Upload Specimen when they are in the navigation room. 


# SPOILER ALERT
//first draft
This has not been implemented yet due to time constraints as well as working by myself, but, after the events of the last scene in the story, the map will open up into a neighborhood simulation where the user will either, depending on their decisions, plan to save their parents with a friend, plan to save their parents on their own, or end up in a catostrophic situation where it ends up being the case that the user was actually in a bad dream all along. There will definitely be a neighborhood class and this will interact with the protagonist class within the main method of the story class. 

//second draft
The Story class now is made up of House, Protagonist, and Ship objects and most methods are no longer static. I did this because I wanted the protagonist to be an attribute (in order to access the character type much easier) and it just made sense to have these other components as attributes within the story class. The main addition to this third draft is the implementation of the ship class. Instead of doing a neighborhood class, I thought it would be way more fun to do a 'spaceship' kind of interactive space.  The three different endings stem from the decision the user makes when the neighbors are under attack. The three different endings are made when the user decides to either helps the family, watch the family and then run away, or run away when the family was under attack. The final touches will be making sure certain bugs/edge cases run smoothly, allowing the user to 'look around' within the ship object, adding comments and javadoc headers, and expanding on the ending.  




