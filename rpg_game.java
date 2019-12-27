/*
 * Program: 
 * Student Name: Dhruv Shah
 * Student Number: 597327
 * Description: This program will input two numbers from the user.
 */

//password 
public class rpg_game
{
  //instance variables so they can be accessed by all methods when comparing health and points 
  private int health = 0;
  private int points = 0;
  
//this method will take a string (a) and will print it one letter at a time 
  static void slowPrint (String a)
  {
    for (int i =0; i < a.length() ; i++)
    {
      System.out.print("" + a.charAt (i));
      //wait for a little while once it prints each letter 
      try 
      {
        Thread.sleep (25); //this controls the speeed per each letter being printed
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println("");
  }
  
  public static void main(String[] args)
  {
    new rpg_game();
  }
  
  //main game 
  public rpg_game()
  {
    art.title(); 
    password();
    welcome();
    lock(); 
    gameCentral();
    System.out.println("");
    
    status(10, 10,'a'); 
    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");    
    System.out.println("\nHere is the map that you picked up from the station.\nThis will help you make choices when choosing where to go");
    
    map();
    System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
    
    instructions();
    
    System.out.println("\n\n\nComplete the following survey about the game to win free games.");
    System.out.println("bit.do/rpggame");
    
  }
  
  public void password()
  {
    String pass = "wreckIt";  //change password here
    String res = IBIO.inputString("Password: ");
    
    while(!res.equals(pass))
    {
      System.out.println("Wrong password. Try again. ");
      res = IBIO.inputString("Password: ");
    } 
  }
  public void welcome()
  {
    enter("Press enter to start the game... ");
    timer(5); //the countdown starting value 
    slowPrint("\nYou're in a dark room with an eerie vibe in the air. Its tight in here; you are not even able move. Oh no� you�re stuck.");
    slowPrint("You must get out. Looks like you have been trapped in this box.");
    slowPrint("There is a lock on the door you must figure out a way to break free. You can�t stay here forever. ");
    //asci box 
    art.box();
  }
  public void lock()
  {
    //the try catch statements below will wait 2000 milliseconds (2 seconds) before running the code from the previous statement 
    enter("Press enter to try to escape.");
    
    char action = ask2("a)Try to break open lock", "b)Try to guess the combination", 'a', 'b'); 
    
    if (action == 'a')
      System.out.println("\nSmash!! Smash!! Ofhgh!! The lock won�t break. You will have to guess the lock combination.");
    
    enter("\nPress enter to start guessing the lock combination");
    //the for look will repeat the lock combo 3 times for three different digits 
    for (int i =1; i<=3; i++)
    {
      int ans = random(1, 5);
      int num1=0;
      //while loop keeps asking question until correct answer
      while(num1 != ans)
        num1 = IBIO.inputInt("Enter a guess for number " + i + " [1-5]");
      System.out.println("Congratulations, you got digit " + i);
    }
    
  }
  
  public void gameCentral()
  {
    
    slowPrint("\n\nGreat. You have successfully broken out of the box. But what now?");
    slowPrint("Wait a second, you�re not supposed to be here. ");
    slowPrint("You are in game city, but you have to get back to Fix-it Felix, so the game can run again. ");
    slowPrint("You must. You go to Game Central Station to catch a train back to Fix-it Felix as quick as possible.");
    
    enter("Press enter to speak with a ticket booth worker");
    
    slowPrint("\nHow can I help you - said the clerk at the ticket booth");
    
    enter("\nPress enter to respond");
    
    System.out.println("\nHi, I would like a ticket to Fix-it Felix as soon as possible please.");
    wait(1000); //will delay the next line by 1000 miliseconds 
    slowPrint("\nSure thing that will be 150 points. But I am afraid you do not have that much. Sorry.");
    enter("\nPress enter to respond");
    System.out.println("\nWhat!!! I need to go back. Please, is there any other way I can get points. ");
    wait(1000);
    slowPrint("\nWell yes, if you go to the base, there is a market and you can ask someone there for points if you ");
    slowPrint("help them out. You should try that. If you want here is a map I can give to you if you ever need it or you get lost. ");    
    enter("\nPress enter to respond");
    System.out.println("\nThank you so much for the help. I need to go back to my game, so I must go to the market. ");
    enter("Press enter to go to the market.");
    
    slowPrint("\n\nYou�re at the base now. You must go ask someone if they have any points to give.");
    slowPrint("This is the only way. Let�s start the mission. Before that though here is your status on points and health."); 
    
  }
  
  public void cherries()
  {
    slowPrint("\n\nOk let�s go get the pacman cherry. Pacman is in area 2.");
    enter("Press enter to go to area 2");
    System.out.println("It is a long walk. This will take a while");
    enter("Press enter to start walking");
    wait(1000);
    
    slowPrint("\nYou are here in area 2 at the futuristic but pixelated gate. You can see the cherries inside the gate.");
    slowPrint("There are 2 of them. You must go get it. Oh no there�s a lock on this to. The only way in is to translate");
    slowPrint("the pacman sound into English. But he speaks in one sound and uses Morse code.");
    slowPrint("The only way in to get the cherries and collect the 20 points is to translate the message. ");
    
    char ans = IBIO.inputChar("\n\nDo you know Morse code. [y/n]");
    
    //points multiplier 
    
    if (ans == 'n' || ans =='N') //this is will make sure it is case senstive 
    {
      System.out.println("\nThat is not a problem. Here is a conversion chart you can use to convert the binary to letters.");
      art.morseCode();
    }
    enter("Press enter to start");
    
    System.out.println(" ._ _ .   ._  _._.  _ _  ._  _.  ..  .._.  .._  _. ");
    String morseAns = ("pacman is fun");
    
    System.out.println("\nWhat is the translation of the Pacman�s message?");
    
    String translate = IBIO.inputString("");
    
    //while loop keeps asking question until correct answer
    while( !translate.equalsIgnoreCase(morseAns) )
    {
      System.out.println("\nThat is incorrect. Try again");
      translate = IBIO.inputString("");
    }
    
    System.out.println("That is correct. You can now enter Area 2. There are two cherries.");
    enter("Press enter to pick up the cherries");
    art.cherries();
    System.out.println("You now have the cherries.");
    wait(1000);
    base();
  }
  //this method will take the amount of points and health you want to add / subtract and the action char will return a specfic value if needed
  public int status (int pointPlus, int healthPlus, char action)
  {
    
    System.out.println("*******************");
    System.out.println("*      Status     *");
    System.out.println("* Health + Points *");
    System.out.println("*******************");
    
    
    points += pointPlus; //add points to the global variable 'points'
    health += healthPlus; //add health to the global variable 'health'
    
    System.out.println("Here is your updated status:\n ");
    
    System.out.println("      Points: " + points);
    System.out.println("      Health: " + health);
    
    //the char will determine which value to return; either health or points - this was originally going to return an array and then choose which variable to return
    //however, there was not enough time to complete that
    if(action == 'h')
      return health;
    else
      return points;
    
    
  }
  
  //ask user question with two options
  public char ask2(String a, String b, char y, char z)
  {
    char t = 'z';
    //this loop will make sure the answer is one of the options and put in the two options 
    while (t!= y && t!= z )
    {
      t = IBIO.inputChar("What would you like to do\n     " + a + "\n     " + b + "\n"); 
      if (t!= y && t!= z)
        System.out.println("Error. Please enter a valid input.");
    }
    return t;
  }
  
  //this method will be called when a question is asked with three possible options
  public char ask3(String a, String b, String c, char x, char y, char z)
  {
    char t = 'z';
    //this loop will make sure the answer is one of the options and put in the two options 
    while (t!= y && t!= z && t!= x)
    {
      t = IBIO.inputChar("What would you like to do[a/b/c]3\n     " + a + "\n     " + b + "\n     " + c); 
       //keeps asking question until correct answer
      if (t!= y && t!= z && t!= x)
        System.out.println("Error. Please enter a valid input.");
    }
    return t; //return the choice the user picks 
  }
  
  //this method was created to choose a random number between num1 and num2 
  public int random(int num1, int num2)
  {
    //num1 = to the lower value and num2 = to the higher value therefore this method with choose a random number between num1 to num2
    int random = (int )(Math.random() * (num2 - num1+1) + num1);
    return random; //return the number chosen 
  }
  
  //whenever an IBIO needs to be called with a message to continue with the game the following method is used 
  public void enter(String msg)
  {
    IBIO.inputString(msg); 
  }
  
  //ascii void 
  public void map()
  {
    System.out.println("");
    System.out.println("+---------------+--------------------+");
    System.out.println("|               |                    |");
    System.out.println("|               |    +----------+    |");
    System.out.println("| Game Central  |    +  area 2  |    |");
    System.out.println("| Station \\-----+    /          |    |");
    System.out.println("|          \\        /  /+-------+    |");
    System.out.println("|      \\    \\      /  /              |");
    System.out.println("|      |\\    \\----/  +-+   +---------+");
    System.out.println("+------+ \\             |----         |");
    System.out.println("|         \\    base          area 3  |");
    System.out.println("|          |           |----         |");
    System.out.println("|          +---/  /+---+   +----|  |-+");
    System.out.println("|  forest     /  /              |  | |");
    System.out.println("|            /  /        +---+  |  | |");
    System.out.println("|      +----/  /--+      |   |  |  | |");
    System.out.println("|      |          |      |   +--|  |-+");
    System.out.println("|      | area 5   |      |           |");
    System.out.println("|      |          |      |  area 4   |");
    System.out.println("+------+----------+------+-----------+");
    System.out.println("");
    System.out.println("");   
    
  }
  
  public void instructions()
  {
    System.out.println("The purpose of this mission is to get back to Game Central Station to go back to your actual game of ");
    System.out.println("Fix-it Felix. For that you will need 60 points to buy the ticket. The first step is to go to the market");
    System.out.println("ask people if they are willing to give points. This may take a while, but you must keep trying. Good luck.");
    
    enter("\nPress enter to go back to the market and go ask people for some points.");
    
    System.out.println("You walk up to Mario, the first person you see in the market and ask him.");
    wait(1000);
    slowPrint("\nNo I don�t need anything right now. - responded Mario\n");
    
    enter("Press enter to ask someone else.");
    
    System.out.println("\nThere is Luigi, go ask him");
    
    slowPrint("\nYes sure. I need some pacman cherries for dinner tonight. If you go to area 2, you will be able to find some.");
    slowPrint("Bring me as many there are for points. -  Luigi responded\n");
    
    char next = ask2("a)Got to the area 2 and get the cherries.", "b)Go to Master Yoda for help(you can go get the cherries later)", 'a', 'b');
    
    if (next == 'b')
      yoda();
    else
      cherries();
  }
  
  //path 1 starts from yoda 
  public void yoda()
  {
    
    //dialague 
    enter("\n\nPress enter to walk inside Master Yoda's chamber");
    slowPrint("\nWelcome Ralph � Master Yoda says as you walk into his chambers. What can I do for you Ralph.");
    wait(800);
    enter("Press enter to respond to Yoda");
    System.out.println("\nI need points to go back to my original game � Fix-it Felix and I need help. Can you please help me master Yoda? ");
    wait(800);
    slowPrint("\nOh yes Ralph, you are in a tough spot here. I don�t have any points to give you, but I do have a potion that can give you more health.");
    slowPrint("This health will help you later if you decide to fight anyone for points. ");
    wait(800);
    enter("Press enter to respond");
    System.out.println("\nOk thank you so much Master. But what do I need to do to get this health?");
    wait(800);
    slowPrint("\nIt is simple. You must answer this  riddle correctly. You will be given two tries and if you can�t get them then I am afraid I can�t help you. ");
    riddle();
    
    //this will check if the user has not been to the cherries method yet as their total points will increase if they did (from 10) 
    if (points == 10)
    {
      char dec3 = ask2("a)Go to collect cherries" , "b)Go explore area 4", 'a', 'b');
      
      if (dec3 == 'a')
        cherries();
      else
        area4();
    }
    else
      area4();
  }
  

  public void riddle()
  {
    System.out.println("Here is the riddle:");
    
    //change question below
    System.out.println("\n\nTell me what game this is. I have an r in my name i was one of n64's first games I have an enemy, I have a person to save, and I am kind of a hero. ");
    
    String response = IBIO.inputString("");   
    
    //change answer below 
    String ans = "super mario bros";
    
    //try 1 for riddle
    if(!response.equalsIgnoreCase(ans))
    {
      System.out.println("Ohh I am sorry. That is the wrong answer. \nHowever I will give you one more try");
      response = IBIO.inputString("");
      
      //try 2 for riddle 
      if(!response.equalsIgnoreCase(ans))
      {
        System.out.println("Sorry there is nothing I can do for you Ralph anymore, I am afraid so. - Master Yoda says.");
        wait(500);
        System.out.println("Good luck Ralph on your journey.");
        return;  //if wrong it will leave this method                  
      } 
    }
    System.out.println("\n\nGood job Ralph, I can certainly help you today.\nHere is your health potion.");
    wait(800);
    art.potion();
    enter("\n\nPress enter to drink the potion");
    System.out.println("Great. You have gotten 2 more health lives.\n\n\n");
    
    status(0, 2, 'a'); //print updated status with 2 more health lives 
    System.out.println("\n\n");
  }
  
  //rock paper scicors game 
  public void rockPaperScicors()
  {
    char dec6 = 'a';
    //loop will allow user to play again 
    while(dec6 == 'a')
    {
      System.out.println("Please select one of [R/P/S]: ");
      String user = IBIO.inputString("");
      int comt= random(1,3); //choose a random number for computer which will correlate with a specific move 
      String comp="";
      
      //below are win lose condition 
      if (comt==1){
        comp= "Rock";
      }
      else if (comt==2){
        comp="Paper";
      }
      else if (comt==3){
        comp="Scissors";
      }
      
      if  (user.equals("R") || user.equals("r")) {
        System.out.println("You choose: Rock");
        user = "Rock";
      }
      else if (user.equals("P")||user.equals("p")) {
        System.out.println("You choose: Paper");
        user = "Paper";
      }
      else if (user.equals("S")||user.equals("s")) {
        System.out.println("You choose: Scissors");
        user = "Scissors";
      }
      else {
        System.out.println("invalid, defaulting to Rock");
        user = "Rock";
      }
      
      System.out.println("I choose: "+ comp);
      
      if (user.equals(comp)){
        System.out.println("A tie!");
      }
      else if (user.equals("Rock")) {
        if (comp.equals("Scissors"))
          System.out.println("Rock beats scissor - you win!");
        else if (comp.equals("Paper"))
          System.out.println("Paper beats rock - you lose");
      }
      else if (user.equals("Paper")) {
        if (comp.equals("Scissors"))
          System.out.println("Scissors beats paper- you lose");
        else if (comp.equals("Rock"))
          System.out.println("Paper beats rock - you win");
      }
      else if (user.equals("Scissors")) {
        if (comp.equals("Paper"))
          System.out.println("Scissors beats paper - you win!");
        else if (comp.equals("Rock"))
          System.out.println("Rock beats scissors - you lose!");
      }
      dec6 = ask2("a)Play again", "b)Continue to the base", 'a', 'b');
    }
  }
  
  public void area4 ()
  {
    System.out.println("\n\nLooks like you have wondered into Area 4.");
    enter("\nPress enter to continue into Area 4");
    
    System.out.println("\nOh no. You entered the super smash bros cactus farms. You must do something before you get hurt.\n");
    
    char x = ask3("a)Run away", "b)Hide", "c)Stay there", 'a', 'b', 'c');
    
    //using option it will decrease some number of health and display status 
    if (x == 'a')
    {
      System.out.println("\nGood you ran. You have to be quick, so these cactuses don�t catch you.");
      enter("Press enter to continue to run");
      wait(1000);
      System.out.println("\nOh no, unfortunately you were not quick enough.\nThe cactus caught your foot and you have lost one health level.");
      status(0, -1, 'a');
    }
    else if (x == 'b')
    {
      System.out.println("\nHiding didn't do anything. A cactus found you and you have lost 2 health levels.\n");
      status(0, -2, 'a');
    }
    else 
    {
      System.out.println("\nYou were not quick enough with your decisions. A cactus found you and you have lost two health points");
      status(0,-2,'a');
    }
    System.out.println("\n");
    char dec4 = ask2("a)Go to the base","b)Go and explore area 5", 'a', 'b');
    
    if(dec4 == 'a')
      base2();
    else 
      area5();
    
  }
  public void base2()
  {
    slowPrint("\n\nOh no on the way to the base a wild Sour Bill is in front of you and challenging you to a rock paper scissors game.\n");
    char x = ask2("a)Accept the challenge","b)Avoid him", 'a', 'b');
    if ( x == 'b')
      slowPrint("He is not letting you leave. You must verse him in rock paper scissors."); 
    enter("Press enter to start");
    rockPaperScicors();
    slowPrint("\nYou need to get out of here quickly. To do so you must go to the forest\n");
    enter("Press enter to go to the forest\n\n");
    forest();
    
  }
  public void area5()
  {
    System.out.println("\n\nYou have now entered Area 5. It looks like its a secret arcade room. There only seems to be one game. Interesting. You should play a game. You might eins some points. ");
    enter("Press enter to explore area 5");
    
    System.out.println("Its a number game. Looks interesting.");
    art.arcade();
    enter("");
    
    
    int magicNum = 30;
    
    
    System.out.println("I am thinking of a magic number! You must try guessing it.");
    int num1 = 0;
    int num2 = 0;
    while(num1 != magicNum && num2!= magicNum)
    {
      //take user inut of their guesses
      num1 = IBIO.inputInt("Enter your first guess:  ");
      num2 = IBIO.inputInt("Enter your second guess: ");
      
      //find larger and smaller number
      int guess1 = Math.min (num1, num2);
      int guess2 = Math.max (num1, num2);
      
      //find the truth or false statements in comparison to magic number
      boolean res1 = guess1 <= magicNum;
      boolean res2 = guess2 >= magicNum;
      
      
      //print the results 
      System.out.println ("It is " + res1 + " that the magic number is equal to or more than " + guess1);                    
      System.out.println ("It is " + res2 + " that the magic number is equal to less than " + guess2);
      
      if (num1 != magicNum && num2!= magicNum)
        System.out.println("Please try again");
    }      
    System.out.println("\n\nYou Win!!!.\nYou have won: 10 points\n\n");
    status(10, 0, 'a');
    
    char x = ask2("a)Go to the forest", "b)Go to the base" , 'a', 'b');
    if (x == 'a') 
      forest();
    else 
      base2();
    
  }
  
  //this method will wait time_ms amount of milliseconds 
  public void wait (int time_ms)
  {
    try        
    {
      Thread.sleep(time_ms);
    } 
    catch(InterruptedException ex) 
    {
      Thread.currentThread().interrupt();
    } 
  }
  
  
  
  //this method will pay the user in points for their cherries 
  public void base()
  {
    enter("Press enter to go to the market and sell the cherries.");
    
    slowPrint("\nHey Ralph, do you have those cherries for me. - Luigi asks");
    enter("Press enter to respond");
    System.out.println("\nYes I do. I am looking at selling them for points");
    int theirPrice =0;
    
    while(theirPrice == 0) //,make sure their value isnt 0
    {
      theirPrice = IBIO.inputInt("\nHow many points would you like for one? The average price is 10 points for 1.");
    }
    //10 is the recomended price that theirPrice will be compared to
    int realPrice = 10;
    
    if (theirPrice <= realPrice)  //if they offer less then 10 they will get what they want
    {
      System.out.println("\nOk we have a deal. I will give you " + (theirPrice*2) + " for the two cherries.");
      status((theirPrice*2), 0, 'a');
    }
    else
    {
      char ans = 'n';
      while(theirPrice > realPrice && ans == 'n')
      {
        realPrice++; //the counter price will go up by one each time till the user accepts 
        System.out.println("Ok our counter offer is " + realPrice);
        
        ans = IBIO.inputChar("Do you agree with the offer?[y/n]");
      }
      status((realPrice*2),0 , 'a'); //display users updated points with status 
    }
    System.out.println("");
    
    if(health == 10) //check if the user has already been to master Yoda and gotten extra health 
    {
      map();
      char x = ask2("a)Go to Area 4 ", "b)Go to Master Yoda" , 'a', 'b');
      if(x == 'b')
        yoda();
      else
        area4();    
    }
    else 
      area4();  //if they already went to Yoda they will advance to area 4 
  }
  public void forest()
  {
    slowPrint("\n\nYou are now in the forest. This is considered no mans land. Now that you have a few points you can go fight some other characters and get points."); 
    slowPrint("Each time you beat an enemy you will get points from them and when you beat the final boss you will get a massive amount of points.");
    slowPrint("However keep in mind you can also loose health and once you are at 0 health you will lose everything and have to start again so be careful.");
    char ans = IBIO.inputChar("Are you ready? [y/n]");
    if (ans == 'n')
    {
      System.out.println("\nWell its now or never. You must go fight. Good luck.");
      bonusHealth();
    }
    System.out.println("\nBut before you start fighting, you will need weapons. There looks like there are materials to build weapons deeper in the forest.");
    enter("Press enter to continue going deeper in the forest");
    System.out.println("\nOh great there are a lot of materials here to build weapons.");
    System.out.println("In order to put weapons together you must unscramble phrases, and doing so correctly will give the weapon. ");
    unscramble();
  }
  
  public void unscramble ()
  {
    System.out.println("Unscramble the following phrase to build a weapon.");
    System.out.println("\n\nDORSW REA EAGRT PSONEWA");
    String guess = IBIO.inputString("");
    //add the answer below
    String ans = "Swords are great weapons"; 
    
    //while loop keeps asking question until correct answer
    while (!guess.equalsIgnoreCase(ans))
    {
      System.out.println("Incorrect. Please try again.");
      guess = IBIO.inputString("");
    }
    System.out.println("Great, you got your first weapon\nA Sword");
    art.sword();
    
    char x = IBIO.inputChar("Would you like another weapon? [y/n]");
    
    if(x == 'y') 
    {
      System.out.println("Unscramble the following phrase for another weapon");
      System.out.println("\nHEILSDS LIWL EPEK EM EFAS");
      
      String guess2 = IBIO.inputString("");
      while (!guess2.equalsIgnoreCase("Shields will keep me safe"))
      {
        System.out.println("Incorrect. Please try again.");
        guess2 = IBIO.inputString("");
      }
      System.out.println("Great. You got another weapon:");
      System.out.println("A Shield.");
      System.out.println("This will increase your health points by 2 levels.");
      health+=2; //health will increase by 2 
    }
    fight();
  }
  public void fight()
  {
    System.out.println("Once again have a look at you current status. Make sure you dont loose all your health.\n\n");
    int yourHealth = status(0,0,'h');
    int healthEnemy = random(4,8); //choose the enemy health randomly from 4 - 8
    System.out.println("\n\nThe enemy is in front of you and has " + healthEnemy + " health points. You have " + yourHealth + " health points\n");
    
    while(healthEnemy >0 && yourHealth > 0) //make sure both the user and enemy is still alive 
    {
      System.out.println("\n");
      char ans = ask2("a) Hit","b) Block" , 'a', 'b');
      if (ans == 'a')
      {
        System.out.println("You attacked the enemy.");
        healthEnemy = healthEnemy - random(1,4);  //randomly decrease the health of the user 
        System.out.println("The enemy now has " + healthEnemy);
      }
      else 
      {
        healthEnemy--;   //if blocked then both enemy and user's health will go down by one
        yourHealth--;
        System.out.println("You blocked the hit. The enemy now has " + healthEnemy + " health left and you have " + yourHealth + " health left");
      }
    }
    if (yourHealth <= 0)
    {
      System.out.println("You have died. You must restart the game. Press enter to restart the game.");
      enter("");
    }
    //check for winner 
    else if (yourHealth > healthEnemy && healthEnemy <= 0)
    {
      System.out.println("Congratulations. You killed the enemy.");
    }
    
    gameCentral2();
    
  }
  
  public void gameCentral2()
  {
    slowPrint("\n\nPheww... That was a close one. You must go back to Game Central Station before more enemies come and buy a ticket back to Fix-it Felix.");
    slowPrint("\nYou also get 10 more points for killing the enemy.");
    status(20, 0, 'a'); //add 10 points for the enemy being killed 
    
    enter("Press enter to go to Game Central Station\n");
    map();
    System.out.println("\n\n");
    
    enter("Press enter to speak with the ticket booth agent to buy a ticket.");
    
    System.out.println("One ticket to Fix-it Felix, please");
    
    slowPrint("\nSure thing, I will be taking all your points however.");
    
    enter("Press enter to respond");
    
    System.out.println("\nSure thing. Thats fine but I did work hard to get these points but I do need to get back.");
    slowPrint("\nOk give me one moment while I get your ticket.");
    wait(1000);
    slowPrint("\nHere is your ticket: \n\n");
    art.ticket();
    wait(1000);
    enter("Press enter to go back to Fix-it Felix");
    wait(1000);
    slowPrint("Yaaa!! Congradulations. You have gotten past all of the obstacles and finanlly made it back to you original game. ");
    enter("Press enter to quit the game");  
  }
    
  //if the user doesnt want to fight then they will get specail potion
  public void bonusHealth()
  {
    slowPrint("Before you go, there seems to be some wild berries  over here that will give you extra health.\n");
    char x = IBIO.inputChar("Would you like to eat the berries. [y/n]");
    if (x == 'y')
    {
      slowPrint("Yummm, those berries were good. Those berries gave you two more health points.");
      status(0,2,'a');  //increase health by 2
    }   
  }
  
   public static void timer(int i)
  {
    //countdown from 5 to 1
    //to change how long the coundown is; change variable i 
    int j = i;
    while(i<=j && i>0)
    {
      System.out.println("The game will begin in " + i);
      try {
        Thread.sleep(1000); //1000 milliseconds is one second.
      } catch(InterruptedException ex) 
      {
        Thread.currentThread().interrupt();
      }
      i--;
    }
  }
}