package dz.cristalbox.slidenerd1.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import dz.cristalbox.slidenerd1.util.MySqliteOpenHelper;

/**
 * Created by cristalbox on 8/24/2016.
 */
public class PersonDao {
    SQLiteDatabase db;

    public PersonDao(Context context) {
        MySqliteOpenHelper mySqliteOpenHelper = new MySqliteOpenHelper(context);
        db=mySqliteOpenHelper.getWritableDatabase();
    }

    public long insertPerson()
    {

        ContentValues contentValues = new ContentValues();
        contentValues.put(MySqliteOpenHelper.COLUMN_TITLE,"title1");
        contentValues.put(MySqliteOpenHelper.COLUMN_DESCRIPTION,"desc1");

        long id=db.insert(MySqliteOpenHelper.TABLE_PERSON,null,contentValues);
        return id;
    }



}
