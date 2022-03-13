package move_window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonShiftLeft implements ActionListener {
    public MyWindow myFrame2;

    public ButtonShiftLeft(MyWindow myFrame) {
        this.myFrame2 = myFrame;
    }

    public void actionPerformed(ActionEvent event) {
        this.myFrame2.buttonCancel.setEnabled(false);
        this.myFrame2.buttonOk.setEnabled(true);

        if (this.myFrame2.labelHorizontal != null) {
            this.myFrame2.labelHorizontal.setText("Сдвинуть окно влево на 100px");
        }
    }
}