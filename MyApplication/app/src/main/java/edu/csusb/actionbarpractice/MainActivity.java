package edu.csusb.actionbarpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** This code will display the actionbar on the screen **/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the actionBar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /** This code will perform when items on the menu are selected **/
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.add:
                //add the function to perform here
                textView = (TextView)findViewById(R.id.tv_text);
                textView.setText("Add clicked");
                return(true);
            case R.id.reset:
                //add the function to perform here
                textView = (TextView)findViewById(R.id.tv_text);
                textView.setText("Reset Clicked");
                return(true);
            case R.id.exit:
                Toast.makeText(this, "Exit Clicked", Toast.LENGTH_LONG).show();
                finish();
                return(true);

        }
            return (super.onOptionsItemSelected(item));
    }


}
