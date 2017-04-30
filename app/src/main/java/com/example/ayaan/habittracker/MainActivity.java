package com.example.ayaan.habittracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ayaan.habittracker.data.HabitContract;
import com.example.ayaan.habittracker.data.HabitDbHelper;
import com.example.ayaan.habittracker.data.HabitContract.HabitEntry;
public class MainActivity extends AppCompatActivity {
    private HabitDbHelper mDbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void insertHabit()
    {
        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        db =mDbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(HabitEntry.COLUMN_HABIT,"Jogging");
        values.put(HabitEntry.COLUMN_DESCRIPTION,"A round of 4 miles");
        values.put(HabitEntry.COLUMN_START,5);
        values.put(HabitEntry.COLUMN_END,6);
        values.put(HabitEntry.COLUMN_DONE,1);
    }
    private Cursor readHabit() {
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        String[] projection = {
                HabitEntry._ID,
                HabitEntry.COLUMN_HABIT,
                HabitEntry.COLUMN_DESCRIPTION,
                HabitEntry.COLUMN_START,
                HabitEntry.COLUMN_END,
                HabitEntry.COLUMN_DONE
        };
        Cursor cursor = db.query(HabitEntry.TABLE_NAME, projection, null, null, null, null, null);
        return cursor;
    }
}
