package Main;

import java.util.Random;

import Classes.SuperClass;
import Classes.class_archer;
import Classes.class_knight;
import Classes.class_mage;
import Classes.class_normal;
import Monster.SuperMonster;
import Monster.monster_dragon;
import Monster.monster_elemental;
import Monster.monster_goblin;
import Monster.monster_goblin_horde;
import Monster.monster_lizardman;
import Monster.monster_ogre;
import Weapon.Superweapon;
import Weapon.weapon_legendarybow;
import Weapon.weapon_legendarystaff;
import Weapon.weapon_legendarysword;
import Weapon.weapon_none;
import Weapon.weapon_normalbow;
import Weapon.weapon_normalstaff;
import Weapon.weapon_normalsword;
import miscellaneous.Fountain;
import miscellaneous.Lady;

/**
 * This is class will contain the story element of
 * the game
 * 
 * @version java version "18"
 * @author Panoy, Arpachshad
 */
public class Main_Story {

    // instantiating objects
    Game game;
    UI ui;
    VisibilityManager vm;
    Player p = new Player();
    SuperMonster monster;
    Superweapon weapon;
    SuperClass Class;
    Lady lady = new Lady();
    Fountain fountain = new Fountain();
    int calculableHP, calculableCoin; // since the values of health and coin objects are constantly changing

    /**
     * This is the constructor of the class
     * 
     * @param g          instance of Game class to access its properties
     * @param uInterface instance of UI class to access its properties
     * @param vManager   instance of isibilityManager to access its properties
     */
    public Main_Story(Game g, UI uInterface, VisibilityManager vManager) {

        game = g;
        ui = uInterface;
        vm = vManager;

    }

    /**
     * This is the method that will handle which method to exectue depending on
     * the expression passed by the user
     * 
     * 
     * @param nextPosition the expression performed
     */
    public void selectPosition(String nextPosition) {

        switch (nextPosition) {

            case "fight":
                fight();
                break;
            case "playerAttack":
                playerAttack();
                break;
            case "retreat":
                retreat();
                break;
            case "monsterAttack":
                monsterAttack();
                break;
            case "win":
                win();
                break;
            case "lose":
                lose();
                break;
            case "closeGame":
                System.exit(0);
                break;
            case "toTitle":
                vm.showTitleScreen();
                break;
            case "ClassSelection":
                ClassSelection();
                break;
            case "Knight":
                Knight();
                break;
            case "Archer":
                Archer();
                break;
            case "Mage":
                Mage();
                break;
            case "firstTrial":
                firstTrial();
                break;
            case "Dragon_info":
                Dragon_info();
                break;
            case "Monster_info":
                Monster_info();
                break;
            case "EldenForest":
                EldenForest();
                break;
            case "Cave":
                cave();
                break;
            case "TrollBridge":
                TrollBridge();
                break;
            case "ElementalNest":
                EldenForest();
                break;
            case "Dragon":
                Dragon();
                break;
            case "Swamp":
                Swamp();
                break;
            case "fountain":
                fountain();
                break;
            case "Elemental":
                ElementalNest();
                break;
            case "lady":
                lady();
                break;
            case "legendarySword":
                legendarySword();
                break;
            case "legendaryBow":
                legendaryBow();
                break;
            case "legendaryStaff":
                legendaryStaff();
                break;
            default:break;
        }
    }

    /**
     * This method will get the set the expression for the choice buttons in the
     * game
     * 
     * @param next1 object that will store the expression in the first choice button
     * @param next2 object that will store the expression in the second choice
     *              button
     * @param next3 object that will store the expression in the third choice button
     * @param next4 object that will store the expression in the fourth choice
     *              button
     */
    private void next(String next1, String next2, String next3, String next4) {

        game.nextPosition1 = next1;
        game.nextPosition2 = next2;
        game.nextPosition3 = next3;
        game.nextPosition4 = next4;

    }

