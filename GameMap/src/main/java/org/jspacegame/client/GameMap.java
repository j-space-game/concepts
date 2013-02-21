package org.jspacegame.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import org.jspacegame.client.resources.GameMapResources;
import org.jspacegame.client.resources.PlanetResources;
import org.jspacegame.client.widgets.Planet;
import org.jspacegame.client.widgets.SpacePanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GameMap implements EntryPoint {

    static {
        GameMapResources.resources.mapStyle().ensureInjected();
    }

    public void onModuleLoad() {
        Planet planet1 = new Planet(PlanetResources.resources.planetDeathStar());
        planet1.setTop("50%");
        planet1.setLeft("50%");

        final SpacePanel spacePanel = new SpacePanel();
        spacePanel.add(planet1);

        RootPanel.get().add(spacePanel);
    }
}
