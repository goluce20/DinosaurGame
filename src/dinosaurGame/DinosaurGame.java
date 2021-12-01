package dinosaurGame;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;

public class DinosaurGame implements ActionListener, MouseListener, KeyListener {

    // Define static DinosaurGame variable
    public static DinosaurGame dinosaurGame;

    // Define canvas size
    public final int WIDTH = 1000, HEIGHT = 800;

    // Create renderer object
    public Renderer renderer;

    // Define character variable
    public Rectangle dinosaur;

    // Define cactus array
    public ArrayList<Rectangle> obstacles;

    public int ticks, yMotion, score;

    // Create boolean objects
    public boolean gameOver, started;

    // Define random variable
    public Random rand;


    // Define DinosaurGame method
    public DinosaurGame() {
        // Create JFrame
        JFrame jframe = new JFrame();

        // Create timer
        Timer timer = new Timer(20, this);

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
        timer.start();


    }


    // Add obstacle method
    public void addObstacle(boolean start) {
        int width = 17;
        int height = 35;

        if (start) {
            obstacles.add(new Rectangle(WIDTH + width + (obstacles.size() - 1) * 200, 200, width, HEIGHT - height));
        }

    }

    // Paint obstacle method
    public void paintObstacle(Graphics g, Rectangle obstacle) {
        g.setColor(Color.GRAY);
        g.fillRect(obstacle.x, obstacle.y, obstacle.width, obstacle.height);
    }


    public static void main(String[] args) {
        dinosaurGame = new DinosaurGame();
    }



/*
    public void jump() {
        if (gameOver) {
            dinosaur = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
            obstacles.clear();
            yMotion = 0;
            score = 0;

            addObstacle(true);
            addObstacle(true);
            addObstacle(true);
            addObstacle(true);


            gameOver = false;


        }

        if (!started) {
            started = true;
        }
        else if (!gameOver) {
            if (yMotion > 0) {
                yMotion = 0;
            }

            yMotion -= 10;
        }
    }

 */


    public void repaint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(dinosaur.x, dinosaur.y, dinosaur.width, dinosaur.height);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        renderer.repaint();

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

