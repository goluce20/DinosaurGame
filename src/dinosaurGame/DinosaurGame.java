package dinosaurGame;

import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.Timer;

public class DinosaurGame implements ActionListener, MouseListener, KeyListener {

    // Define static DinosaurGame variable
    public static DinosaurGame dinosaurGame;

    // Define canvas size
    public final int WIDTH = 1000, HEIGHT = 800;

    // Create renderer object
    public Renderer renderer;

    // Define character variable
    public Rectangle dinosaur;

    // Define random variable
    public Random rand;


    // Define DinosaurGame method
    public DinosaurGame() {
        // Create JFrame
        JFrame jframe = new JFrame();

        // Create timer
        // Timer timer = new Timer(20, this);

        // Initialize renderer object
        renderer = new Renderer();

        // JFrame settings
        //jframe.add(renderer);
        jframe.setTitle("Dinosaur Game");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.addMouseListener(this);
        jframe.addKeyListener(this);
        jframe.setResizable(false);
        jframe.setVisible(true);

        // Initialize dinosaur
        dinosaur = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);

        // Start timer
        // timer.start();


    }

    public static void main(String[] args) {
        dinosaurGame = new DinosaurGame();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

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

