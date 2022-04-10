package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSetupView  extends ParentView implements ActionListener{

    MyButton button;
    JLabel lable;

    public GameSetupView(){

        initComponent();
        button = new MyButton();
        button.setText("My button");
        lable = new JLabel("lalal");
        button.addActionListener(this);
        this.add(button);
        this.add(lable);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ParentView.setColor(Color.yellow);
        JFrame ff = new test1();
        ff.setVisible(true);
        this.dispose();

    }
}
