import java.awt.Canvas;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class aa extends Canvas implements Runnable{
    public static String title = "Blocraft v0.0.1";
    public static String DBTitle = "Blocraft Output:";
    public static int height = 400;
    public static int width = 600;
    public static boolean run = false;   
    public Thread thrd;
    public BufferedImage img;
    public int[] pixel;
    
    public static void main(String args[]) {
        aa game = new aa();
        
        
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(width, height);
        f.setTitle(title);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(game);
        
        game.start();
    }
    public void start() {
          if(run) return;
          run = true;
          thrd = new Thread();
          thrd.start();
    }
    public void run() {
        while (run) {
            System.out.println("Debug/Build Success!");
        }
    }
}

