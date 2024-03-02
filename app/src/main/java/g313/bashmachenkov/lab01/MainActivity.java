package g313.bashmachenkov.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ta;
    EditText tb;
    TextView tr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.number1);
        tb = findViewById(R.id.number2);
        tr = findViewById(R.id.result);
    }

    public void but_add_click(View v)
    {
        try
        {
                tr.setText(String.valueOf(Float.parseFloat(ta.getText().toString()) + Float.parseFloat(tb.getText().toString())));
        }
        catch (Exception e) {tr.setText("Плохие числа");}
    }

    public void but_div_click(View v)
    {
        try{
            tr.setText(String.valueOf(Float.parseFloat(ta.getText().toString()) - Float.parseFloat(tb.getText().toString())));
        }
        catch (Exception e) {tr.setText("Плохие числа");}
    }

    public void but_mul_click(View v)
    {
        try{
            tr.setText(String.valueOf(Float.parseFloat(ta.getText().toString())* Float.parseFloat(tb.getText().toString())));
        }
        catch (Exception e) {tr.setText("Плохие числа");}
    }

    public void but_sub_click(View v)
    {
        try{
            if ( Float.parseFloat(tb.getText().toString()) != 0)
            {
                tr.setText(String.valueOf(Float.parseFloat(ta.getText().toString()) / Float.parseFloat(tb.getText().toString())));
            }
            else
            {
                tr.setText("Плохие числа");
            }
        }
        catch (Exception e) {tr.setText("Плохие числа");}
    }

    public void but_sin_click(View v)
    {
        try
        {
            tr.setText(String.valueOf(Math.sin(Float.parseFloat(ta.getText().toString()))));
        }
        catch (Exception e) {tr.setText("Плохие числа");}
    }

    public void but_cos_click(View v)
    {
        try
        {
            tr.setText(String.valueOf(Math.cos(Float.parseFloat(ta.getText().toString()))));
        }
        catch (Exception e) {tr.setText("Плохие числа");}
    }
    public void but_tan_click(View v)
    {
        try
        {
            if ( Float.parseFloat(ta.getText().toString()) < Math.toRadians(Math.PI/2) && Float.parseFloat(ta.getText().toString()) > Math.toRadians(Math.PI/-2))
            {
                tr.setText(String.valueOf(Math.tan(Math.toRadians(Float.parseFloat(ta.getText().toString())))));
            }
            else
            {
                tr.setText("Плохие числа");
            }
        }
        catch (Exception e) {tr.setText("Плохие числа");}
    }
    public void but_pow_click(View v)
    {
        try
        {
            tr.setText(String.valueOf(Math.pow(Double.parseDouble(ta.getText().toString()),Double.parseDouble(tb.getText().toString()))));
        }
        catch (Exception e) {tr.setText("Плохие числа");}
    }

    public void but_sqrt_click(View v)
    {
        try
        {
            if ( Float.parseFloat(tb.getText().toString()) >  0)
            {
                tr.setText(String.valueOf(Math.sqrt(Double.parseDouble(ta.getText().toString()))));
            }
            else
            {
                tr.setText("Плохие числа");
            }
        }
        catch (Exception e) {tr.setText("Плохие числа");}
    }
}