package com.quiquicheandco.sportwithmimi;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.quiquicheandco.sportwithmimi.R;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

@EViewGroup(R.layout.timer_widget)
public class TimerWidget extends LinearLayout {

    @ViewById(R.id.timer_seance_label)
    protected TextView activeSeanceLabel;

    @ViewById(R.id.timer_hour_value)
    protected TextView activeHourValue;

    @ViewById(R.id.timer_hour_label)
    protected TextView hourLabel;

    @ViewById(R.id.timer_min_value)
    protected TextView activeMinuteValue;

    @ViewById(R.id.timer_min_label)
    protected TextView minutesLabel;

    @ViewById(R.id.timer_seconds_value)
    protected TextView activeSecondValue;

    @ViewById(R.id.timer_seconds_label)
    protected TextView secondsLabel;

    @ViewById(R.id.timer_start)
    protected Button timerStartButton;

    @ViewById(R.id.timer_modify)
    protected Button timerModifyButton;

    @ViewById(R.id.timer_reset)
    protected Button timerResetButton;

    public TimerWidget(Context context) {
        this(context, null, 0);
    }

    public TimerWidget(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TimerWidget(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
