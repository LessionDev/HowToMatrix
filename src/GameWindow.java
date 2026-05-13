import javax.swing.*;
import java.awt.*;

public class GameWindow extends JPanel {

    public GameWindow() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(new Color(30, 30, 30));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
 
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Arial", Font.BOLD, 36));

        g2.drawString("QUIZ GAME", 300, 200);

        g2.setFont(new Font("Arial", Font.PLAIN, 20));
        g2.drawString("Appuie sur RUN pour commencer", 250, 300);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Quiz Game");
        GameWindow panel = new GameWindow();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
