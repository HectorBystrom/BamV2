import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HealthBar extends JPanel implements MouseListener {
    Window myWindow;

    public HealthBar(Window window) {
        myWindow = window;
        this.setBorder(BorderFactory.createLineBorder(Color.green, 2));

        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(500, 250));
        this.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

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
