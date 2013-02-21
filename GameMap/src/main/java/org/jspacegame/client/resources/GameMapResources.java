package org.jspacegame.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

/**
 * Resource bundle to be used across GameMap project
 * <p/>
 * User: yevgen.kravchenko
 * Date: 21/02/13
 */
public interface GameMapResources extends ClientBundle {

    public static final GameMapResources resources = GWT.create(GameMapResources.class);

    @Source("org/jspacegame/images/space.png")
    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Both)
    ImageResource space();

    @Source("org/jspacegame/style/map.css")
    MapStyle mapStyle();
}
