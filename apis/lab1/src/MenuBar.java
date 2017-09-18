import javax.swing.*;

class MenuBar extends JMenuBar {

    private FileMenu mFileMenu;
    private ViewMenu mViewMenu;

    MenuBar(Listener listener) {
        super();
        mFileMenu = new FileMenu();
        mViewMenu = new ViewMenu();
        mFileMenu.setListener(listener);
        mViewMenu.setListener(listener);

        add(mFileMenu);
        add(mViewMenu);
    }

    interface Listener extends FileMenu.Listener, ViewMenu.Listener {}
}
