package spaceWars;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Klasa odpowiadaj�ca za generowanie pask�w z poziomem �ycia gracza oraz Bossa.
 *
 * @author Konrad Zadroga
 *
 */

public class Health {

    /**
     * Zmienna okre�laj�ca poziom �ycia gracza, pocz�tkowo wynosi ona 100.
     */
    public int health = 100;
    /**
     * Zmienna okre�laj�ca poziom �ycia Bossa, pocz�tkowo wynosi ona 100.
     */
    public int bossHealth = 100;

    /**
     * Funkcja wy�wietlaj�ca pasek z poziomem �ycia gracza.
     *
     * @param player
     *            obiekt gracza
     * @param g
     *            obiekt klasy "Graphics".
     */
    public void render(GameObjects player, Graphics g) {
        if (this.health > 0) {
            g.setColor(Color.RED);
            g.fillRect(player.getX() + 10, player.getY() + 80, 50, 16);
            g.setColor(Color.BLUE);
            g.fillRect(player.getX() + 10, player.getY() + 80, health / 2, 16);
            g.setColor(Color.WHITE);
            g.drawRect(player.getX() + 10, player.getY() + 80, 50, 16);
        }
    }

    /**
     * Funkcja wy�wietlaj�ca pasek z poziomem �ycia gracza.
     *
     * @param boss
     *            obiekt Boss'a
     * @param g
     *            obiekt klasy "Graphics".
     */
    public void renderBoss(GameObjects boss, Graphics g) {
        if (this.health > 0) {
            g.setColor(Color.RED);
            g.fillRect(boss.getX() + 10, boss.getY() + 160, 50, 16);
            g.setColor(Color.GREEN);
            g.fillRect(boss.getX() + 10, boss.getY() + 160, bossHealth / 2, 16);
            g.setColor(Color.WHITE);
            g.drawRect(boss.getX() + 10, boss.getY() + 160, 50, 16);
        }
    }

}
