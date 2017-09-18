import javax.swing.*;

class ViewMenu extends JMenu {
    private static final String ACCESS_DESCRITPION = "A view style menu chooser";
    private static final String NAME = "View";
    private static final String PHOTO_ITEM_NAME = "Photo viewer (default)";
    private static final String PHOTO_ITEM_STATUS = "Changing to Photo view...";
    private static final String BROWSER_ITEM_NAME = "Browser";
    private static final String BROWSER_ITEM_STATUS = "Changing to Browser view...";
    private static final String SPLIT_ITEM_NAME = "Split mode";
    private static final String SPLIT_ITEM_STATUS = "Changing to Split view...";

    private ButtonGroup mButtonGroup;
    private JRadioButtonMenuItem mPhotoItem;
    private JRadioButtonMenuItem mBrowserItem;
    private JRadioButtonMenuItem mSplitItem;
    private Listener mListener;

    public ViewMenu() {
        super(NAME);
        mButtonGroup = new ButtonGroup();
        mPhotoItem = new JRadioButtonMenuItem(PHOTO_ITEM_NAME);
        mBrowserItem = new JRadioButtonMenuItem(BROWSER_ITEM_NAME);
        mSplitItem = new JRadioButtonMenuItem(SPLIT_ITEM_NAME);

        mButtonGroup.add(mPhotoItem);
        mButtonGroup.add(mBrowserItem);
        mButtonGroup.add(mSplitItem);

        getAccessibleContext().setAccessibleDescription(ACCESS_DESCRITPION);
        add(mPhotoItem);
        add(mBrowserItem);
        add(mSplitItem);

        mPhotoItem.setSelected(true);
        mPhotoItem.addActionListener(actionEvent -> mListener.onPhotoRequested(PHOTO_ITEM_STATUS));
        mBrowserItem.addActionListener(actionEvent -> mListener.onBrowserRequested(BROWSER_ITEM_STATUS));
        mSplitItem.addActionListener(actionEvent -> mListener.onSplitRequested(SPLIT_ITEM_STATUS));
    }

    public void setListener(Listener listener) {
        mListener = listener;
    }

    public interface Listener {
        void onPhotoRequested(String label);
        void onBrowserRequested(String label);
        void onSplitRequested(String label);
    }
}
