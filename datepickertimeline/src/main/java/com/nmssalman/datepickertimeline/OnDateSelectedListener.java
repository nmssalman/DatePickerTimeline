package com.nmssalman.datepickertimeline;

public interface OnDateSelectedListener {
    void onDateSelected(int year, int month, int day, int dayOfWeek);

    void onDisabledDateSelected(int year, int month, int day, int dayOfWeek, boolean isDisabled);
}
