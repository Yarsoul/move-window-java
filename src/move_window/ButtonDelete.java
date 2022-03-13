package move_window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDelete implements ActionListener {
    public MyWindow myFrame2;

    public ButtonDelete(MyWindow myFrame) {
        this.myFrame2 = myFrame;
    }

    public void actionPerformed(ActionEvent event) {
        this.myFrame2.buttonCancel.setEnabled(true);
        this.myFrame2.buttonOk.setEnabled(false);

        if (this.myFrame2.labelHorizontal != null) {
            this.myFrame2.labelHorizontal.setText("");
        }

        if (this.myFrame2.labelVertical != null) {
            this.myFrame2.labelVertical.setText("");
        }
    }
}
