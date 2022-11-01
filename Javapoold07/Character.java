
abstract class Character implements Movable, Comparable<Character> {
    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;
    protected Integer capacity = 0;

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    protected Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
    }

    protected Character(String name, String RPGClass, int capacity) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.capacity = capacity;
    }

    void attack(String weapon) {
        System.out.println(name + ": Rrrrrrrrr....");
    }

    public void moveRight() {
        System.out.println(name + ": moves right");

    }

    public void moveLeft() {
        System.out.println(name + ": moves left");

    }

    public void moveForward() {
        System.out.println(name + ": moves forward");

    }

    public void moveBack() {
        System.out.println(name + ": moves back");

    }

    protected final void unsheathe() {
        System.out.println(name + ": unsheathes his weapon.");
    }

    public int compareTo(Character character) {

        if (name != character.getName()) {
            if (getRPGClass().equals(character.getRPGClass())) {
                return capacity.compareTo(character.capacity);
            } else {
                if (character.getRPGClass() == "Warrior" && getRPGClass() == "Mage"
                        && character.capacity == 0) {
                    return -1;
                } else if (character.getRPGClass() == "Mage" && getRPGClass() == "Warrior"
                        && capacity == 0) {
                    return 1;
                } else if (character.getRPGClass() == "Warrior" && getRPGClass() == "Mage"
                        && (character.capacity % capacity) == 0) {
                    return -1;
                } else if (character.getRPGClass() == "Mage" && getRPGClass() == "Warrior"
                        && (capacity % character.capacity) == 0) {
                    return 1;
                } else if (character.getRPGClass() == "Mage" && getRPGClass() == "Warrior"
                        && (capacity % character.capacity) != 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        } else {
            return 0;
        }
    }
}