import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    //attributes
    public Window() {
        this.setTitle("Bash a monster");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(2,1);
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createLineBorder(Color.green,5));

        panel.add(new HealthBar(this));
        panel.add(new HealthBar(this));

        this.getContentPane().add(panel);

        this.pack();
        this.setVisible(true);
    }
    //constructor

    //methods

//getters and setters
}
