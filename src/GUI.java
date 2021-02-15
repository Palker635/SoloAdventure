import javax.swing.*;

public class GUI {
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton button1;
    private JButton button2;
    private JTextArea textArea3;


    public static void main(String[] args) {
        Links game = new Links();
        GUI gui = new GUI();
        gui.textArea1.setText(game.body);
        JFrame frame = new JFrame("MVC");
        frame.setContentPane(gui.textArea1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

    }
}