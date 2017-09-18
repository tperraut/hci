import javax.swing.*;
import java.awt.event.ItemEvent;

class Toolbar extends JToolBar{
    private static final String FAMILY_CAT_NAME = "Family";
    private static final String FAMILY_CAT_STATUS_SELECTED = "Showing Family Category...";
    private static final String FAMILY_CAT_STATUS_DESELECTED = "Hiding Family Category...";
    private static final String VACATION_CAT_NAME = "Vacation";
    private static final String VACATION_CAT_STATUS_SELECTED = "Showing Vacation Category...";
    private static final String VACATION_CAT_STATUS_DESELECTED = "Hiding Vacation Category...";
    private static final String SCHOOL_CAT_NAME = "School";
    private static final String SCHOOL_CAT_STATUS_SELECTED = "Showing School Category...";
    private static final String SCHOOL_CAT_STATUS_DESELECTED = "Hiding School Category...";

    private Listener mListener;
    private JToggleButton mFamilyCategory;
    private JToggleButton mVacationCategory;
    private JToggleButton mSchoolCategory;

    public Toolbar(Listener listener) {
        super();
        mListener = listener;
        mFamilyCategory = new JToggleButton(FAMILY_CAT_NAME);
        mVacationCategory = new JToggleButton(VACATION_CAT_NAME);
        mSchoolCategory = new JToggleButton(SCHOOL_CAT_NAME);

        add(mFamilyCategory);
        add(mVacationCategory);
        add(mSchoolCategory);

        mFamilyCategory.addItemListener(itemEvent -> {
            if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                mListener.onFamilyCatRequested(FAMILY_CAT_STATUS_SELECTED, true);
            } else if (itemEvent.getStateChange() == ItemEvent.DESELECTED) {
                mListener.onFamilyCatRequested(FAMILY_CAT_STATUS_DESELECTED, false);
            }
        });
        mVacationCategory.addItemListener(itemEvent -> {
            if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                mListener.onVacationCatRequested(VACATION_CAT_STATUS_SELECTED, true);
            } else if (itemEvent.getStateChange() == ItemEvent.DESELECTED) {
                mListener.onVacationCatRequested(VACATION_CAT_STATUS_DESELECTED, false);
            }
        });
        mSchoolCategory.addItemListener(itemEvent -> {
            if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                mListener.onSchoolCatRequested(SCHOOL_CAT_STATUS_SELECTED, true);
            } else if (itemEvent.getStateChange() == ItemEvent.DESELECTED) {
                mListener.onSchoolCatRequested(SCHOOL_CAT_STATUS_DESELECTED, false);
            }
        });
    }

    public void setListener(Listener listener) {
        mListener = listener;
    }

    public interface Listener {
        void onFamilyCatRequested(String label, boolean selected);
        void onVacationCatRequested(String label, boolean selected);
        void onSchoolCatRequested(String label, boolean selected);
    }
}
