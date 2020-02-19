package swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class Hello3 {

    private Text text;
    private Button button;
    
    
    public void createWidget(Composite parent){
        Composite composite = new Composite(parent, SWT.NULL);
        composite.setLayout(new RowLayout(SWT.VERTICAL));
        text = new Text(composite, SWT.BORDER);        
        button = new Button(composite, SWT.NULL);
        button.setText("GO");        
    }
    
    public static void main(String[] args) {
        
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("hello");

        shell.setLayout(new FillLayout());
        Hello3 hello = new Hello3();
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
