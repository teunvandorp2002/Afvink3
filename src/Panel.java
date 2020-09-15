import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public final Object Panel;
    static {
        new JPanel().setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Panel() {
        Panel = null;
    }

    /*
    public Object panel(){
        Panel panel = new Panel();
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        return panel;
    }*/
}
