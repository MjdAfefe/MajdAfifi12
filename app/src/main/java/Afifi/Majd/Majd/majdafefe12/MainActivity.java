package Afifi.Majd.Majd.majdafefe12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.options_munu, menu);
        return true;
    }
    @Override
    public boolean onOptionsltemSelected(Menultem item)
{
if (item.getltemld()==R.id.mnSettings)
{
  }
if ((item.getltemld()==R.id.mnLogout)
    {
}
return true;