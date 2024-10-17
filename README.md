# Welcome to GO_Bird 🐤

Go_Bird is a simple Java-based 2D game. The player controls a bird that flies through randomly generated pipes, trying to avoid collisions and achieve the highest score.




<div align="center">
   <img src="src/Go_Bird.png" alt="Go Bird Screenshot" width="600"/>
</div>




## Features
- Simple and intuitive gameplay
- Randomly generated pipes with varying heights
- Score system based on successfully passing through pipes
- Restart the game after a loss with a small delay

## Prerequisites
To run Go_Bird, ensure that you have the following installed on your system:
- Java Development Kit (JDK) 8 or later
- Any IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans, VScode) or a basic text editor and terminal for compiling

### Controls:

   1. Press `SPACE` to make the bird fly. ⬆️
   2. Avoid the pipes! 🏗️
   3. Pass through pipes to increase your score. 🔢
   4. If you hit a pipe or the ground, it’s game over! 😢
   


### Game Logic
   #### Bird
   The bird's position is controlled by the player using the spacebar. The bird constantly falls due to gravity, and each spacebar press makes the bird jump upward.

   #### Pipes
   Pipes are generated randomly with a small gap in between. The bird needs to fly through the gap to avoid collisions. Pipes move from right to left across the screen.

   #### Game Over
   The game ends if the bird collides with a pipe or falls below the screen. The game can be restarted by pressing the spacebar again.


