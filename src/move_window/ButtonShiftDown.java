package move_window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonShiftDown implements ActionListener {
    public MyWindow myFrame2;

    public ButtonShiftDown(MyWindow myFrame) {
        this.myFrame2 = myFrame;
    }

    public void actionPerformed(ActionEvent event) {
        this.myFrame2.buttonCancel.setEnabled(false);
        this.myFrame2.buttonOk.setEnabled(true);

        if (this.myFrame2.labelVertical != null) {
            this.myFrame2.labelVertical.setText("Сдвинуть окно вниз на 100px");
        }
    }
}