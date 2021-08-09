package models;

public class GlassCannon extends Enemy{
    private int critChance = 10;

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        if (critChance >= 100){
            this.critChance = 100;
        }
        this.critChance = critChance;
    }

    public GlassCannon( ){
        setHp(25.0);
        setArmor(3.0);
        setAttack(30.0);
        setResistance(2.0);
    }

    public GlassCannon(int level){
        setLeveledUpStats(level,true);
    }

    public void setLeveledUpStats(int increaseBy, boolean critUpgrade) {
        GlassCannon temp = new GlassCannon();
        setHp(temp.getHp() + (3.25 * increaseBy));
        setArmor(temp.getArmor() + (3.25 * increaseBy));
        setAttack(temp.getAttack() + (3.25 * increaseBy));
        setResistance(temp.getResistance() + (3.25 + increaseBy));
        if (critUpgrade){
            setCritChance(getCritChance()+5);
        }
    }

    @Override
    public String displayStats(){
        return super.displayStats() + " Crit Chance: " + getCritChance() + "%";
    }
}
