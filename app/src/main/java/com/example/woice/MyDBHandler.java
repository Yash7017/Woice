package com.example.woice;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="register.db";
    private static final String TABLE_NAME="registeruser";

    private static final String COLOMN_1="ID";
    private static final String COLOMN_2="username";
    private static final String COLOMN_3="age";
    private static final String COLOMN_4="gender";

    public MyDBHandler(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE registeruser(ID INTEGER PRIMARY KEY AUTOINCREMENT,username TEXT,age TEXT,gender TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
    public long adduser(String user,String age) {
        SQLiteDatabase sdb=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("username",user);
        values.put("age",age);

        long res=sdb.insert("registeruser",null,values);
        sdb.close();
        return res;

    }

}
