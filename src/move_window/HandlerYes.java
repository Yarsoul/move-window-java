package move_window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandlerYes implements ActionListener {
    private MyWindow myFrame;
    private int locationX, locationY, myWidth, myHeight;
    private String textHorizontal, textVertical;

    public HandlerYes(MyWindow window) {
        this.myFrame = window;
    }

    public void actionPerformed(ActionEvent event) {
        this.locationX = this.myFrame.myGetLocationX();
        this.locationY = this.myFrame.myGetLocationY();
        this.myWidth = this.myFrame.myGetWidth();
        this.myHeight = this.myFrame.myGetHeight();
        this.textHorizontal = getTextLabel(this.myFrame.labelHorizontal);
        this.textVertical = getTextLabel(this.myFrame.labelVertical);

        this.mySetLocationX(this.textHorizontal);
        this.mySetLocationY(this.textVertical);
        this.myCorrectLocationX(this.locationX);
        this.myCorrectLocationY(this.locationY);

        this.myFrame.mySetLocation(this.locationX, this.locationY);
    }


    public String getTextLabel(JLabel label) {
        if ((label != null) && (label == this.myFrame.labelHorizontal)) {
            return this.myFrame.labelHorizontal.getText();
        } else if ((label != null) && (label == this.myFrame.labelVertical)) {
            return this.myFrame.labelVertical.getText();
        } else {
            return "";
        }
    }

    public void mySetLocationX(String text) {
        if (text.contains("лево")) {
            this.locationX = this.locationX - 100;
        } else if (text.contains("право")) {
            this.locationX = this.locationX + 100;
        }
    }

    public void mySetLocationY(String text) {
        if (text.contains("верх")) {
            this.locationY = this.locationY - 100;
        } else if (text.contains("низ")) {
            this.locationY = this.locationY + 100;
        }
    }

    public void myCorrectLocationX(int x) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();

        if ((x + this.myWidth) > screenWidth) {
            this.locationX = (int) screenWidth - myWidth;
        } else if (x < 0) {
            this.locationX = 0;
        }
    }

    public void myCorrectLocationY(int y) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenHeight = screenSize.getHeight() - 32;

        if ((y + myHeight) > screenHeight) {
            this.locationY = (int) screenHeight - myHeight;
        } else if (y < 0) {
            this.locationY = 0;
        }
    }
}
