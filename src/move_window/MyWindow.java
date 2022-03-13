package move_window;

import javax.swing.*;

public class MyWindow extends JFrame {
    public JFrame window;
    public JMenuBar menuBar;
    public JLabel labelHorizontal, labelVertical;
    public JButton buttonOk, buttonCancel;

    public MyWindow() {
        this.window = new JFrame("Новое окно");
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(500, 300);
        this.window.setLocationRelativeTo(null);
        this.window.setLayout(null);

        this.menuBar = new MyMenuBar(this).menu;
        this.window.setJMenuBar(this.menuBar);

        this.createLabelHorizontal();
        this.createLabelVertical();

        this.createButtonOk();
        this.createButtonCancel();

        this.window.setVisible(true);
    }

    public void createLabelHorizontal() {
        this.labelHorizontal = new JLabel("");
        this.labelHorizontal.setHorizontalAlignment(JLabel.CENTER);
        this.labelHorizontal.setBounds(0, 60, 500, 30);
        this.window.add(this.labelHorizontal);
    }

    public void createLabelVertical() {
        this.labelVertical = new JLabel("");
        this.labelVertical.setHorizontalAlignment(JLabel.CENTER);
        this.labelVertical.setBounds(0, 100, 500, 30);
        this.window.add(this.labelVertical);
    }

    public void createButtonOk() {
        this.buttonOk = new JButton();
        this.buttonOk.setText("OK");
        this.buttonOk.setBounds(85, 180, 100, 30);
        this.buttonOk.setEnabled(false);
        this.buttonOk.addActionListener(new HandlerYes(this));
        this.window.add(this.buttonOk);
    }

    public void createButtonCancel() {
        this.buttonCancel = new JButton();
        this.buttonCancel.setText("Cancel");
        this.buttonCancel.setBounds(325, 180, 100, 30);
        this.buttonCancel.setEnabled(true);
        this.buttonCancel.addActionListener(new HandlerNo(this));
        this.window.add(this.buttonCancel);
    }


    public int myGetLocationX() {
        return this.window.getX();
    }

    public int myGetLocationY() {
        return this.window.getY();
    }

    public int myGetWidth() {
        return this.window.getWidth();
    }

    public int myGetHeight() {
        return this.window.getHeight();
    }

    public void mySetLocation(int x, int y) {
        this.window.setLocation(x, y);
    }

}