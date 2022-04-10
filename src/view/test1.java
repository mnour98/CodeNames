package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test1 extends ParentView implements ActionListener {


    JLabel ll = new JLabel("from page 2");
    MyButton button;

    public test1(){

        initComponent();
        button = new MyButton();
        button.setText("My button");


        this.add(button);
        button.addActionListener(this);
        this.add(ll);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            JFrame ff = new GameSetupView();
        ff.setVisible(true);
        this.dispose();
    }
}
