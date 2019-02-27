package spaceWars;

import java.awt.Graphics;

/**
 * Klasa odpowiadaj�ca za ustalanie wsp�rz�dnych obiekt�w, a tak�e decyduj�ca z
 * jak� pr�dko�ci� i w jaki spos�b maj� si� one porusza�.
 *
 * @author Konrad Zadroga
 *
 */

public class GameObjects {

    /**
     * Zmienna odpowiadaj�ca za wsp�rz�dne obiektu w osi X.
     */
    protected int x;
    /**
     * Zmienna odpowiadaj�ca za wsp�rz�dne obiektu w osi Y.
     */
    protected int y;
    /**
     * Zmienna odpowiadaj�ca za pr�dko�� obiektu w osi X.
     */
    protected int xVal;
    /**
     * Zmienna odpowiadaj�ca za pr�dko�� obiektu w osi Y.
     */
    protected int yVal;

    /**
     * Konstruktor klasy "GameObjects".
     *
     * @param x
     *            wsp�rz�dna obiektu w osi X.
     * @param y
     *            wsp�rz�dna obiektu w osi Y.
     */
    public GameObjects(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Funkcja odpowiadaj�ca za wy�wietlanie obiektu.
     *
     * @param g
     *            obiekt klasy "Graphics".
     */
    public void render(Graphics g) {
    }

    /**
     * Funkcja odpowiadaj�ca za wy�wietlanie obiektu.
     *
     * @param g
     *            obiekt klasy "Graphics".
     * @param ID
     *            identyfikator obiektu.
     */
    public void render(Graphics g, int ID) {
    }

    /**
     * Funkcja odpowiadaj�ca za wy�wietlanie wybuchni�tego obiektu.
     *
     * @param g
     *            obiekt klasy "Graphics".
     */
    public void renderExploded(Graphics g) {
    }

    /**
     * Funkcja pozwalaj�ca na zmian� wsp�rz�dnych obiektu w osi X.
     *
     * @param x
     *            wsp�rz�dna obiektu w osi X.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Funkcja pozwalaj�ca na zmian� wsp�rz�dnych obiektu w osi Y.
     *
     * @param y
     *            wsp�rz�dna obiektu w osi Y.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Funkcja pozwalaj�ca na uzyskanie wsp�rz�dnych obiektu w osi X.
     *
     * @return - wspo�rz�dna obiektu w osi X.
     */

    public int getX() {
        return this.x;
    }

    /**
     * Funkcja pozwalaj�ca na uzyskanie wsp�rz�dnych obiektu w osi Y.
     *
     * @return - wspo�rz�dna obiektu w osi Y.
     */

    public int getY() {
        return this.y;
    }

    /**
     * Funkcja pozwalaj�ca na zmian� pr�dko�ci obiektu w osi X.
     *
     * @param xVal
     *            Zmienna odpowiadaj�ca za pr�dko�� obiektu w osi X.
     */

    public void setXVal(int xVal) {
        this.xVal = xVal;
    }

    /**
     * Funkcja pozwalaj�ca na zmian� pr�dko�ci obiektu w osi Y.
     *
     * @param yVal
     *            Zmienna odpowiadaj�ca za pr�dko�� obiektu w osi Y.
     */

    public void setYVal(int yVal) {
        this.yVal = yVal;
    }

    /**
     * Funkcja pozwalaj�ca na uzyskanie pr�dko�ci obiektu w osi X.
     *
     * @return - pr�dko�� obiektu po osi X.
     */

    public int getXVal() {
        return this.xVal;
    }

    /**
     * Funkcja pozwalaj�ca na uzyskanie pr�dko�ci obiektu w osi Y.
     *
     * @return - pr�dko�� obiektu po osi Y.
     */

    public int getYVal() {
        return this.yVal;
    }

    /**
     * Funkcja odpowiadaj�ca za ruch obiektu po osi Y.
     */

    public void movementY() {
        this.y = this.y + this.yVal;
    }

    /**
     * Funkcja odpowiadaj�ca za ruch obiektu po osi X.
     */

    public void movementX() {
        this.x = this.x + this.xVal;
    }

}
