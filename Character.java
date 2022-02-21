/**
 * @author Bulone Benjamin
 *         For Epitech Entering Exam
 */

public abstract class Character implements Movable {
    protected String name;
    protected static String RPGClass;

    // Here we set all default values for each variables
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;

    // GETTERS

    public int getLife() {
        return this.life;
    }

    public String getName() {
        return this.name;
    }

    public String getRPGClass() {
        return this.RPGClass;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getWit() {
        return this.wit;
    }

    // Attack method
    public void attack(String str) {
        String attaque = "";

        attaque = attaque + this.name + "  : Rrrrrrrrr....";

        System.out.println(attaque);
    }

    // ALL the moving methods
    public void moveRight() {
        System.out.println(this.name + "  : moves right");
    }

    public void moveLeft() {
        System.out.println(this.name + "  : moves left");
    }

    public void moveForward() {
        System.out.println(this.name + "  : moves forward");
    }

    public void moveBack() {
        System.out.println(this.name + "  : moves back");
    }

    public void unsheathe() {
        System.out.println(this.name + "  : unsheathes his weapon.");
    }

}