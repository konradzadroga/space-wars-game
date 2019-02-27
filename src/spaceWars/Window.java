package spaceWars;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Klasa odpowiadaj�ca za tworzenie okna z gr� o okre�lonych parametrach.
 *
 * @author Konrad Zadroga
 *
 */
public class Window {

    /**
     * Konstruktor klasy "Window" tworz�cy okno z gr� o okre�lonych parametrach.
     *
     * @param width
     *            szeroko�� okna
     * @param height
     *            wysoko�� okna
     * @param title
     *            tytu� okna
     * @param gameplay
     *            obiekt klasy "Gameplay".
     */
    public Window(int width, int height, String title, Gameplay gameplay) {
        JFrame jframe = new JFrame();
        jframe.setPreferredSize(new Dimension(width, height));
        jframe.setMaximumSize(new Dimension(width, height));
        jframe.setMinimumSize(new Dimension(width, height));
        jframe.setTitle(title);
        jframe.setResizable(false);
        jframe.setVisible(true);
        jframe.add(gameplay);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
