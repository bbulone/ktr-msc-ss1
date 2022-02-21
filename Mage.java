
public class Mage extends Character {

    protected int agility = 10;
    protected int wit = 10;
    protected String RPGClass = "Mage";
    protected int life = 70;
    protected int strength = 3;

    public void attack(String weapon) {
        // This condition detect if it's magic or wand
        // The || is the OR condition, we could have use && for AND case but here it's
        // OR
        if (weapon == "wand" || weapon == "magic") {
            String theresult = this.name + " : Rrrrrrrrr...." + "\n";
            theresult += this.name + " : " + "Feel the power of my " + weapon + " !";
            System.out.println(theresult);
        }
    }

    public Mage(String name) {
        this.name = name;
        System.out.println(this.name + " : May the gods be with me.");
    }

    // Here are the different messages when moving either Forward, Back, Right and
    // Left

    public void moveForward() {
        System.out.println(this.name + " : moves forward furtively.");
    }

    public void moveBack() {
        System.out.println(this.name + " : moves back furtively.");
    }

    public void moveRight() {
        System.out.println(this.name + " : moves right furtively.");
    }

    public void moveLeft() {
        System.out.println(this.name + " : moves left furtively.");
    }

}
