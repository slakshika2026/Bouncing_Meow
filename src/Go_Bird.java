import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Go_Bird extends JPanel {
   int boardWidth = 736;
   int boardHeight = 552;

   // Images
   Image backgroundImg;
   Image birdImg;
   Image topPipeImg;
   Image bottomPipeImg;

   // bird
   int birdX = boardWidth / 8;
   int birdY = boardHeight / 2;
   int birdWidth = 40;
   int birdHeight = 30;

   class Bird {
      int x = birdX;
      int y = birdY;
      int width = birdWidth;
      int height = birdHeight;
      Image img;

      Bird(Image img) {
         this.img = img;
      }

   }

   // game logic
   Bird bird;

   Go_Bird() {
      setPreferredSize(new Dimension(boardWidth, boardHeight));
      setBackground(Color.blue);

      // load images
      backgroundImg = new ImageIcon(getClass().getResource("./background.jpg")).getImage();
      birdImg = new ImageIcon(getClass().getResource("./bird.png")).getImage();
      topPipeImg = new ImageIcon(getClass().getResource("./topPipe.png")).getImage();
      bottomPipeImg = new ImageIcon(getClass().getResource("./bottomPipe.png")).getImage();

      bird = new Bird(birdImg);
   }

   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      draw(g);
   }

   public void draw(Graphics g) {
      // background
      g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);

      // bird
      g.drawImage(birdImg, birdX, birdY, birdWidth, birdHeight, null);
   }

}
