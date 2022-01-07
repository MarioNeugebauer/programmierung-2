package org.htw.inf;

import java.util.concurrent.TimeUnit;

public class PacmanGameApplication {


    public void startGame() {

        ScreenMemory screenMemory = new ScreenMemory(80, 20);
        Renderer myRenderer = new Renderer(screenMemory);
        GameObject simpleGameObject = new GameObject(3,3);

        int counter = 0;
        while (counter <10) {

            wait(500);

            myRenderer.startRendering();
            myRenderer.render(simpleGameObject);
            myRenderer.finishRendering();

            counter++;

            simpleGameObject.move(1,0);
        }
    }

    // wait for the specified milliseconds
    private static void wait(int timeout) {
        try {
            TimeUnit.MILLISECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
