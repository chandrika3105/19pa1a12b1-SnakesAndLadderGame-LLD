# SnakesAndLadderGame
Design of simple SnakeAndLadderGame using java oop concepts
# Low Level Design
  - Low Level Design in short called as LLD.
  - It is also known as micro level/detailed design.
  - It describes detailed description of each and every module.
  - Low Level Design expresses details functional logic of the module.
  - It is created by designers and developers.
  - Here in Low Level Design participants are design team, Operation Teams, and Implementers.
  - Low Level Design converts the High Level Solution into Detailed solution.
# Functioning
  - This code contains 5 modules:
    - Player
    - Jumper
    - Dice
    - GameBoard
    - SnakeAndLadderGame
  - Starting from the inputs, this code game takes following inputs from user:
    - Number of Dice
    - Number of Players
    - Names of Players
    - Size of Board Required
    - Number of Snakes Required
    - Positions where the snakes needed to be placed
    - Number of Ladders Required
    - Positions where the ladders needed to be placed
# Player module
  - This module contains a getter method getName() to retrive the name of the player.
# Jumper module
  - This module contains the start and end positions.
  - It is used by both snakes and ladders.
# Dice module
  - This module is used to return the moves the player has to move on the board.
  - It also contains code which controls turns.
  - Controlling turns in the sense if the player is using 1 dice and if he throws 6 then he will have another chance and if he continously throws 6 for 3 times then he looses his turn.
# GameBoard module
  - This module contains the startGame() method which is used to begin the game.
  - This method runs continuously until all the players finished the game and if one player is remanined then he will be considered as last and game ends.
  - Each time the player postion and status is printed.
  - Status is wheather he climed a ladder or came down because of a snake.
  - Every time the position is updated using a HashMap.
# SnakeAndLadderGame module
  - This is the main module.
  - Here the inputs are taken and stored in respective lists and hashmaps.
  - From here the startGame() method is called.
# Output
![output](https://raw.githubusercontent.com/chandrika3105/SnakesAndLadderGame/main/output1.png)
![output](https://raw.githubusercontent.com/chandrika3105/SnakesAndLadderGame/main/output2.png)
![output](https://raw.githubusercontent.com/chandrika3105/SnakesAndLadderGame/main/output3.png)
  
