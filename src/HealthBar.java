import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
//Class to make the health bar
public class HealthBar extends JPanel implements MouseListener {
    //Attributes
    Window myWindow;
    private int healthBarSize = 400;
    int upperBound = 40;

    //Constructor
    public HealthBar(Window window) {
        myWindow = window;
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(500, 250));
        this.addMouseListener(this);

    }

    //Methods
//Class to create the component
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawHealthBar(g);
    }

    //Set a color and size to the health bar
    public void drawHealthBar(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(50, 75, healthBarSize, 100);
    }

    //The functions when the mouse is clicked
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            //Random generator that goes up to 10% (40px)
            Random random = new Random();
            int int_random = random.nextInt(upperBound);
            //Take away the random amount
            healthBarSize = healthBarSize - int_random;
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
