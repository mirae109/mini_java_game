import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simulation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("결합게임");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료되면 프로그램 같이 종료

        //Main Panel
        Intro intro = new Intro();
//        Game game = new Game();
//        game.init();

        //Main Frame
        frame.getContentPane().add(intro);
//        frame.getContentPane().add(game);
        frame.pack();
        frame.setVisible(true);




    }
}
