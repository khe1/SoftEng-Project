package com.example.physicssolver2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public void pendulumClick(View view) {
        if (view.getId() == R.id.pendulum) {
            Toast.makeText(getApplication(), "test this shit", Toast.LENGTH_LONG).show();
        }
    }

}
