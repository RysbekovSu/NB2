package com.example.myapplication.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.myapplication.models.Student;
import com.example.myapplication.room.StudentDao;
@Database(entities = {Student.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract StudentDao studentDao();
}