package myrcp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {

		layout.addView("mytools.BrowserViewPart", IPageLayout.BOTTOM, 0.2f,
				layout.getEditorArea());

	}
}
