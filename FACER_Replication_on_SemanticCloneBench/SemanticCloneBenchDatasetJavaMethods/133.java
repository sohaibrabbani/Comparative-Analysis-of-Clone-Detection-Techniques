public class XYX {
public void actionPerformed (ActionEvent e) {

    tick ();

    int delta = 20;

    int width = SPRITE_WIDTH + 2 * delta;

    int height = width;

    if (moved) {

        int x = oldMX - delta;

        int y = oldMY - delta;

        repaint (x, y, width, height);

    }

    int x = mX - delta;

    int y = mY - delta;

    repaint (x, y, width, height);

    moved = false;

}

}