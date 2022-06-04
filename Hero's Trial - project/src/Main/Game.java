
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This program is a text-based rpg game with GUI
 * 
 * This is the main class which contains the main method
 * 
 * @version java version "18"
 * @author Panoy, Arpachshad
 */

public class Game {

    // instantiating the objects
    ChoiceHandler cHandler = new ChoiceHandler();
    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    Main_Story story = new Main_Story(this, ui, vm);
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    /**
     * This is the main method or the entry point to start
     * the execution of the program
     * 
     * @param args a String array of the command line arguments.
     */
    public static void main(String[] args) {

        new Game();
    }

    public Game() {

        ui.createUI(cHandler);
        vm.showTitleScreen();

    }

    /**
     * This class handles the actions for each buttons in the game.
     * It implements the ActionListener class that is responsible for
     * handling all action events
     */
    public class ChoiceHandler implements ActionListener {

        /**
         * This method will be called every time the user will perform an action command.
         * 
         * @param event instance of the ActionEvent class to access its properties
         */
        public void actionPerformed(ActionEvent event) {

            // accessing the get.ActionCommand from the ActionEvent class and instantiating
            // it to yourChoice
            String yourChoice = event.getActionCommand();

            // a switch statement that will execute a method depending on the actionCommand
            switch (yourChoice) {

                case "start":
                    vm.titletogameScreen();
                    story.settingDefault();
                    break;
                case "c1":
                    story.selectPosition(nextPosition1);
                    break;
                case "c2":
                    story.selectPosition(nextPosition2);
                    break;
                case "c3":
                    story.selectPosition(nextPosition3);
                    break;
                case "c4":
                    story.selectPosition(nextPosition4);
                    break;
                    default:break;

            }
        }

    }

}
