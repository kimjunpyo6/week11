public class Test {
    public static void main(String[] args) {
        Warrior garen = new Warrior();
        Mage annie = new Mage();

        garen.move();
        garen.spinAttack();
        garen.Normal_attack();

        annie.move();
        annie.fireBall();
        annie.Normal_attack();


        System.out.println(garen.toString());
        System.out.println(annie.toString());

        garen.Normal_attack();
        annie.fireBall();
    }
}


class Champion {
    String name;
    String job;
    String skill;

    void Normal_attack(){
        System.out.println("기본 공격을 합니다.");
    }

    void move(){
        System.out.println("이동 합니다.");
    }
}

class Warrior extends Champion {
    String shield;

    void spinAttack() {
        System.out.println("믹서기");
    }
    void Synergy_Warrior(){
        System.out.println("전사 클래스를 가지고 있습니다.");
    }
}

class Mage extends Champion {
    String mana;

    void fireBall(){
        System.out.println("화염구");
    }
    void Synergy_mage(){
        System.out.println("마법사 클래스를 가지고 있습니다.");
    }
}