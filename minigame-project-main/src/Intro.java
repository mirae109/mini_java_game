import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Intro extends JPanel {

    ImageIcon TitleImage = new ImageIcon(Main.class.getResource("../img/타이틀.png"));
    ImageIcon StartButtonImage = new ImageIcon(Main.class.getResource("../img/게임시작.png"));
    ImageIcon StartButtonEnteredImage = new ImageIcon(Main.class.getResource("../img/게임시작클릭.png"));
    ImageIcon ExButtonImage = new ImageIcon(Main.class.getResource("../img/게임방법.png"));
    ImageIcon ExButtonEnteredImage = new ImageIcon(Main.class.getResource("../img/게임방법클릭.png"));

//    JButton btnStart;
    JButton btnEx;

    JButton btnStart = new JButton(StartButtonImage);

    public Intro() {

        btnStart.setBounds(40,200,400,100);
        btnStart.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                btnStart.setVisible(false);
//              btnEx.setVisible(false);  버튼만들고 주석풀기
//                background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg"))
//                        .getImage();

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                btnStart.setIcon(StartButtonEnteredImage);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                btnStart.setIcon(StartButtonImage);
            }
        });



    }
}
