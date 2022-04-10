package view;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {

     Color color = Color.black;

    public MyButton(){

        this.setBackground(color);
    }

    public Color getColor() {
        return color;
    }

    public  void setColor(Color color) {
        this.color = color;
    }
}
