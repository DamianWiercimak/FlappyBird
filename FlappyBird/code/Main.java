import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        int boardWidth = 340;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setVisible(true); //widocznosc okna
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); // umiejscowienie okna na srodku ekranu
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true); //widocznosc okna

    }
}