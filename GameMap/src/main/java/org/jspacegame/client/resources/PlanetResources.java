package org.jspacegame.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

/**
 * Resource bundle to hold planet specific resources
 * <p/>
 * User: yevgen.kravchenko
 * Date: 21/02/13
 */
public interface PlanetResources extends ClientBundle {

    public static final PlanetResources resources = GWT.create(PlanetResources.class);

    @Source("org/jspacegame/images/death_star.png")
    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.None)
    ImageResource planetDeathStar();

    @Source("org/jspacegame/images/black_planet.png")
    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.None)
    ImageResource planetBlack();

    @Source("org/jspacegame/images/eris.png")
    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.None)
    ImageResource planetEris();

    @Source("org/jspacegame/images/earth.png")
    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.None)
    ImageResource planetEarth();

    @Source("org/jspacegame/images/clavius.png")
    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.None)
    ImageResource planetClavius();

    @Source("org/jspacegame/images/red.png")
    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.None)
    ImageResource planetRed();
}
