import javax.swing.*;

public class App {
   public static void main(String[] args) throws Exception {
      int boardWidth = 736;
      int boardHeight = 552;

      JFrame frame = new JFrame("GO_Bird");
      // frame.setVisible(true);
      frame.setSize(boardWidth, boardHeight);
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Go_Bird go_bird = new Go_Bird();
      frame.add(go_bird);
      frame.pack();// set the color not for the title
      go_bird.requestFocus();
      frame.setVisible(true);
   }
}
