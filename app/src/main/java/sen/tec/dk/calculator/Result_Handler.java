package sen.tec.dk.calculator;

import android.view.View;

public class Result_Handler implements View.OnClickListener
{
    String mode;
    Double num1;
    Double num2;
    MainActivity mainActivity;

    public Result_Handler(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {

        mode = mainActivity.getMode();

        num1 = Double.valueOf(String.valueOf(mainActivity.editText_Num1.getText()));
        num2 = Double.valueOf(String.valueOf(mainActivity.editText_Num2.getText()));

        if (mode == "plus")
        {
            add();
        }
        else if (mode == "minus")
        {
            sub();
        }
        else if (mode == "mult")
        {
            mult();
        }
        else if (mode == "divide")
        {
            div();
        }

        mainActivity.editText_Num1.setText("");
        mainActivity.editText_Num2.setText("");
    }

    public void add()
    {
        mainActivity.result = num1 + num2;
        mainActivity.textView_Result.setText(num1 + " + " + num2 + " = " + mainActivity.result);
    }

    public void sub()
    {
        mainActivity.result = num1 - num2;
        mainActivity.textView_Result.setText(num1 + " - " + num2 + " = " + mainActivity.result);
    }

    public void mult()
    {
        mainActivity.result = num1 * num2;
        mainActivity.textView_Result.setText(num1 + " * " + num2 + " = " + mainActivity.result);
    }

    public void div()
    {
        mainActivity.result = num1 / num2;
        mainActivity.textView_Result.setText(num1 + " / " + num2 + " = " + mainActivity.result);
    }
}
