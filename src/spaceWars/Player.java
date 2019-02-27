package spaceWars;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Klasa dziedzicz�ca po klasie "GameObjects" odpowiadaj�ca za czytanie z dysku
 * plik�w graficznych gracza, a tak�e decyduj�c� o tym w jaki spos�b obiekt
 * gracza ma by� wy�wietlany.
 *
 * @author Konrad Zadroga
 *
 */

public class Player extends GameObjects {

    private BufferedImage spaceship;
    private BufferedImage explosion;

    /**
     * Konstruktor klasy "Player".
     *
     * @param x
     *            wsp�rz�dna obiektu w osi X.
     * @param y
     *            wsp�rz�dna obiektu w osi Y.
     */
    public Player(int x, int y) {
        super(x, y);
        try {
            spaceship = ImageIO.read(new File("spaceship.png"));
            explosion = ImageIO.read(new File("explosion.png"));

        } catch (IOException e) {
        }
    }

    /**
     * Funkcja odpowiadaj�ca za wy�wietlanie obiektu gracza.
     */
    public void render(Graphics g) {
        g.drawImage(spaceship, x, y, 80, 80, null);
    }

    /**
     * Funkcja odpowiadaj�ca za wy�wietlanie obiektu gracza po eksplozji.
     */
    public void renderExploded(Graphics g) {
        g.drawImage(explosion, x, y, 80, 80, null);
    }
}
