package Main;

/**
 * This class handles what to display on the screen
 * 
 * @version java version "18"
 * @author Panoy, Arpachshad
 */
public class VisibilityManager {

    // instantiating object
    UI ui;

    /**
     * This is the constructor of the class
     * 
     * @param UserInterface instance of UI class to access its properties
     */
    public VisibilityManager(UI UserInterface) {

        ui = UserInterface;

    }

    /**
     * This method contains what panels to show visible in the title screen
     */
    public void showTitleScreen() {

        // to show the title screen panels
        ui.titleNamePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        // to hide game screen panels
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
        ui.bottomPanel.setVisible(false);

    }

    /**
     * This method contains what panels to show visible in the gamescreen
     */
    public void titletogameScreen() {

        // to hide the title screen panels
        ui.titleNamePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        // to show game screen panels
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
        ui.bottomPanel.setVisible(true);

    }

}
