package spaceWars;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Klasa dziedzicz�ca po klasie "GameObjects" odpowiadaj�ca za czytanie z dysku
 * plik�w graficznych przeciwnik�w, a tak�e decyduj�c� o tym w jaki spos�b
 * obiekty przeciwnik�w maj� by� wy�wietlane i w jaki spos�b si� maj� porusza�.
 *
 * @author Konrad Zadroga
 *
 */

public class Enemies extends GameObjects {

    public BufferedImage opponent;

    /**
     * Konstruktor klasy "Enemies".
     *
     * @param x
     *            wsp�rz�dna obiektu w osi X.
     * @param y
     *            wsp�rz�dna obiektu w osi Y.
     */

    public Enemies(int x, int y) {
        super(x, y);
        try {
            opponent = ImageIO.read(new File("opponent.png"));
        } catch (IOException e) {
        }
        this.setXVal(-5);
    }

    /**
     * Funkcja odpowiadaj�ca za wy�wietlanie przeciwnik�w.
     */

    public void render(Graphics g) {
        g.drawImage(opponent, x, y, 80, 80, null);
    }

}
