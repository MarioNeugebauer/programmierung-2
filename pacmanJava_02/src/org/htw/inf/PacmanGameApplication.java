package org.htw.inf;

import java.util.concurrent.TimeUnit;

public class PacmanGameApplication implements JoystickListener {


    public void startGame() {

        Joystick keyJoystick = new Joystick();
        keyJoystick.setJoystickListener(this);
        ScreenMemory screenMemory = new ScreenMemory(80, 20, keyJoystick);
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

    @Override
    public void joystickDirectionMoved(JoystickEvent event) {
        System.out.println(event);
    }
}
