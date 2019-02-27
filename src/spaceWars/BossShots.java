package spaceWars;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Klasa dziedzicz�ca po klasie "GameObjects" odpowiadaj�ca za czytanie z dysku
 * plik�w graficznych strza�ow Boss�w, a tak�e decyduj�c� o tym w jaki spos�b
 * obiekty strza��w maj� by� wy�wietlane i w jaki spos�b si� maj� porusza�.
 *
 * @author Konrad Zadroga
 *
 */

public class BossShots extends GameObjects {

    private BufferedImage bossShot;

    /**
     * Konstruktor klasy "BossShots".
     *
     * @param x
     *            wsp�rz�dna obiektu w osi X.
     * @param y
     *            wsp�rz�dna obiektu w osi Y.
     */

    public BossShots(int x, int y) {
        super(x, y);
        try {
            bossShot = ImageIO.read(new File("bossShot.png"));

        } catch (IOException e) {
        }
        this.setXVal(-3);
    }

    /**
     * Funkcja odpowiadaj�ca za wy�wietlanie strza��w Boss'�w.
     */

    public void render(Graphics g) {
        g.drawImage(bossShot, x, y, 50, 50, null);
    }

}
