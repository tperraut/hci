import helper.Helper;

import javax.swing.*;
import java.awt.*;
import java.io.File;

class MainWindow extends JFrame implements MenuBar.Listener, Toolbar.Listener {
    static final Dimension PREFERRED_SIZE = new Dimension(1366, 768);
    static final Dimension MIN_SIZE = new Dimension(800, 600);
    static final Dimension MAX_SIZE = Toolkit.getDefaultToolkit().getScreenSize();

    private static final String NAME = "Photothèque";

    private MenuBar mMenuBar;
    private MainContent mMainContent;
    private StatusBar mStatusBar;
    private JFileChooser mFileChooser;
    private Toolbar mToolbar;

    MainWindow() {
        super(NAME);
        mMenuBar = new MenuBar(this);
        mMainContent = new MainContent();
        mStatusBar = new StatusBar();
        mFileChooser = new JFileChooser();
        mToolbar = new Toolbar(this);

        mFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

        add(mMainContent, BorderLayout.CENTER);
        add(mStatusBar, BorderLayout.PAGE_END);
        add(mToolbar, BorderLayout.PAGE_START);

        setJMenuBar(mMenuBar);
        setPreferredSize((Helper.compareDim(PREFERRED_SIZE, MAX_SIZE)) ? MIN_SIZE : PREFERRED_SIZE);
        setMinimumSize(MIN_SIZE);
        setMaximumSize(MAX_SIZE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        pack();
    }

    @Override
    public void onImportRequested(String label) {
        mStatusBar.setText(label);
        mFileChooser.showOpenDialog(this);
        //TODO do something with the file
    }

    @Override
    public void onDeleteRequested(String label) {
        mStatusBar.setText(label);
        //TODO Delete pic
    }

    @Override
    public void onQuitRequested(String label) {
        mStatusBar.setText(label);
        dispose();
    }

    @Override
    public void onPhotoRequested(String label) {
        mStatusBar.setText(label);
        //TODO show one photo at a time
    }

    @Override
    public void onBrowserRequested(String label) {
        mStatusBar.setText(label);
        //TODO show a grid of thumbnails
    }

    @Override
    public void onSplitRequested(String label) {
        mStatusBar.setText(label);
        //TODO show a single photo with "film strip" of its neighbors
    }

    @Override
    public void onFamilyCatRequested(String label, boolean selected) {
        mStatusBar.setText(label);
        //TODO match on selected
    }

    @Override
    public void onVacationCatRequested(String label, boolean selected) {
        mStatusBar.setText(label);
        //TODO match on selected
    }

    @Override
    public void onSchoolCatRequested(String label, boolean selected) {
        mStatusBar.setText(label);
        //TODO match on selected
    }
}
