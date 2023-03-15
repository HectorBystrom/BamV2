import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class HealthBar extends JPanel implements MouseListener {
    Window myWindow;
    private int healthBarSize=400;
    Random random   = new Random();
    int upperBound = 40;

    public HealthBar(Window window) {
        myWindow = window;
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(500, 250));
        this.addMouseListener(this);

    }
    @Override
public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawHealthBar(g);
    }
    public void drawHealthBar(Graphics g){
        g.setColor(Color.green);
        g.fillRect(50,75,healthBarSize,100);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton()==MouseEvent.BUTTON1){
            int int_random = random.nextInt(upperBound);
            healthBarSize = healthBarSize-int_random;
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
