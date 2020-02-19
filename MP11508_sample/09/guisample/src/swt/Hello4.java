package swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class Hello4 {

	private Text text;
	private Button button;
	private Label label ;
	
	
	public void createWidget(Composite parent){
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayout(new RowLayout());
		text = new Text(composite, SWT.BORDER);		
		button = new Button(composite, SWT.NULL);
		label = new Label(composite, SWT.NULL);
		label.setLayoutData(new RowData(100, -1));
		
		button.addSelectionListener(new SelectionListener(){

			public void widgetSelected(SelectionEvent e) {	
				label.setText(text.getText());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		button.setText("GO");		
	}
	
	public static void main(String[] args) {
		
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("hello");

		shell.setLayout(new FillLayout());
		Hello4 hello = new Hello4();
		hello.createWidget(shell);


		shell.open();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}