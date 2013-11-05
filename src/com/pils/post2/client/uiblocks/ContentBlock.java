package com.pils.post2.client.uiblocks;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.pils.post2.client.conversation.dto.Entity;
import com.pils.post2.client.layout.Resources;
import com.pils.post2.client.layout.UiBlock;

import java.util.List;

public class ContentBlock extends UiBlock {
	private FlowPanel mainPanel = GWT.create(FlowPanel.class);

	public ContentBlock() {
		ScrollPanel scrollPanel = new ScrollPanel(mainPanel);
		scrollPanel.addStyleName(Resources.INSTANCE.css().block());
		initWidget(scrollPanel);
	}

	public void setEntries(List<Entity> entities) {
		mainPanel.clear();
		if (entities != null)
			for (Entity entity : entities)
				mainPanel.add(new EntryBlock(entity));
	}
}
