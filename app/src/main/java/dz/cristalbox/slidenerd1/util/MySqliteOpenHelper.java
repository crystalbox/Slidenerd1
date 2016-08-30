package dz.cristalbox.slidenerd1.util;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by cristalbox on 8/24/2016.
 */
public class MySqliteOpenHelper extends SQLiteOpenHelper {
    Context context;
    static final String DATABASE_NAME = "crystalbox";
    static final int DATABASE_VERSION = 1;

    public static final String TABLE_PERSON = "tbl_person";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_DESCRIPTION = "description";

    static final String CREATE_TABLE_PERSON = "CREATE TABLE " + TABLE_PERSON + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_TITLE + " VARCHAR(255)," + COLUMN_DESCRIPTION + " VARCHAR(255)); ";
    static final String DELETE_TABLE_PERSON ="DROP TABLE IF EXIST "+TABLE_PERSON+"; ";

    public MySqliteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE_PERSON);
        } catch (SQLException e) {
            Toast.makeText(this.context, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
try {
    db.execSQL(DELETE_TABLE_PERSON);
    onCreate(db);
}catch (SQLException e){

    Toast.makeText(this.context, e.getMessage(), Toast.LENGTH_LONG).show();
}
    }
}
