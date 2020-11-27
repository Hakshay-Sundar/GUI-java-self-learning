import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class differentFont extends JPanel{
   String[] type = {"Sans","SansSerif"};
   int[] styles = {Font.PLAIN, Font.ITALIC, Font.BOLD, Font.ITALIC + Font.BOLD};
   String[] styleNames = {"Plain", "Italic", "Bold", "Bold & Italic"};
   public void paint(Graphics g){
    for (int f = 0; f < type.length; f++) { 
        for (int s = 0; s < styles.length; s++) { 
           Font font = new Font(type[f], styles[s], 18);
           g.setFont(font); 
           String name = type[f] + " " + styleNames[s];
           g.drawString(name,50,(f*4+s+1)*20); 
        }
     }
   }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame.setContentPane(new differentFont());
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}