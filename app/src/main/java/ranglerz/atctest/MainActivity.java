package ranglerz.atctest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView actv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);

        String[] countries = getResources().getStringArray(R.array.chose_a_city);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,countries);
        actv.setAdapter(adapter);
    }
}
