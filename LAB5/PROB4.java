package LAB5;

import java.util.*;

class Warrior {
    public static final int SNAKE_Warrior = 0;
    public static final int OGRE_Warrior = 1;
    public static final int MARSHMALLOW_MAN_Warrior = 2;

    //Stores one of the three above types
    //0 = dead, 100 = full strength
    public int health;
    public String name;

    public Warrior (int health, String name) {
        this.health = health;
        this.name = name;
    }
    
    public String toString() {
    	return name + " " + health;
    }
}

class SNAKE_Warrior extends Warrior {
	
	public SNAKE_Warrior(int health, String name) {
		super(100, "SNAKE_Warrior");
	}
	
	public int getDamage() {
		return 10;
	}
	
	public String toString() {
		return "SNAKE_Warrior" + super.toString();
	}
}

class OGRE_Warrior extends Warrior {
	
	public OGRE_Warrior(int health, String name) {
		super(70, "OGRE_Warrior");
	}
	
	public int getDamage() {
		return 6;
	}
	
	public String toString() {
		return "OGRE_Warrior" + super.toString();
	}
}

class MARSHMALLOW_MAN_Warrior extends Warrior {
	
	public MARSHMALLOW_MAN_Warrior(int health, String name) {
		super(68, "MARSHMALLOW_MAN_Warrior");
	}
	
	public int getDamage() {
		return 1;
	}
	
	public String toString() {
		return "MARSHMALLOW_MAN_Warrior" + super.toString();
	}
}

class WarriorPack{
    private Vector warriors ;

    public WarriorPack () {
        warriors = new Vector();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector getWarriors() {
        return warriors ;
    }

    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < warriors.size(); i++) {
            if (warriors.get(i) instanceof SNAKE_Warrior) {
                //Snake does 10 damage
                damage += ((SNAKE_Warrior) warriors.get(i)).getDamage();
            } else if (warriors.get(i) instanceof OGRE_Warrior) {
                //Ogre does 6 damage
                damage += ((OGRE_Warrior) warriors.get(i)).getDamage();
            } else if (warriors.get(i) instanceof MARSHMALLOW_MAN_Warrior) {
                //Marshmallow Man does 1 damage
                damage += ((MARSHMALLOW_MAN_Warrior) warriors.get(i)).getDamage();
            }
        }
        return damage;
    }
}

public class PROB4 {
	
	public static void main(String args[]) {
		WarriorPack players = new WarriorPack();
		SNAKE_Warrior SNAKE_Warrior = new SNAKE_Warrior(100, "SNAKE_Warrior");
		OGRE_Warrior OGRE_Warrior = new OGRE_Warrior(70, "OGRE_Warrior");
		MARSHMALLOW_MAN_Warrior MARSHMALLOW_MAN_Warrior = new MARSHMALLOW_MAN_Warrior(68, "MARSHMALLOW_MAN_Warrior");
		
		players.addWarrior(SNAKE_Warrior);
		players.addWarrior(OGRE_Warrior);
		players.addWarrior(MARSHMALLOW_MAN_Warrior);
		
		int damage1;
		
		damage1 = players.calculateDamage();
		
		System.out.println(damage1);
		
		
	}

}
