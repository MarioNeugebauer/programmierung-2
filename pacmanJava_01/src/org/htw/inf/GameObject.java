package org.htw.inf;

public class GameObject {

    private int xPos;
    private int yPos;

    public GameObject(int initialXPos, int initialYPos) {
        this.xPos = initialXPos;
        this.yPos = initialYPos;
    }

    public void move(int xPosChange, int yPosChange) {
        xPos = xPos+xPosChange;
        yPos = yPos+yPosChange;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}
