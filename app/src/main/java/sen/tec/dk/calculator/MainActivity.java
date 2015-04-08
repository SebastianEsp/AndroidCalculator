package sen.tec.dk.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    Button button_Result;
    EditText editText_Num1;
    EditText editText_Num2;
    TextView textView_Result;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result_Handler result_Handler = new Result_Handler(this);
        button_Result = (Button)findViewById(R.id.button_Result);
        button_Result.setOnClickListener(result_Handler);
        editText_Num1 = (EditText)findViewById(R.id.editTest_Num1);
        editText_Num2 = (EditText)findViewById(R.id.editText_Num2);
        textView_Result = (TextView)findViewById(R.id.textView_Result);
    }
}
