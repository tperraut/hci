import javax.swing.*;

public class MenuBar extends JMenuBar {
    private FileMenu mFileMenu;
    private ViewMenu mViewMenu;

    public MenuBar() {
        super();
        mFileMenu = new FileMenu();
//        mViewMenu = new ViewMenu();

        add(mFileMenu);
//        add(mViewMenu);
    }
}
