package org.htw.inf;

public class Renderer {

    private ScreenMemory screenMemory;

    public Renderer(ScreenMemory screenMemory) {
        this.screenMemory = screenMemory;
        // screenMemory.createAndShowGUI();
    }

    public void startRendering() {
        screenMemory.clear(true);
    }

    public void finishRendering() {
        screenMemory.printScreenToTextArea();
    }


    public void render(GameObject gameObject) {
        screenMemory.setPoint(gameObject.getxPos(), gameObject.getyPos(), 'O');
    }

}
