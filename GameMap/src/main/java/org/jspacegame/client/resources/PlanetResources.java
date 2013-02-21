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
}
