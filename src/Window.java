import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){

        this.setTitle("Fun with layouts");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(800,800));

        this.setLayout(new GridLayout());


        this.add(LayoutManager);



        this.pack();
        this.setVisible(true);
    }c

}
