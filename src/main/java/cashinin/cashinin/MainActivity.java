package cashinin.cashinin;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.String.format;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void calculateButtonPressed(View view){
        EditText onesFieldText = (EditText)findViewById(R.id.editTextOnes);
        String onesFieldString = onesFieldText.getText().toString();
        int onesFieldInteger = Integer.parseInt(onesFieldString);
        EditText fivesFieldText = (EditText)findViewById(R.id.editTextFives);
        String fivesFieldString = fivesFieldText.getText().toString();
        int fivesFieldInteger = Integer.parseInt(fivesFieldString);
        TextView labelText = (TextView)findViewById(R.id.printOutLabel);
        labelText.setText(format("%d",fivesFieldInteger*5+onesFieldInteger));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
