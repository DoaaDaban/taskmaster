package com.example.taskmaster;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Task.class}, version = 1)
public  abstract  class AppDatabase extends RoomDatabase {

    public abstract TaskDao taskDao();

    private static AppDatabase appDatabase; // declaration for the instance

    public AppDatabase() { // constructor implementation
    }

    public static synchronized AppDatabase getInstance(Context context){ // method returns the instance // take a context from any activity (this activity, activity u are in)

        if(appDatabase == null){
            appDatabase = Room.databaseBuilder(context,
                    AppDatabase.class, "AppDatabase").allowMainThreadQueries().build();
        }

        return appDatabase;

    }
}
