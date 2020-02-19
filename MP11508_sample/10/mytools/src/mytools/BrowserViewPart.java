package mytools;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class BrowserViewPart extends ViewPart {

	private Browser browser;
	private Text addressText;
	private Button button;

	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayout(new GridLayout(2, false));

		addressText = new Text(composite, SWT.BORDER);
		addressText.setLayoutData(new GridData(
				GridData.FILL_HORIZONTAL));

		button = new Button(composite, SWT.NULL);
		button.setText("GO");

		button.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				String url = addressText.getText();
				browser.setUrl(url);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		browser = new Browser(composite, SWT.BORDER);
		browser.setLayoutData(new GridData(GridData.FILL,
				GridData.FILL, true, true, 2, 1));
	}

	public void setFocus() {
	}

	public void setUrl(String url) {
		addressText.setText(url);
		browser.setUrl(url);
	}

}
