package sen.tec.dk.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    Button button_Result;
    EditText editText_Num1;
    EditText editText_Num2;
    TextView textView_Result;
    Double result;

    RadioGroup radioGroup_Mode;
    String mode;

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

        radioGroup_Mode = (RadioGroup)findViewById(R.id.radioGroup_Mode);
        radioGroup_Mode.check(R.id.rButton_Plus);
    }

    public String getMode()
    {
        switch(radioGroup_Mode.getCheckedRadioButtonId())
        {
            case R.id.rButton_Plus:
               return mode = "plus";

            case R.id.rButton_Minus:
               return mode = "minus";

            case R.id.rButton_Mult:
               return mode = "mult";

            case R.id.rButton_Divide:
               return mode = "divide";
        }
        return mode = null;
    }
}
