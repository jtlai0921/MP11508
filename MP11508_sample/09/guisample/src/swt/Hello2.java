
package swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class Hello2 {

    public static void main(String[] args) {
        
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("hello");

        shell.setLayout(new RowLayout());

		Text text = new Text(shell, SWT.BORDER);        
        Button button = new Button(shell, SWT.NULL);
        button.setText("GO");        

        shell.open();
        
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }
}
