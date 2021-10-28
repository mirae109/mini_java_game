import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Intro extends JPanel {

    ImageIcon TitleImage = new ImageIcon("../img/mainimg.png");
    ImageIcon StartButtonImage = new ImageIcon("../img/start.png");
    ImageIcon ExButtonImage = new ImageIcon("../img/way.png");
//    ImageIcon StartButtonEnteredImage = new ImageIcon(Main.class.getResource("../img/start_hover.png"));
//    ImageIcon ExButtonEnteredImage = new ImageIcon(Main.class.getResource("../img/way_hover.png"));

    JButton titleImg = new JButton(TitleImage);
    JButton btnStart = new JButton(StartButtonImage);
    JButton btnEx = new JButton(ExButtonImage);

    public Intro() {
        setPreferredSize(new Dimension(500,700));
        setBackground(new Color(215, 215, 215));
        setLayout(null);

        //버튼 위치
        titleImg.setBounds(40,77,400,237);
        btnStart.setBounds(40,400,400,100);
        btnEx.setBounds(40,530,400,100);

        //버튼 삽입
        add(titleImg);
        add(btnStart);
        add(btnEx);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game game = new Game();
                game.init();
                setVisible(false);
            }
        });


    }
}
