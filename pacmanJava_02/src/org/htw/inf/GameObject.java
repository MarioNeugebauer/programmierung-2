package org.htw.inf;

public class GameObject {

    private int xPos=0;
    private int yPos=0;

    public GameObject() {

    }

    public GameObject(int initialXPos, int initialYPos) {
        this.xPos = initialXPos;
        this.yPos = initialYPos;
    }

    public void move(int xPosChange, int yPosChange) {
        xPos = xPos+xPosChange;
        yPos = yPos+yPosChange;
    }

    public void setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}
