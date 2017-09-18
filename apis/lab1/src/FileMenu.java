import javax.swing.*;

class FileMenu extends JMenu {
    private static final String ACCESS_DESCRITPION = "A file menu like the others";
    private static final String NAME = "File";
    private static final String IMPORT_ITEM_NAME = "Import";
    private static final String IMPORT_ITEM_STATUS = "Importing...";
    private static final String DELETE_ITEM_NAME = "Delete";
    private static final String DELETE_ITEM_STATUS = "Deleting...";
    private static final String QUIT_ITEM_NAME = "Quit";
    private static final String QUIT_ITEM_STATUS = "Exiting...";

    private Listener mListener;
    private JMenuItem mImportItem;
    private JMenuItem mDeleteItem;
    private JMenuItem mQuitItem;

    FileMenu() {
        super(NAME);
        mImportItem = new JMenuItem(IMPORT_ITEM_NAME);
        mDeleteItem = new JMenuItem(DELETE_ITEM_NAME);
        mQuitItem = new JMenuItem(QUIT_ITEM_NAME);

        getAccessibleContext().setAccessibleDescription(ACCESS_DESCRITPION);
        add(mImportItem);
        add(mDeleteItem);
        add(mQuitItem);

        mImportItem.addActionListener(actionEvent -> mListener.onImportRequested(IMPORT_ITEM_STATUS));
        mDeleteItem.addActionListener(actionEvent -> mListener.onDeleteRequested(DELETE_ITEM_STATUS));
        mQuitItem.addActionListener(actionEvent -> mListener.onQuitRequested(QUIT_ITEM_STATUS));
    }

    public void setListener(Listener listener) {
        mListener = listener;
    }

    public interface Listener {
        void onImportRequested(String label);
        void onDeleteRequested(String label);
        void onQuitRequested(String label);
    }
}
