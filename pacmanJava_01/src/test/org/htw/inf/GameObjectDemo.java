package test.org.htw.inf;

import org.htw.inf.GameObject;

public class GameObjectDemo {

    public static void main() {

        // create GameObject with parameterless constructor
        GameObject firstGameObject = new GameObject();
        firstGameObject.setPosition(10,10);

        // create second GameObject with parameterized constructor
        GameObject secondGameObject = new GameObject(12,12);


    }

}
