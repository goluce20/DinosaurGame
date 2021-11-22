package dinosaurGame;

import javax.swing.JFrame;
import java.awt.Rectangle;
import java.util.Random;
import java.util.Timer;

public class DinosaurGame  {

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

        //



    }






}
