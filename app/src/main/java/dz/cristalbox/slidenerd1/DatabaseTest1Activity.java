package dz.cristalbox.slidenerd1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import dz.cristalbox.slidenerd1.dao.PersonDao;
import dz.cristalbox.slidenerd1.util.MySqliteOpenHelper;

public class DatabaseTest1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_test1);

    }

    //---------------------------------------------------------onInsertPerson
    public void onInsertPerson(View view) {
        PersonDao personDao = new PersonDao(this);
        long id = personDao.insertPerson();

        if (id > 0) {
            Toast.makeText(this,"insert Ok id:" + id,Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,"insert Failed id is one:" + id ,Toast.LENGTH_LONG).show();

        }
    }

}
