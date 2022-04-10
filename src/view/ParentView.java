package view;

import javax.swing.*;
import java.awt.*;

public class ParentView extends JFrame {



public static Color viewcolor = Color.blue;



    public ParentView(){


    }

    public void initComponent(){

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setSize(600,600);
        this.getContentPane().setBackground(viewcolor);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);



    }

    public static void setColor(Color color) {
        viewcolor = color;
    }

}
