import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class GUI{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        final TextField tf = new TextField();
        JButton b = new JButton();
        b.setText("Button");
        tf.setBounds(50,50, 150,20);  
        b.setBounds(50,80,150,40);  
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            tf.setText("Hello There!");
            }
        });
        f.add(b);
        f.add(tf);
        f.setLayout(null);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
