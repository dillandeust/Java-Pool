public class Mage extends Character {

    public Mage(String name) {
        super(name, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(name + ": May the gods be with me.");
    }

    public Mage(String name, Integer magnetism) {
        super(name, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        this.capacity= magnetism;
        System.out.println(name + ": May the gods be with me.");
    }

    void attack(String weapon) {
        if (weapon.toLowerCase() == "magic" || weapon.toLowerCase() == "wand") {
            System.out.println(name + ": Rrrrrrrrr....");
            System.out.println(name + ": Feel the power of my " + weapon + "!");
        } else {

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