    /**
     * This method is the first sequence in the story and will set the
     * default set-up of the game.
     * 
     */
    public void settingDefault() {

        // setting up default set-up of the lady
        lady.legendaryBow = 1;
        lady.legendaryStaff = 1;
        lady.legendarySword = 1;

        // setting up default set-up of the fountain
        fountain.healingWater = 20;

        // setting up default set-up of the player
        p.setCoin(0);
        weapon = new weapon_none();
        p.setWeapon(weapon);
        Class = new class_normal();
        p.setClass(Class);
        p.setHP(Class, weapon);
        p.setDMG(Class, weapon);
        p.setSPD(Class, weapon);
        calculableHP = p.getHP();
        calculableCoin = p.getCoin();

        // displaying labels to game screen
        ui.weaponLabelName.setText("" + p.getWeapon());
        ui.coinLabelNumber.setText("" + calculableCoin);
        ui.classLabelName.setText("" + p.getclass());
        ui.hpLabelNumber.setText("" + calculableHP);
        ui.dmgLabelNumber.setText("" + p.getDMG());
        ui.spdLabelNumber.setText("" + p.getSPD());

        // displaying the dialogue to the game screen
        ui.mainTextArea
                .setText("\nIt's dark.\n\nYou feel like you're being pulled in high speed.\n\nA bright light flashes.");

        // displaying labels to choice buttons
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("ClassSelection", "", "", "");

    }

    /**
     * This method is the second sequence of the story
     * This will where the player choose their class to change their stats and
     * weapons
     */
    private void ClassSelection() {

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "King: Welcome! You have been summoned to our world to be our Hero.\nBut first you need to embark on a trial to see if you are worthy of the title.\n\nTo start, choose your class:");

