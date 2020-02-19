package foo.bar;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //[1]���oButton01������
		Button button = (Button) findViewById(R.id.button1);

		//[2]�]�w��ť��
		button.setOnClickListener(new MyOnClickListener());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
	class MyOnClickListener implements OnClickListener {

		public void onClick(View v) {
			String[] words = { "�j�N", "�N", "�N", "��", "�j��" };
			String word = words[new Random().nextInt(words.length)];

			TextView textView = (TextView) findViewById(R.id.textView2);
			textView.setText("�ثe�B��" + word);
		}

	}
}
