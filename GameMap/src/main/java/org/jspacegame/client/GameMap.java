package org.jspacegame.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GameMap implements EntryPoint {

  public void onModuleLoad() {
    final Label label = new Label();
		label.setText("Hello world!");

    RootPanel.get().add(label);
  }
}
