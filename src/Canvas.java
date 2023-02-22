import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

    public class Canvas extends JPanel implements MouseListener {
        Color c1 = Color.getHSBColor(164, 233, 240);

        Color c2 = Color.pink;
        boolean color1 = false;

        public Canvas(){
            this.setBackground(Color.white);
            addMouseListener(this);
            this.setSize(new Dimension(300,300));
        }

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            repaint();
        }


        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Click!");
            System.out.println(e.getButton());
            if (e.getButton() == 1 ) {

                if (color1) {
                    this.setBackground(c1);
                } else {
                    this.setBackground(c2);
                }
                color1 = !color1;
            }else{
                this.setBackground(Color.WHITE);
            }
            repaint();

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

