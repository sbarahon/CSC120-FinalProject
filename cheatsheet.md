This file will contain documentation for all commands available in your game.

Note:  It's a good idea to also make this list available inside the game, in response to a `HELP` command.

This game is a choose your own adventure kind of story. There aren't neccesarily any cheats within the game and any possible commands or moves are provided by the prompts. As the story unfolds, most often, the only options available are A,B, or C. Which are decisions the user makes within the story. 

Within the house simulation where you have to acquire items it may be useful to call options when you input 'go up' since the options are different within different floors. It is also possible to acquire more items than indicated by the prompt by calling 'search items' in different rooms. 

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


# SPOILER ALERT
//last draft
This has not been implemented yet due to time constraints as well as working by myself, but, after the events of the last scene in the story, the map will open up into a neighborhood simulation where the user will either, depending on their decisions, plan to save their parents with a friend, plan to save their parents on their own, or end up in a catostrophic situation where it ends up being the case that the user was actually in a bad dream all along. There will definitely be a neighborhood class and this will interact with the protagonist class within the main method of the story class. 

//second draft
The Story class now is made up of House, Protagonist,and Ship objects and most methods are no longer static. I did this because I wanted the protagonist to be an attribute (in order to access the character type much easier) and it just made sense to have these other components as attributes within the story class. The main addition to this third draft is the implementation of the ship class. Instead of doing a neighborhood class, I thought it would be way more fun to do a 'spaceship' kind of interactive space.  The three different endings stem from the decision the user makes when the neighbors arre under attack. The three different endings are made when the user decides to either helps the family, watch the family and then run away, or run away when the family was under attack. The final touches will be making sure certain bugs/edge cases run smoothly, allowing the user to 'look around' within the ship object, adding comments and javadoc headers, and expanding on the ending. 

