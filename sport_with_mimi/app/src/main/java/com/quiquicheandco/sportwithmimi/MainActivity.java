package com.quiquicheandco.sportwithmimi;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.TextChange;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewById(R.id.timer_seance_label)
    protected TextView timerActiveSeanceLabel;

    @ViewById(R.id.timer_hour_value)
    protected EditText timerActiveHourValue;

    @ViewById(R.id.timer_min_value)
    protected EditText timerActiveMinuteValue;

    @ViewById(R.id.timer_seconds_value)
    protected EditText timerActiveSecondValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @AfterViews
    protected void init() {
        timerActiveSeanceLabel.setText("generated_name");
        timerActiveHourValue.setText("00");
        timerActiveMinuteValue.setText("00");
        timerActiveSecondValue.setText("00");
    }

    @Click(R.id.timer_reset)
    public void onActiveTimerResetClicked() { //TODO: reset to default value, not to 0.
        timerActiveHourValue.setText("00");
        timerActiveMinuteValue.setText("00");
        timerActiveSecondValue.setText("00");
    }

    @TextChange(R.id.timer_hour_value)
    public void onActiveTimerHourValueChanged(CharSequence s, int start, int before, int count) {
        if(s != null && timerActiveHourValue != null && timerActiveHourValue.getText() != null) {
            timerActiveHourValue.getText().replace(timerActiveHourValue.getSelectionStart(),timerActiveHourValue.getSelectionStart(), ""+s.charAt(s.length() - 1));
        }
            //timerActiveHourValue.getText().replace(timerActiveHourValue.getSelectionStart(), timerActiveHourValue.getSelectionStart() + 1, s);
    }
}

