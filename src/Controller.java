import javax.swing.*;

public class Controller {

    public static void main(String[] args) {
        Links game = new Links();
        GUI gui = new GUI();
        gui.textArea1.setText(game.body);
        gui.button1.setText(game.alternative1);
        gui.button2.setText(game.alternative2);
        JFrame frame = new JFrame("MVC");
        frame.setContentPane(gui.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
