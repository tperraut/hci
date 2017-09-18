import helper.Helper;
import javax.swing.*;

class MainContent extends JPanel {
    private static final double RATIO = 0.8;

    MainContent(){
        super();
        setMinimumSize(Helper.scaleDimension(MainWindow.MIN_SIZE, RATIO));
        setMaximumSize(Helper.scaleDimension(MainWindow.MAX_SIZE, RATIO));
        setPreferredSize(Helper.scaleDimension(MainWindow.PREFERRED_SIZE, RATIO));
    }
}
