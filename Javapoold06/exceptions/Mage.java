public class Mage extends Character {

    public Mage(String name) {
        super(name, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(name + ": May the gods be with me.");
    }

    void attack(String weapon) throws WeaponException {
        if (weapon.toLowerCase().equals("magic") || weapon.toLowerCase().equals("wand")) {
            System.out.println(name + ": Rrrrrrrrr....");
            System.out.println(name + ": Feel the power of my " + weapon.toLowerCase() + "!");
        } else if (weapon.equals("")) {
            throw new WeaponException(name + ": I refuse to fight with my bare hands.");
        } else {
            throw new WeaponException(name + ": I don't need this stupid " + weapon.toLowerCase() + "! Don't misjudge my powers!");
        }
    }

    public void moveRight() {
        System.out.println(name + ": moves right furtively.");

    }

    public void moveLeft() {
        System.out.println(name + ": moves left furtively.");

    }

    public void moveForward() {
        System.out.println(name + ": moves forward furtively.");

    }

    public void moveBack() {
        System.out.println(name + ": moves back furtively.");

    }

}
