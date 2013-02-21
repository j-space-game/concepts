package org.jspacegame.client.widgets;

import com.google.gwt.dom.client.Style;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Planet widget
 * <p/>
 * User: yevgen.kravchenko
 * Date: 21/02/13
 */
public class Planet extends SimplePanel {

    public Planet(ImageResource imageResource) {
        Image image = new Image(imageResource);
        add(image);

        setPixelSize(image.getWidth(), image.getHeight());
        getElement().getStyle().setPosition(Style.Position.ABSOLUTE);
    }

    public void setTop(String positionTop) {
        getElement().getStyle().setProperty("top", positionTop);
    }

    public void setLeft(String positionLeft) {
        getElement().getStyle().setProperty("left", positionLeft);
    }
}
