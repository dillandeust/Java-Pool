abstract class Unit implements Fighter {
    protected String name;
    protected int hp;
    protected int ap;
    protected String lastFighter;

    protected Unit(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAp() {
        return ap;
    }

    public void receiveDamage(int damage) {
        if (hp - damage <= 0) {
            hp = 0;
        } else {
            hp = hp - damage;
        }
    }

    public boolean moveCloseTo(Fighter fighter) {
        if (hp <= 0 || name == fighter.getName() || moveCloseTo(fighter) == true || fighter.getName() == lastFighter) {
            return false;
        }
        else{
            System.out.printf(name + " is moving closer to "+ fighter.getName()+".");
            lastFighter =fighter.getName();
            return true;
        }
    }
 
    public void recoverAP() {
        if (hp>0 && getClass().getName().equals("Monster")){
            hp= hp + 7;
        }        
        if (ap>50){
            ap=50;
        }
    }

}
