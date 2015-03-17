package com.example.calendar_gundong;

import org.joda.time.LocalDate;

import android.app.Activity;
import android.os.Bundle;

import com.example.calendar_gundong.manager.CalendarManager;

public class MainActivity extends Activity {

	private CollapseCalendarView mCalendarView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		CalendarManager manager = new CalendarManager(LocalDate.now(),
				CalendarManager.State.MONTH, LocalDate.now(), LocalDate.now()
						.plusYears(1));

		mCalendarView = (CollapseCalendarView) findViewById(R.id.calendar);
		mCalendarView.init(manager);
	}

}
