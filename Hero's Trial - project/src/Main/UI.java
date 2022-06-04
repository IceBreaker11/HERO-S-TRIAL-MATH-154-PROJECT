package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import Main.Game.ChoiceHandler;

/**
 * This class is for creating the window and user interface
 * of the game such as the buttons, panels and labels.
 * 
 * @version java version "18"
 * @author Panoy, Arpachshad
 */
public class UI {
    // instatiating object in the class
    JFrame window;
    JPanel titleNamePanel, startButtonPanel, playerPanel, mainTextPanel, choiceButtonPanel, bottomPanel;
    JLabel titleNameLabel, hpLabel, dmgLabel, spdLabel, classLabel, hpLabelNumber, dmgLabelNumber,
            spdLabelNumber, classLabelName, weaponLabel, weaponLabelName, coinLabel, coinLabelNumber;
    JButton start_Button, choice1, choice2, choice3, choice4, invButton, itembutton1, itembutton2, itembutton3,
            itembutton4, itembutton5;
    JTextArea mainTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
    Font statsFont = new Font("Times New Roman", Font.PLAIN, 18);

    /**
     * This method is for creating the window and user interface of the game
     * such as the title screen, buttons, and the text area
     * 
     * @param cHandler passing this class to this method to access its components
     *                 from the Game class
     * 
     */
    public void createUI(ChoiceHandler cHandler) {

        // creating window
        window = new JFrame();
        window.setSize(850, 675);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        // creating TITLE SCREEN
        // creating Title name
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(125, 150, 625, 125);
        titleNamePanel.setBorder(BorderFactory.createLineBorder(Color.white));
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("HERO'S TRIAL");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        window.add(titleNamePanel);

        // creating start button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 450, 250, 150);
        startButtonPanel.setBackground(Color.black);
        start_Button = new JButton("START");
        start_Button.setBackground(Color.white);
        start_Button.setForeground(Color.black);
        start_Button.setFont(normalFont);
        start_Button.setFocusPainted(false);
        start_Button.addActionListener(cHandler);
        start_Button.setActionCommand("start");
        startButtonPanel.add(start_Button);
        window.add(startButtonPanel);

        // creating GAME SCREEN
        // creating Dialogue area
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 75, 600, 250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);
        mainTextArea = new JTextArea("Main text area");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        // crating choice button panel
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 325, 350, 200);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        window.add(choiceButtonPanel);

        // creating choice 1 button
        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        // creating choice 2 button
        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        // creating choice 3 button
        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        // creating choice 4 button
        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        // creating player stats panel
        playerPanel = new JPanel();
        playerPanel.setBounds(75, 15, 700, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setForeground(Color.white);
        playerPanel.setLayout(new GridLayout(1, 8));
        playerPanel.setBorder(BorderFactory.createLineBorder(Color.white));
        window.add(playerPanel);

        // creating label for class
        classLabel = new JLabel("Class:");
        classLabel.setFont(statsFont);
        classLabel.setBackground(Color.black);
        classLabel.setForeground(Color.white);
        playerPanel.add(classLabel);
        classLabelName = new JLabel();
        classLabelName.setFont(statsFont);
        classLabelName.setBackground(Color.black);
        classLabelName.setForeground(Color.blue);
        playerPanel.add(classLabelName);

        // creating label for health
        hpLabel = new JLabel("HP:");
        hpLabel.setFont(statsFont);
        hpLabel.setBackground(Color.black);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(statsFont);
        hpLabelNumber.setBackground(Color.black);
        hpLabelNumber.setForeground(Color.blue);
        playerPanel.add(hpLabelNumber);

        // creating label for Damage
        dmgLabel = new JLabel("DMG:");
        dmgLabel.setFont(statsFont);
        dmgLabel.setBackground(Color.black);
        dmgLabel.setForeground(Color.white);
        playerPanel.add(dmgLabel);
        dmgLabelNumber = new JLabel();
        dmgLabelNumber.setFont(statsFont);
        dmgLabelNumber.setBackground(Color.black);
        dmgLabelNumber.setForeground(Color.blue);
        playerPanel.add(dmgLabelNumber);

        // creating label for speed
        spdLabel = new JLabel("SPD:");
        spdLabel.setFont(statsFont);
        spdLabel.setBackground(Color.black);
        spdLabel.setForeground(Color.white);
        playerPanel.add(spdLabel);
        spdLabelNumber = new JLabel();
        spdLabelNumber.setFont(statsFont);
        spdLabelNumber.setBackground(Color.black);
        spdLabelNumber.setForeground(Color.blue);
        playerPanel.add(spdLabelNumber);

        // creating bottom panel
        bottomPanel = new JPanel();
        bottomPanel.setBounds(75, 550, 700, 50);
        bottomPanel.setBackground(Color.black);
        bottomPanel.setForeground(Color.white);
        bottomPanel.setLayout(new GridLayout(1, 4));
        bottomPanel.setBorder(BorderFactory.createLineBorder(Color.white));
        window.add(bottomPanel);

        // creating label for weapon
        weaponLabel = new JLabel("Weapon:", SwingConstants.CENTER);
        weaponLabel.setFont(statsFont);
        weaponLabel.setBackground(Color.black);
        weaponLabel.setForeground(Color.white);
        bottomPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(statsFont);
        weaponLabelName.setBackground(Color.black);
        weaponLabelName.setForeground(Color.blue);
        bottomPanel.add(weaponLabelName);

        // creating label for coin
        coinLabel = new JLabel("Coin:", SwingConstants.CENTER);
        coinLabel.setFont(statsFont);
        coinLabel.setBackground(Color.black);
        coinLabel.setForeground(Color.white);
        bottomPanel.add(coinLabel);
        coinLabelNumber = new JLabel();
        coinLabelNumber.setFont(statsFont);
        coinLabelNumber.setBackground(Color.black);
        coinLabelNumber.setForeground(Color.blue);
        bottomPanel.add(coinLabelNumber);

        window.setVisible(true);

    }
}
