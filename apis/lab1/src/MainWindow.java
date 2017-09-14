import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final String NAME = "Photothèque";

    private MenuBar mMenuBar;
    private BorderLayout mMainLayout;

    public MainWindow() {
        super();
        mMainLayout = new BorderLayout();
        mMenuBar = new MenuBar();

        setTitle(NAME);
        setJMenuBar(mMenuBar);
        setPreferredSize(new Dimension(800,600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        getContentPane().setLayout(mMainLayout);
        pack();
    }
}
