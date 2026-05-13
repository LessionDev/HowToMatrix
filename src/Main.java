import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Quiz Game");

        GameWindow panel = new GameWindow();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);

        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