        // displaying labels to choice buttons
        ui.choice1.setText("Knight");
        ui.choice2.setText("Archer");
        ui.choice3.setText("Mage");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("Knight", "Archer", "Mage", "");

    }

    /**
     * This method will be called when the "Knight" expression is performed
     */
    private void Knight() {

        weapon = new weapon_normalsword();
        Class = new class_knight();

        // setting up new stat for player
        p.setClass(Class);
        p.setWeapon(weapon);
        p.setHP(Class, weapon);
        p.setDMG(Class, weapon);
        p.setSPD(Class, weapon);
        calculableHP = p.getHP();

        // displaying labels to the game screen
        ui.weaponLabelName.setText("" + p.getWeapon());
        ui.classLabelName.setText("" + p.getclass());
        ui.hpLabelNumber.setText("" + calculableHP);
        ui.dmgLabelNumber.setText("" + p.getDMG());
        ui.spdLabelNumber.setText("" + p.getSPD());

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "King: Nice choice. Knights are known for their strong will and loyalty. Durability is their strength.\n\n\nYour stats have been changed to match those of Knights. Are you ready for the trial?");

        // displaying labels to choice buttons
        ui.choice1.setText("I am ready");
        ui.choice2.setText("I wish to change my class");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("firstTrial", "ClassSelection", "", "");

    }

    /**
     * This method will be called when the "Archer" expression is performed
     */
    private void Archer() {

        weapon = new weapon_normalbow();
        Class = new class_archer();

        // setting up new stat for player
        p.setWeapon(weapon);
        p.setClass(Class);
        p.setHP(Class, weapon);
        p.setDMG(Class, weapon);
        p.setSPD(Class, weapon);
        calculableHP = p.getHP();

        // displaying labels to the game screen
        ui.weaponLabelName.setText("" + p.getWeapon());
        ui.classLabelName.setText("" + p.getclass());
        ui.hpLabelNumber.setText("" + calculableHP);
        ui.dmgLabelNumber.setText("" + p.getDMG());
        ui.spdLabelNumber.setText("" + p.getSPD());

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "King: Interesting choice. Archers are very patient and calculated. They have very high mobility.\n\nYour stats have been changed to match those of Archers. Are you ready for the trial?");

        // displaying labels to choice buttons
        ui.choice1.setText("I am ready");
        ui.choice2.setText("I wish to change my class");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("firstTrial", "ClassSelection", "", "");

    }

    /**
     * This method will be called when the "Mage" expression is performed
     */
    private void Mage() {

        Class = new class_mage();
        weapon = new weapon_normalstaff();

        // setting up new stat for player
        p.setWeapon(weapon);
        p.setClass(Class);
        p.setHP(Class, weapon);
        p.setDMG(Class, weapon);
        p.setSPD(Class, weapon);
        calculableHP = p.getHP();

        // displaying labels to the game screen
        ui.weaponLabelName.setText("" + p.getWeapon());
        ui.classLabelName.setText("" + p.getclass());
        ui.hpLabelNumber.setText("" + calculableHP);
        ui.dmgLabelNumber.setText("" + p.getDMG());
        ui.spdLabelNumber.setText("" + p.getSPD());

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "King: Smart choice. Mages are scholars who studies the arcane. They are known for their long-ranged and high-damage attacks.\n\nYour stats have been changed to match those of Mages.Are you ready for the trial?");

        // displaying labels to the game screen
        ui.choice1.setText("I am ready");
        ui.choice2.setText("I wish to change my class");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("firstTrial", "ClassSelection", "", "");

    }

    /**
     * This method will be called when the "firstTrial" expression is performed
     */
    private void firstTrial() {

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "King: To see if you have what it takes to save our world, we will transport you to the Elden Forest. Ferocious monsters roam around the area. Your quest is to defeat the Dragon who settles in the cave far north in the forest.\n\n Are you ready?");

        // displaying labels to the game screen
        ui.choice1.setText("I'm ready");
        ui.choice2.setText("About the Dragon...");
        ui.choice3.setText("About the Monsters...");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("EldenForest", "Dragon_info", "Monster_info", "");

    }

    /**
     * This method will be called when the "Dragon_info" expression is performed
     */
    private void Dragon_info() {

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "King: That Dragon has been harassing nearby villages. It's scales are as hard as an iron, with burning breath that can destroy the forest.\n\nAs you are now, it's impossible for you to beat it. But fear not, the forest is equiped with everything you need. You just need to know where to look.");

        // displaying labels to the game screen
        ui.choice1.setText("<");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("firstTrial", "", "", "");
    }

    /**
     * This method will be called when the "Monster_info" expression is performed
     */
    private void Monster_info() {

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "King: Goblins and Ogres reside in the east side of the forest. Goblins are weak but sometimes they form groups. Ogres are strong but very slow. Elementals nests in the west side. They are powerful. Engage them wisely. Lizardmen lives in the south swamp. They're very agile creatures. ");

        // displaying labels to the game screen
        ui.choice1.setText("<");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("firstTrial", "", "", "");
    }

    /**
     * This method will be called when the "Monster_info" expression is performed
     */
    private void EldenForest() {

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "You are teleported in the center part of the Elden Forest. You feel the fresh yet threatening air of your surrounding. There are four paths around you.\n\n\nWhat will you do?");

        // displaying labels to the game screen
        ui.choice1.setText("Go North");
        ui.choice2.setText("Go East");
        ui.choice3.setText("Go West");
        ui.choice4.setText("Go South");

        // calling the next method with the following as its parameters
        next("Cave", "TrollBridge", "Elemental", "Swamp");

    }

    /**
     * This method will be called when the "Monster_info" expression is performed
     */
    private void TrollBridge() {

        // setting up a random monster encounter system
        int x = new java.util.Random().nextInt(100) + 1;

        /*
         * the monster goblin will be stored to the monster object when x is less than
         * or equal to 50; monster goblin horde when in the range of 51-75; monster ogre
         * when in the range of 76-100
         */
        if (x <= 50) {
            monster = new monster_goblin();
        } else if (x > 50 && x <= 75) {
            monster = new monster_goblin_horde();
        } else {
            monster = new monster_ogre();
        }

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "You are in a the Troll bridge area. This place is flooded with monsters.\n\nA monster approaches you. It seems you're not welcome here.\n\nWhat will you do?");

        // displaying labels to the game screen
        ui.choice1.setText("Engage in battle");
        ui.choice2.setText("Go back");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("fight", "EldenForest", "", "");

    }

    /**
     * This method will be called when the "Cave" expression is performed
     */
    private void cave() {

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "You are in the Northern part of the forest. You see the Dragon's cave further ahead.\nNear it's entrance you see an unknown lady.\nOn your right you see a fountain\n\n\nWhat will you do?");

        // displaying labels to the game screen
        ui.choice1.setText("Enter Cave");
        ui.choice2.setText("Talk to the Lady");
        ui.choice3.setText("Drink from fountain");
        ui.choice4.setText("Go back");

        // calling the next method with the following as its parameters
        next("Dragon", "lady", "fountain", "EldenForest");

    }

    /**
     * This method will be called when the "Dragon" expression is performed
     */
    private void Dragon() {

        // instantiating the monster object to dragon
        monster = new monster_dragon();

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "You encountered the Dragon. It roars thunderously, warning you to back off.\n\n\nWhat will you do?");

        // displaying labels to the game screen
        ui.choice1.setText("Engage in battle");
        ui.choice2.setText("Go back");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("fight", "Cave", "", "");

    }

    /**
     * This method will be called when the "lady" expression is performed
     */
    private void lady() {

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "Lady: Hello there! You must be here to slay the dragon. I'm a merchant and I sell top quality weapons to assist you in your quest. Here are the prices:\n\tLegendary Sword --> 30 coins\n\tLegendary Bow --> 30 coins\n\tLegendary Staff --> 30 coins");

        // displaying labels to the game screen
        ui.choice1.setText("Buy Legendary Sword");
        ui.choice2.setText("Buy Legendary Bow");
        ui.choice3.setText("Buy Legendary Staff");
        ui.choice4.setText("Go back");

        // calling the next method with the following as its parameters
        next("legendarySword", "legendaryBow", "legendaryStaff", "Cave");

    }

    /**
     * This method will be called when the "legendarySword" expression is performed
     */
    private void legendarySword() {

        String currentClass = p.getclass();

        // the transaction will execute when the following condition is met
        if (lady.legendarySword == 1 && currentClass == "Knight" && calculableCoin >= 30) {

            // instantiating the weapon object to the legendary sword weapon
            weapon = new weapon_legendarysword();
            ui.mainTextArea.setText("Lady: Thank you for your purchase. May this weapon lead you to victory");
            // deducting sword cost to your current coin
            calculableCoin = calculableCoin - 30;
            // updating new amount of sword
            lady.legendarySword -= 1;

            // updating player stats
            p.setWeapon(weapon);
            p.setHP(Class, weapon);
            p.setDMG(Class, weapon);
            p.setSPD(Class, weapon);

            // displaying updated player stats to screen
            ui.weaponLabelName.setText("" + p.getWeapon());
            ui.coinLabelNumber.setText("" + p.getCoin());
            ui.classLabelName.setText("" + p.getClass());
            ui.hpLabelNumber.setText("" + p.getHP());
            ui.dmgLabelNumber.setText("" + p.getDMG());
            ui.spdLabelNumber.setText("" + p.getSPD());
        }

        else if (lady.legendarySword == 0) {
            ui.mainTextArea.setText("Lady: You already purchased this weapon");

        }

        else if (currentClass != "Knight") {

            ui.mainTextArea.setText("Lady: This weapon is not suited for your class. Try other weapons.");

        }

        else if (calculableCoin < 30) {

            ui.mainTextArea.setText(
                    "Lady: You don't have enough coin. Try battling some monsters in the area to acquire more gold.");

        }

        // displaying labels to the game screen
        ui.choice1.setText("<");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("lady", "", "", "");

    }

    /**
     * This method will be called when the "legendaryBow" expression is performed
     */
    private void legendaryBow() {

        String currentClass = p.getclass();

        // the transaction will execute when the following condition is met
        if (lady.legendaryBow == 1 && currentClass == "Archer" && calculableCoin >= 30) {

            // instantiating the weapon object to the legendary bow weapon
            weapon = new weapon_legendarybow();

            ui.mainTextArea.setText("Lady: Thank you for your purchase. May this weapon lead you to victory");
            // deducting sword cost to your current coin
            calculableCoin = calculableCoin - 30;
            // updating new amount of sword
            lady.legendaryBow -= 1;

            // updating player stats
            p.setWeapon(weapon);
            p.setHP(Class, weapon);
            p.setDMG(Class, weapon);
            p.setSPD(Class, weapon);

            // displaying updated player stats to screen
            ui.weaponLabelName.setText("" + p.getWeapon());
            ui.coinLabelNumber.setText("" + p.getCoin());
            ui.classLabelName.setText("" + p.getClass());
            ui.hpLabelNumber.setText("" + p.getHP());
            ui.dmgLabelNumber.setText("" + p.getDMG());
            ui.spdLabelNumber.setText("" + p.getSPD());

        }

        else if (lady.legendaryBow == 0) {
            ui.mainTextArea.setText("Lady: You already purchased this weapon");

        }

        else if (currentClass != "Archer") {

            ui.mainTextArea.setText("Lady: This weapon is not suited for your class. Try other weapons.");

        }

        else if (calculableCoin < 30) {

            ui.mainTextArea.setText(
                    "Lady: You don't have enough coin. Try battling some monsters in the area to acquire more gold.");

        }

        // displaying labels to the game screen
        ui.choice1.setText("<");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("lady", "", "", "");

    }

    /**
     * This method will be called when the "legendaryStaff" expression is performed
     */
    private void legendaryStaff() {

        String currentClass = p.getclass();

        // the transaction will execute when the following condition is met
        if (lady.legendaryStaff == 1 && currentClass == "Mage" && calculableCoin >= 30) {

            // instantiating the weapon object to the legendary staff weapon
            weapon = new weapon_legendarystaff();

            ui.mainTextArea.setText("Lady: Thank you for your purchase. May this weapon lead you to victory");
            // deducting sword cost to your current coin
            calculableCoin = calculableCoin - 30;
            // updating new amount of sword
            lady.legendaryStaff -= 1;

            // updating player stats
            p.setWeapon(weapon);
            p.setHP(Class, weapon);
            p.setDMG(Class, weapon);
            p.setSPD(Class, weapon);

            // displaying updated player stats to screen
            ui.weaponLabelName.setText("" + p.getWeapon());
            ui.coinLabelNumber.setText("" + p.getCoin());
            ui.classLabelName.setText("" + p.getClass());
            ui.hpLabelNumber.setText("" + p.getHP());
            ui.dmgLabelNumber.setText("" + p.getDMG());
            ui.spdLabelNumber.setText("" + p.getSPD());

        }

        else if (lady.legendaryStaff == 0) {
            ui.mainTextArea.setText("Lady: You already purchased this weapon");

        }

        else if (currentClass != "Mage") {

            ui.mainTextArea.setText("Lady: This weapon is not suited for your class. Try other weapons.");

        }

        else if (calculableCoin < 30) {

            ui.mainTextArea.setText(
                    "Lady: You don't have enough coin. Try battling some monsters in the area to acquire more gold.");

        }

        // displaying labels to the game screen
        ui.choice1.setText("<");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("lady", "", "", "");

    }

    /**
     * This method will be called when the "fountain" expression is performed
     */
    private void fountain() {

        // displaying labels to the game screen
        ui.choice1.setText("Drink again");
        ui.choice2.setText("Go back");
        ui.choice3.setText("");
        ui.choice4.setText("");

        /*
         * increase hp when there's healingWater left and the current hp of the player
         * is less than its max hp
         */
        if (fountain.healingWater > 0 && calculableHP < (Class.health + weapon.health)) {

            fountain.healingWater--;
            calculableHP++;
            ui.hpLabelNumber.setText("" + calculableHP);
            ui.mainTextArea
                    .setText("You drank from the fountain and recovered 1 hp!\n\nHealing Water in fountain remaining: "
                            + fountain.healingWater);

        }

        else if (fountain.healingWater == 0) {
            ui.mainTextArea.setText("The fountain is empty\n\nHealing Water in fountain remaining: "
                    + fountain.healingWater);
        }

        // this is to prevent the player's hp to increase more than its max hp
        else if (calculableHP >= (Class.health + weapon.health))

        {
            ui.mainTextArea
                    .setText("You can't drink more or else you will get sick\n\nHealing Water in fountain remaining: "
                            + fountain.healingWater);
        }

        // calling the next method with the following as its parameters
        next("fountain", "Cave", "", "");

    }

    /**
     * This method will be called when the "ElementalNest" expression is performed
     */
    private void ElementalNest() {

        // instantiating the monster object to elemental
        monster = new monster_elemental();

        // diplaying dialogue to game screen
        ui.mainTextArea.setText(
                "You are in the Elemental Nest. This place is full of powerful Elementals.\n\nAn Elemental shows hostility towards you. What will you do?");

        // displaying labels to the game screen
        ui.choice1.setText("Engage in battle");
        ui.choice2.setText("Go back");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("fight", "EldenForest", "", "");
    }

    /**
     * This method will be called when the "Swamp" expression is performed
     */
    private void Swamp() {
        // instantiating the monster object to lizardman
        monster = new monster_lizardman();

        // diplaying dialogue to game screen
        ui.mainTextArea.setText(
                "You are in the swamp.This place is full of Lizardmen.\n\nA lizardman agressively approaches you. What will you do?");

        // displaying labels to the game screen
        ui.choice1.setText("Engage in battle");
        ui.choice2.setText("Go back");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("fight", "EldenForest", "", "");
    }

    // CREATING THE BATTLE SYSTEM

    /**
     * This method will be called when the "fight" expression is performed
     */
    private void fight() {

        // diplaying dialogue to game screen
        ui.mainTextArea.setText(
                "Name: " + monster.name + "\n\nHealth: " + monster.health + "\n\nDamage: "
                        + monster.damage);

        // displaying labels to the game screen
        ui.choice1.setText("Attack");
        ui.choice2.setText("Run away");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("playerAttack", "retreat", "", "");

    }

    /**
     * This method will be called when the "playerAttack" expression is performed
     */
    private void playerAttack() {

        // instantiating objects
        int playerDamage = new java.util.Random().nextInt(p.getDMG());
        int playerSpeed = new java.util.Random().nextInt(p.getSPD());
        int monsterSpeed = new java.util.Random().nextInt(monster.speed);

        // displaying labels to the game screen
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // when you are faster than the monster, your attack will hit
        if (playerSpeed >= monsterSpeed) {
            ui.mainTextArea.setText("You attacked the " + monster.name + " and dealt " + playerDamage + " damage!");
            monster.health = monster.health - playerDamage;

            // calculating the monster's health
            if (monster.health > 0) {
                next("monsterAttack", "", "", "");
            }

            else {
                next("win", "", "", "");
            }

        }

        // when monster is faster than you, they can dodge your attack
        else if (playerSpeed < monsterSpeed) {
            ui.mainTextArea.setText("The " + monster.name + " dodged your attack");
            next("monsterAttack", "", "", "");
        }

    }

    /**
     * This method will be called when the "playerAttack" expression is performed
     */
    private void monsterAttack() {

        // instantiating objects
        int monsterDamage = new Random().nextInt(monster.damage);
        int playerSpeed = new java.util.Random().nextInt(p.getSPD());
        int monsterSpeed = new java.util.Random().nextInt(monster.speed);

        // displaying labels to the game screen
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // if the monster is faster than you their attack will hit
        if (playerSpeed <= monsterSpeed) {

            ui.mainTextArea
                    .setText("The " + monster.name + " launched an attack. You received " + monsterDamage + " damage!");

            calculableHP = calculableHP - monsterDamage;
            ui.hpLabelNumber.setText("" + calculableHP);

            // calculating your health
            if (calculableHP > 0) {

                next("fight", "", "", "");
            }

            else {

                next("lose", "", "", "");
            }

        }

        // if you're faster than the monster, you can dodge their attack
        else if (playerSpeed > monsterSpeed) {

            ui.mainTextArea.setText("You dodged the " + monster.name + "'s attack.");
            next("fight", "", "", "");

        }

    }

    /**
     * This method will be called when the "retreat" expression is performed
     */
    private void retreat() {

        // instantiating objects
        int playerSpeed = new java.util.Random().nextInt(p.getSPD());
        int monsterSpeed = new java.util.Random().nextInt(monster.speed);

        // displaying labels to the game screen
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // you can escape when you're faster than the monster
        if (playerSpeed > monsterSpeed) {

            ui.mainTextArea.setText("You outran the " + monster.name + ". Fleeing succesful!");

            /*
             * if monster is dragon, you will return to the Cave area, else, you will return
             * to the center part of the EldenForest
             */
            if (monster.name == "Dragon") {
                next("Cave", "", "", "");
            }

            else {

                next("EldenForest", "", "", "");
            }
        }

        // you can't escape when monster is faster than you
        else if (playerSpeed <= monsterSpeed) {

            ui.mainTextArea.setText(monster.name + "'s Speed is too fast for you. You can't flee");
            next("monsterAttack", "", "", "");
        }

    }

    /**
     * This method will be called when the "win" expression is performed
     */
    private void win() {

        // you win the game and it will end when you win against dragon
        if (monster.name == "Dragon") {

            ui.mainTextArea.setText(
                    "Congratulations! You Passed the trial. Welcome to our world, our Hero.\n\n\nWould you like to play again?");
            ui.choice1.setText("Yes");
            ui.choice2.setText("No");
            ui.choice3.setText("");
            ui.choice4.setText("");

            next("toTitle", "closeGame", "", "");
        }

        /*
         * if monster is not a dragon it will drop a coin and will return you to elden
         * forest
         */
        else {

            monster.coin = new java.util.Random().nextInt(monster.coin);
            calculableCoin = calculableCoin + monster.coin;
            ui.coinLabelNumber.setText("" + calculableCoin);
            ui.mainTextArea.setText(
                    "You killed the " + monster.name
                            + ". It dropped " + monster.coin
                            + " coin.\n\nThis area is filled with monsters. It's best to not go any deeper and fall back.");

            ui.choice1.setText(">");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            next("EldenForest", "", "", "");

        }

    }

    /**
     * This method will be called when the "win" expression is performed
     */
    private void lose() {

        // displaying dialogue to game screen
        ui.mainTextArea.setText("You died from the battle. You lose.\n\n\nWould you like to play again?");
        ui.choice1.setText("Yes");
        ui.choice2.setText("No");
        ui.choice3.setText("");
        ui.choice4.setText("");

        // calling the next method with the following as its parameters
        next("toTitle", "closeGame", "", "");
    }

}
