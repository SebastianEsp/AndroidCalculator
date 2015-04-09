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
    RadioButton rButton_Plus;
    RadioButton rButton_Minus;
    RadioButton rButton_Mult;
    RadioButton rButton_Divide;
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

        rButton_Plus = (RadioButton)findViewById(R.id.rButton_Plus);
        rButton_Minus = (RadioButton)findViewById(R.id.rButton_Minus);
        rButton_Mult = (RadioButton)findViewById(R.id.rButton_Mult);
        rButton_Divide = (RadioButton)findViewById(R.id.rButton_Divide);
    }

    public String getMode()
    {
        if (rButton_Plus.isChecked())
        {
            return mode = "plus";
        }
        else if (rButton_Minus.isChecked())
        {
            return mode = "minus";
        }
        else if (rButton_Mult.isChecked())
        {
            return mode = "mult";
        }
        else if (rButton_Divide.isChecked())
        {
            return  mode = "divide";
        }
        return mode = null;
    }
}
