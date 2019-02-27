package spaceWars;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Klasa dziedzicz�ca po klasie "GameObjects" odpowiadaj�ca za czytanie z dysku
 * plik�w graficznych Boss'�w, a tak�e decyduj�c� o tym w jaki spos�b obiekty
 * Boss�w maj� by� wy�wietlane i w jaki spos�b si� maj� porusza�.
 *
 * @author Konrad Zadroga
 *
 */
public class Boss extends GameObjects {

    private BufferedImage boss;
    private BufferedImage boss1;
    private BufferedImage boss2;

    /**
     * Konstruktor klasy "Boss".
     *
     * @param x
     *            wsp�rz�dna obiektu w osi X.
     * @param y
     *            wsp�rz�dna obiektu w osi Y.
     */
    public Boss(int x, int y) {
        super(x, y);
        try {
            boss = ImageIO.read(new File("boss.png"));
            boss1 = ImageIO.read(new File("boss1.png"));
            boss2 = ImageIO.read(new File("boss2.png"));
        } catch (IOException e) {
        }
        this.setYVal(1);
        this.setXVal(-1);
    }

    /**
     * Funkcja odpowiadaj�ca za ruch obiektu po osi Y.
     */
    @Override
    public void movementY() {
        this.setY(this.getY() + this.getYVal());
        if (this.getY() > 400 || this.getY() < 0) {
            this.setYVal(-this.getYVal());
        }
    }

    /**
     * Funkcja odpowiadaj�ca za wy�wietlanie Boss'�w.
     */

    public void render(Graphics g, int ID) {
        if (ID == 1) {
            g.drawImage(boss, x, y, 250, 165, null);
        } else if (ID == 2) {
            g.drawImage(boss1, x, y, 250, 165, null);
        } else {
            g.drawImage(boss2, x, y, 250, 165, null);
        }

    }

}
