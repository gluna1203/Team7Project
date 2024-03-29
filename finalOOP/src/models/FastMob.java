package models;

public class FastMob extends Enemy{

    public FastMob(){
        setHp(20.0);
        setAttack(15.0);
        setArmor(15.0);
        setResistance(3.0);
    }

    public FastMob(int level){
        setLeveledUpStats(level);
//        switch (level) {
//            case 1:
//                setLeveledUpStats(0);
//                setLevelCount(1);
//                break;
//            case 2:
//                setLeveledUpStats(.5);
//                setLevelCount(2);
//                break;
//            case 3:
//                setLeveledUpStats(.80);
//                setLevelCount(3);
//                break;
//            case 4:
//                setLeveledUpStats(1.2);
//                setLevelCount(4);
//                break;
//            case 5:
//                setLeveledUpStats(1.5);
//                setLevelCount(5);
//                break;
//            case 6:
//                setLeveledUpStats(1.75);
//                setLevelCount(6);
//            case 7:
//                setLeveledUpStats(1.9);
//                setLevelCount(7);
//                break;
//            case 8:
//                setLeveledUpStats(2.2);
//                setLevelCount(8);
//                break;
//            case 9:
//                setLeveledUpStats(2.5);
//                setLevelCount(9);
//                break;
//            case 10:
//                setLeveledUpStats(2.75);
//                setLevelCount(10);
//                break;
//            case 0:
//                System.out.println("No enemy was created!");
//            default:
//                throw new IllegalArgumentException("The FastMob Switch hit a case that doesn't exists! case=" + level);
//        }
    }

    public void setLeveledUpStats(int increaseBy){
        FastMob temp = new FastMob();
        setHp(temp.getHp() + (3.25 * increaseBy));
        setArmor(temp.getArmor() + (3.25 * increaseBy));
        setAttack(temp.getAttack() + (3.25 * increaseBy));
        setResistance(temp.getResistance() + (3.25 * increaseBy));
    }
}
