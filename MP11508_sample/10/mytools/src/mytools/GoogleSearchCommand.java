package mytools;

import java.net.URLEncoder;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class GoogleSearchCommand extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		try {
			//���o������r��
			ISelection selection = HandlerUtil.getCurrentSelection(event);
			String text = ((ITextSelection) selection).getText();

			
			//�إ�Google�ϥΪ�URL
			String url = "http://www.google.co.jp/search?hl=ja&q="
					+ URLEncoder.encode(text, "UTF-8");

			//���oBrowserViewPart�éI�ssetURL()
			BrowserViewPart viewPart = (BrowserViewPart) PlatformUI
					.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage().showView("mytools.BrowserViewPart");
			viewPart.setUrl(url);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
