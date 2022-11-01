abstract class Monster extends Unit {
    protected int damage = 0;
    protected int apcost = 0;

    public Monster(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    public int getDamage() {
        return damage;
    }

    public int getApcost() {
        return apcost;
    }

    public boolean equip(Weapon weapon) {
        if (hp == 0) {
            return false;
        }
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    public boolean attack(Fighter fighter) {
        if (fighter.moveCloseTo(fighter) == false) {
            System.out.println(name + ": I'm too far away from " + fighter.getName()+".");
            return false;
        } else if (name == fighter.getName()) {

            return false;
        } else if (ap >= apcost) {
            ap -= apcost;
            System.out.println(name + " attacks " + fighter.getName()+".");
            fighter.receiveDamage(damage);
            return true;
        } else {
          return false;
        }
    }
}
