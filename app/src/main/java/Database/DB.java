package Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DB extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "myUserDatabase.db";
    public static final String TABLE_NAME = "userDB";
    public static final String USERID_COLUMN = "user_id";
    public static final String NAME_COLUMN = "user_name";
    public static final String PASSWORD_COLUMN = "password";
    public static final String AGE_COLUMN = "age";

    public DB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, 5);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE userDB (user_id varchar(25) primary key, user_name varchar(25), password varchar(25), age integer(2))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        db.execSQL("DROP TABLE IF EXISTS userDB");
        onCreate(db);
    }
}
