import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    Links game;
    GUI gui;

    public Controller() {
        game = new Links();
        gui = new GUI();

        gui.getTextArea1().setText(game.body);
        gui.getButton1().setText(game.alternative1);
        gui.getButton2().setText(game.alternative2);

        JFrame frame = new JFrame("GUI");
        frame.setContentPane(gui.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

            gui.getButton1().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                game.currentRoom = game.target1;
                }
            });
                    gui.getButton2().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            game.currentRoom = game.target2;

            }
        });
    }
    public static void main(String[] args) {
        Controller main = new Controller();
        }
    }