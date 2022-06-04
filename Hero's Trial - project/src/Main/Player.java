package Main;

import Classes.SuperClass;
import Weapon.Superweapon;

/**
 * This class contains the objects of the player or the user of the game
 * 
 * @version java version "18"
 * @author Panoy, Arpachshad
 */
public class Player {

    // instantiating objects
    private int hp, dmg, spd, coin;
    private String Class, weapon;
    SuperClass currentClass = new SuperClass();
    Superweapon currentWeapon = new Superweapon();

    /**
     * This method is for setting the value for the coin object
     * 
     * @param coinNumber the amount of coin the player has
     */
    public void setCoin(int coinNumber) {
        coin = coinNumber;
    }

    /**
     * This method will allow the coin object in the player class to be accessed in
     * other classes
     * 
     * @return this method will pass the int value of the coin
     */
    public int getCoin() {
        return coin;

    }

    /**
     * This method is for setting the weapon name
     * 
     * @param currentWeapon the name of the current weapon of the player
     */
    public void setWeapon(Superweapon currentWeapon) {
        weapon = currentWeapon.name;

    }

    /**
     * This method will allow the weapon object in the player class to be accessed
     * in other classes
     * 
     * @return this will return the value of the weapon object
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * This weapon is for setting the name of the player's class
     * 
     * @param currentClass the current class of the player
     */
    public void setClass(SuperClass currentClass) {
        Class = currentClass.name;

    }

    /**
     * This method will allow the Class object in the player class to be accessed
     * in other classes
     * 
     * @return this will pass the value of the object Class
     */
    public String getclass() {
        return Class;
    }

    /**
     * This method is for calculating the value of the player's health
     * 
     * @param currentClass  the current class of the player
     * @param currentWeapon the current weapon of the player
     */
    public void setHP(SuperClass currentClass, Superweapon currentWeapon) {
        
    	hp = currentClass.health + currentWeapon.health;
    	
    	}
    
    

    /**
     * This method will allow the hp object in the player class to be accessed
     * in other classes
     * 
     * @return this will pass the value of the hp Class
     */
    public int getHP() {
        return hp;
    }

    /**
     * This method is for calculating the value of the player's damage
     * 
     * @param currentClass  the current class of the player
     * @param currentWeapon the current weapon of the player
     */
    public void setDMG(SuperClass currentClass, Superweapon currentWeapon) {
        dmg = currentClass.damage + currentWeapon.damage;
    }

    /**
     * This method will allow the dmg object in the player class to be accessed
     * in other classes
     * 
     * @return this will pass the value of the dmg Class
     */
    public int getDMG() {
        return dmg;
    }

    /**
     * This method is for calculating the value of the player's speed
     * 
     * @param currentClass  the current class of the player
     * @param currentWeapon the current weapon of the player
     */
    public void setSPD(SuperClass currentClass, Superweapon currentWeapon) {
        spd = currentClass.speed + currentWeapon.speed;
    }

    /**
     * This method will allow the spd object in the player class to be accessed
     * in other classes
     * 
     * @return this will pass the value of the spd Class
     */
    public int getSPD() {
        return spd;
    }

}
