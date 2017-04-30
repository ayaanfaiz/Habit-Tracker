package com.example.ayaan.habittracker.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.ayaan.habittracker.data.HabitContract.HabitEntry;

import static android.R.attr.version;

/**
 * Created by AYAAN on 4/30/2017.
 */

public class HabitDbHelper extends SQLiteOpenHelper {
    private String INTEGER_TYPE = "INTEGER";
    private String AUTO_INCREMENT = "AUTOINCREMENT";
    private String PRIMARY_KEY = "PRIMARY KEY";
    private String TEXT_TYPE = "TEXT";
    private String NOT_NULL = "NOT NULL";
    private String DEFAULT_0 = "DEFAULT 0";
    private static final String DATABASE_NAME = "habit.db";
    private static final int DATABASE_VERSION = 1;
    public HabitDbHelper(Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE "+HabitEntry.TABLE_NAME+"( "
                +HabitEntry._ID + INTEGER_TYPE + PRIMARY_KEY + AUTO_INCREMENT + ","
                + HabitEntry.COLUMN_HABIT + TEXT_TYPE + NOT_NULL + ","
                + HabitEntry.COLUMN_DESCRIPTION + TEXT_TYPE + ","
                + HabitEntry.COLUMN_START + INTEGER_TYPE + ","
                + HabitEntry.COLUMN_END + INTEGER_TYPE + ","
                + HabitEntry.COLUMN_DONE + INTEGER_TYPE + DEFAULT_0;
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
