package org.jspacegame.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import org.jspacegame.client.resources.GameMapResources;
import org.jspacegame.client.widgets.SpacePanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GameMap implements EntryPoint {

    static {
        GameMapResources.resources.mapStyle().ensureInjected();
    }

    public void onModuleLoad() {
        final SpacePanel spacePanel = new SpacePanel();
        RootPanel.get().add(spacePanel);
    }
}
