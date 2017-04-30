package com.example.ayaan.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by AYAAN on 4/30/2017.
 */

public final class HabitContract {
    public static final class HabitEntry implements BaseColumns {
        public static final String TABLE_NAME = "habit";
        public static final String _ID = "_id";
        public static final String COLUMN_HABIT = "habit";
        public static final String COLUMN_DESCRIPTION = "discription";
        public static final String COLUMN_START = "start";
        public static final String COLUMN_END = "end";
        public static final String COLUMN_DONE = "done";

        public static final int done_yes = 1;
        public static final int done_no = 0;
    }
}
