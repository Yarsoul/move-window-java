package move_window;

import javax.swing.*;

public class MyMenuBar extends JMenuBar {
    public JMenuBar menu;
    public MyWindow myFrame;

    public MyMenuBar(MyWindow window) {
        this.myFrame = window;
        this.menu = new JMenuBar();
        this.menu.add(createMenuShiftHorizontal());
        this.menu.add(createMenuShiftVertical());
        this.menu.add(createMenuParameters());
    }


    private JMenu createMenuShiftHorizontal() {
        JMenu menuShiftHorizontal = new JMenu("Сдвинуть по горизонтали");

        JMenuItem shiftLeft = new JMenuItem("Сдвинуть влево на 100px");
        shiftLeft.addActionListener(new ButtonShiftLeft(this.myFrame));
        JMenuItem shiftRight = new JMenuItem("Сдвинуть вправо на 100px");
        shiftRight.addActionListener(new ButtonShiftRight(this.myFrame));

        menuShiftHorizontal.add(shiftLeft);
        menuShiftHorizontal.add(shiftRight);

        return menuShiftHorizontal;
    }

    private JMenu createMenuShiftVertical() {
        JMenu menuShiftVertical = new JMenu("Сдвинуть по вертикали");

        JMenuItem shiftUp = new JMenuItem("Сдвинуть вверх на 100px");
        shiftUp.addActionListener(new ButtonShiftUp(this.myFrame));
        JMenuItem shiftDown = new JMenuItem("Сдвинуть вниз на 100px");
        shiftDown.addActionListener(new ButtonShiftDown(this.myFrame));

        menuShiftVertical.add(shiftUp);
        menuShiftVertical.add(shiftDown);

        return menuShiftVertical;
    }

    private JMenu createMenuParameters() {
        JMenu menuParameters = new JMenu("Параметры");

        JMenuItem delete = new JMenuItem("Удалить");
        delete.addActionListener(new ButtonDelete(this.myFrame));

        menuParameters.add(delete);

        return menuParameters;
    }
}
