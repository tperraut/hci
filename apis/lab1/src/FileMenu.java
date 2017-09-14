import javax.swing.*;

public class FileMenu extends JMenu {
    private final String ACCESS_DESCRITPION = "A file menu like the others";
    private static final String NAME = "File";
    private final String IMPORT_ITEM_NAME = "Import";
    private final String DELETE_ITEM_NAME = "Delete";
    private final String QUIT_ITEM_NAME = "Quit";

    private JMenuItem mImportItem;
    private JMenuItem mDeleteItem;
    private JMenuItem mQuitItem;

    public FileMenu() {
        super(NAME);
        mImportItem = new JMenuItem(IMPORT_ITEM_NAME);
        mDeleteItem = new JMenuItem(DELETE_ITEM_NAME);
        mQuitItem = new JMenuItem(QUIT_ITEM_NAME);

        setName(NAME);
        getAccessibleContext().setAccessibleDescription(ACCESS_DESCRITPION);
        add(mImportItem);
        add(mDeleteItem);
        add(mQuitItem);
    }
}
