package cc.blynk.server.core.model.widgets.outputs.graph;

import cc.blynk.server.core.model.enums.GraphPeriod;
import cc.blynk.server.core.model.enums.PinType;
import cc.blynk.server.core.model.widgets.Widget;
import cc.blynk.server.core.model.widgets.outputs.TextAlignment;

import static cc.blynk.utils.ArrayUtil.EMPTY_DATA_STREAMS;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 12.08.15.
 */
public class EnhancedHistoryGraph extends Widget {

    public GraphDataStream[] dataStreams = EMPTY_DATA_STREAMS;

    public GraphPeriod period;

    public TextAlignment textAlignment;

    public FontSize fontSize;

    public Stacking stacking;

    public boolean showTitle;

    public boolean showLegend;

    public boolean yAxisValues;

    public boolean allowFullScreen;

    public int flip;

    public String low;

    public String high;

    public String goalText;

    public GoalLine goalLine;

    @Override
    public boolean updateIfSame(int deviceId, byte pin, PinType type, String value) {
        return false;
    }

    @Override
    public void updateIfSame(Widget widget) {

    }

    @Override
    public boolean isSame(int deviceId, byte pin, PinType type) {
        return false;
    }

    @Override
    public String getJsonValue() {
        return null;
    }

    @Override
    public String getModeType() {
        return null;
    }

    @Override
    public String getValue(byte pin, PinType type) {
        return null;
    }

    @Override
    public void append(StringBuilder sb, int deviceId) {

    }

    @Override
    public int getPrice() {
        return 900;
    }
}
