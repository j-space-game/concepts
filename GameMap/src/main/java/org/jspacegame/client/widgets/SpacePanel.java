package org.jspacegame.client.widgets;

import com.google.gwt.user.client.ui.SimplePanel;
import org.jspacegame.client.resources.GameMapResources;

/**
 * Basic panel that should hold other planets
 * <p/>
 * User: yevgen.kravchenko
 * Date: 20/02/13
 */
public class SpacePanel extends SimplePanel {

    public SpacePanel() {
        super();
        setWidth("100%");
        setHeight("100%");
        setStyleName(GameMapResources.resources.mapStyle().space());
    }
}
