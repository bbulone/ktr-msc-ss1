/** @author Bulone Benjamin */

public class Main {
    public static void main(String[] args) {
        // Initialize Jean-Luc the Warrior and Robert the Mage
        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");

        warrior.attack("sword");
        mage.attack("magic");

        warrior.moveRight();
        warrior.moveLeft();
        warrior.moveBack();
        warrior.moveForward();

        mage.moveRight();
        mage.moveLeft();
        mage.moveBack();
        mage.moveForward();
    }
}