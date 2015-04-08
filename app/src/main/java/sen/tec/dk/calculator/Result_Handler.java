package sen.tec.dk.calculator;

import android.view.View;

public class Result_Handler implements View.OnClickListener
{
    Double num1;
    Double num2;
    MainActivity mainActivity;

    public Result_Handler(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        num1 = Double.valueOf(String.valueOf(mainActivity.editText_Num1.getText()));
        num2 = Double.valueOf(String.valueOf(mainActivity.editText_Num2.getText()));
        mainActivity.result = num1 + num2;
        mainActivity.textView_Result.setText(num1 + " + " + num2 + " = " + mainActivity.result);

        mainActivity.editText_Num1.setText("");
        mainActivity.editText_Num2.setText("");
    }
}
