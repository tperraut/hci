package helper;

import java.awt.*;

public final class Helper {
    public static Dimension scaleDimension(Dimension dim, double ratio) {
        return new Dimension((int) (dim.width * ratio), (int) (dim.height * ratio));
    }

    public static Dimension scale2Dimension(Dimension dim, double wRatio, double hRatio) {
        return new Dimension((int) (dim.width * wRatio), (int) (dim.height * hRatio));
    }

    public static boolean compareDim(Dimension preferredSize, Dimension maxSize) {
        return preferredSize.width > maxSize.width || preferredSize.height > maxSize.height;
    }
}
