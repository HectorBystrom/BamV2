import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    //attributes
    //constructor

    public Window() {
        this.setTitle("Bash a monster");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create layout
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(2,1);
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createLineBorder(Color.green,5));

        //Add the amount of health bars
        for(int i=0; i<1;i++){
            panel.add(new HealthBar(this));
        }
        panel.add(new HealthBar2(this));

        //Add it and make it visible
        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);
    }

    //methods

//getters and setters
}
