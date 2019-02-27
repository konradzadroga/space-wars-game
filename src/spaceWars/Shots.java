package spaceWars;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Klasa dziedzicz�ca po klasie "GameObjects" odpowiadaj�ca za czytanie z dysku
 * plik�w graficznych strza�ow gracza, a tak�e decyduj�c� o tym w jaki spos�b
 * obiekty strza��w maj� by� wy�wietlane i z jak� pr�dko�ci� maj� si� porusza�.
 *
 * @author Konrad Zadroga
 *
 */
public class Shots extends GameObjects {

    private BufferedImage shot;

    /**
     * Konstruktor klasy "Shots".
     *
     * @param x
     *            wsp�rz�dna obiektu w osi X.
     * @param y
     *            wsp�rz�dna obiektu w osi Y.
     */
    public Shots(int x, int y) {
        super(x, y);
        try {
            shot = ImageIO.read(new File("shot.png"));

        } catch (IOException e) {
        }
        this.setXVal(10);
    }

    /**
     * Funkcja odpowiadaj�ca za wy�wietlanie strza��w gracza.
     */
    public void render(Graphics g) {
        g.drawImage(shot, x, y, 30, 30, null);
    }

}
