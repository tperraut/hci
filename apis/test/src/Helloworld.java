import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by thomas.perraut on 9/12/17.
 * Borderlayout
 * Flowlayout
 */
public class Helloworld {
    public static void main(String args[]) {
        new Helloworld("Hi");
    }

    public Helloworld(String title) {
        JFrame window = new JFrame(title);
        window.getContentPane().setLayout(new FlowLayout());
        
        JButton sayHi = new JButton("Say Hi");
        sayHi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayHi();
            }
        });
        window.getContentPane().add(sayHi);
        
        JButton sayBye = new JButton("Say bye");
        sayBye.addActionListener(
                event -> sayBye()
        );
        window.getContentPane().add(sayBye);

        window.pack();
        window.setVisible(true);
    }

    private void sayBye() {
        System.out.println("Bye");
    }

    private void sayHi() {
        System.out.println("Hi");
    }
}
