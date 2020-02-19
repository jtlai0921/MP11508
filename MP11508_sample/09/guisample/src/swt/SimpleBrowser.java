package swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class SimpleBrowser {

	private Text urlText;
	private Button goButton;
	private Browser browser;
	


	public void createWidget(Composite parent) {

		Composite content = new Composite(parent, SWT.NONE);
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		content.setLayout(gridLayout);
		
		Label labelAddress = new Label(content, SWT.NONE);
		labelAddress.setText("URL");

		urlText = new Text(content, SWT.BORDER);
		{
			GridData gridData = new GridData();
			gridData.grabExcessHorizontalSpace = true;
			gridData.horizontalAlignment = GridData.FILL;
			urlText.setLayoutData(gridData);
		}
		
		goButton = new Button(content, SWT.NONE);
		goButton.setText("GO");
		
		browser = new Browser(content, SWT.BORDER);
		{
			GridData gridData = new GridData();
			gridData.horizontalAlignment = GridData.FILL;
			gridData.verticalAlignment = GridData.FILL;
			gridData.horizontalSpan = 3;
			gridData.grabExcessHorizontalSpace = true;
			gridData.grabExcessVerticalSpace = true;
			browser.setLayoutData(gridData);
		}
		

		goButton.addSelectionListener(new SelectionListener(){

			public void widgetSelected(SelectionEvent e) {
				browser.setUrl(urlText.getText());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}
	
	

	
	public static void main(String[] args) {
		
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("hello");

		shell.setLayout(new FillLayout());
		SimpleBrowser app = new SimpleBrowser();
		app.createWidget(shell);


		shell.open();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}