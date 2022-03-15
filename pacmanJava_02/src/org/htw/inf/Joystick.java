package org.htw.inf;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Joystick implements KeyListener {

    private JoystickListener myJoystickListener;

    public void setJoystickListener(JoystickListener joystickListener) {
        this.myJoystickListener=joystickListener;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyEvent.VK_DOWN

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                myJoystickListener.joystickDirectionMoved(JoystickEvent.JOYSTICK_UP);
                break;
            case KeyEvent.VK_DOWN:
                myJoystickListener.joystickDirectionMoved(JoystickEvent.JOYSTICK_DOWN);
                break;
            case KeyEvent.VK_LEFT:
                myJoystickListener.joystickDirectionMoved(JoystickEvent.JOYSTICK_LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                myJoystickListener.joystickDirectionMoved(JoystickEvent.JOYSTICK_RIGHT);
                break;
            default:
                break;

        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN) {

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
