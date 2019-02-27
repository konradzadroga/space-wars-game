package spaceWars;

import java.awt.Graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Klasa dziedzicz�ca po klasie "GameObjects" odpowiadaj�ca za czytanie z dysku
 * plik�w graficznych strza�ow przeciwnik�w, a tak�e decyduj�c� o tym w jaki
 * spos�b obiekty strza��w maj� by� wy�wietlane i z jak� pr�dko�ci� maj� si�
 * porusza�.
 *
 * @author Konrad Zadroga
 *
 */

public class OpponentShots extends GameObjects {

    BufferedImage shot;

    /**
     * Konstruktor klasy "OpponentShots".
     *
     * @param x
     *            wsp�rz�dna obiektu w osi X.
     * @param y
     *            wsp�rz�dna obiektu w osi Y.
     */

    public OpponentShots(int x, int y) {
        super(x, y);
        try {
            shot = ImageIO.read(new File("shotOpponent.png"));

        } catch (IOException e) {
        }
        this.setXVal(-8);
    }

    /**
     * Funkcja odpowiadaj�ca za wy�wietlanie strza��w przeciwnik�w.
     */

    public void render(Graphics g) {
        g.drawImage(shot, x, y, 20, 20, null);
    }

}
