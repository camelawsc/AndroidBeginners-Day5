package camelawong.day5;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        textView = (TextView) findViewById(R.id.text);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String s = "";
                switch (checkedId) {
                    case 1:
                        s = " first ";
                        break;
                    case 2:
                        s = " second ";
                        break;
                    case 3:
                        s = " third ";
                        break;
                    case 4:
                        s = " fourth ";
                        break;
                }
                textView.setText(getResources().getString(R.string.text) + s + getResources().getString(R.string.text2));
            }
        });

    }
}
