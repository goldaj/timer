package com.quiquicheandco.sportwithmimi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.quiquicheandco.sportwithmimi.adapter.MainPagerAdapter;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.TextChange;
import org.androidannotations.annotations.ViewById;

import java.util.TimerTask;

@EActivity(R.layout.activity_main)
public class MainActivity extends FragmentActivity { //TODO: FragmentActivity or AppCompatActivity ?
    @ViewById(R.id.timer_seance_label)
    protected TextView timerActiveSeanceLabel;

    @ViewById(R.id.timer_hour_value)
    protected EditText timerActiveHourValue;

    @ViewById(R.id.timer_min_value)
    protected EditText timerActiveMinuteValue;

    @ViewById(R.id.timer_seconds_value)
    protected EditText timerActiveSecondValue;

    @ViewById(R.id.main_viewpager)
    protected ViewPager mainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @AfterViews
    protected void init() {
        mainViewPager.setAdapter(new MainPagerAdapter(this));
    }

    //TODO: not quite what I want -> Do it better
    private boolean timerStarted;
    @Click(R.id.timer_start)
    public void onStartTimerClicked(View view) {
        //setting timer
        TimerTask timer = new TimerTask() {
            @Override
            public void run() {
                try {
                    int time = (Integer.getInteger(timerActiveHourValue.getText().toString()) * 60 * 60 * 1000)
                             + (Integer.getInteger(timerActiveMinuteValue.getText().toString()) * 60 * 1000)
                             + (Integer.getInteger(timerActiveSecondValue.getText().toString()) * 60 * 1000);
                    Thread.sleep(time);
                } catch (InterruptedException | NullPointerException e) {
                    e.printStackTrace();
                }
            }
        };

        if(!timerStarted) {
            timerStarted = !timerStarted;
            ((Button)view).setText("PAUSE");
            timer.run();
        } else {
            timerStarted = !timerStarted;
            ((Button)view).setText("START");
            timer.cancel();
        }
    }

    @Click(R.id.timer_reset)
    public void onActiveTimerResetClicked(View view) { //TODO: reset to default value, not to 0.
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

