# CSC120-FinalProject

//final project reflection

To sum up this game, it is a choose your own adventure story about a kid who is essentially experiencing an alien invasion and must navigate the world without their parents by their side. The entirety of the game is run by the main method within the Story class, which is comprised of House, Protagonist, and Ship objects. 

My overall approach for the game was for the user to make sort of interesting or difficult decisions in the context of an exciting story of adventure. Some things I learned a long the way were like how to account for all the different inputs or typos that could happen within the game. I had to pivot to having decision blocks within loops because it will just continue prompting the user to input a decision until they input one that makes sense or is recognized by the code. I also had to learn how to troubleshoot with scanner objects because I was running into an issue where if I called other methods within main and opened new scanner objects it caused trouble with the scanner established in main and gave an error. I was able to fix the bug by inputting the established scanner in main into the other methods I was calling as a parameter instead of opening and closing a new one. 

If I had more time I definitely would have wanted to implement more decision making and possibly more dialogue. In the interest of time and since I was working by myself I implemented as much dialogue and decision-making I could but if I had I would have wanted to have a neighborhood class where the user interacts with other people and kids before heading into the Ship. I also wanted to make it so that the user can access and utilize any items within their inventory at any given moment. I sort of made use of the inventory at the end of the game where the users B or C who search in their parents room in the house simulation are given the chance of reuniting with their parents at the end. If I had more time I definitely would have made the inventory a bigger part of the game. A helpful piece of feedback I received was from a fellow classmate who suggested I make like certain commands shorter, so, instead of just accepting 'search for items', the program also recognizes shorter inputs like "search items". I also asked my friends not in the class to test it out and they asked if there was a possible way to skip the scrolling text like if a user wanted to press spacebar and have all the text appear. In the interest of time, I didn't explore that option, but, I definitely wanted to add that as a possible feature to the game.

Most of the game is run in main which then calls other methods from the story class at the appropiate times. An alternative I considered was not making the game a sort of story like choose your own adventure, and just making the user complete certain tasks, kind of similar to Zork where the user just spawns and has to figure out the game, but, I feel like I chose to do it the way I did so it was more clear like what the user's objective was and what the end goal of certain actions should be. 

If I could go back in time I would tell myself to just start coding and writing things in without having an end goal in mind. I feel like since I was really unsure about what direction I wanted to take the game in, I struggled in the beginning to start the game, but, once I started coding things it all just kind of fell in place! 