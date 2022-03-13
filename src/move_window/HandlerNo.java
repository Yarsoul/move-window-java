package move_window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandlerNo implements ActionListener {
    private MyWindow myFrame;

    public HandlerNo(MyWindow window) {
        this.myFrame = window;
    }

    public void actionPerformed(ActionEvent event) {
        System.exit(0);
    }
}
