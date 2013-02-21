package org.jspacegame.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.resources.client.ImageResource;
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
        PlanetResources planetResources = PlanetResources.resources;

        final SpacePanel spacePanel = new SpacePanel();
        spacePanel.add(createPlanet(planetResources.planetDeathStar(), "50%", "50%"));
        spacePanel.add(createPlanet(planetResources.planetBlack(), "75%", "25%"));
        spacePanel.add(createPlanet(planetResources.planetEris(), "50%", "10%"));
        spacePanel.add(createPlanet(planetResources.planetEarth(), "80%", "80%"));
        spacePanel.add(createPlanet(planetResources.planetClavius(), "10%", "40%"));
        spacePanel.add(createPlanet(planetResources.planetRed(), "35%", "90%"));

        RootPanel.get().add(spacePanel);
    }

    private Planet createPlanet(ImageResource imageResource, String top, String left) {
        Planet planet = new Planet(imageResource);
        planet.setTop(top);
        planet.setLeft(left);
        return planet;
    }
}
