package net.manicmachine.csather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class UserDBHelper extends SQLiteOpenHelper {

    private final static String TAG = "UserDBHelper";
    private final static Class CONTRACT = UserContractEntry.class;

    public UserDBHelper(Context context) {
        super(context, DBContract.DB_NAME, null, DBContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try {

            String createTableSql = DBHelper.buildCreateSQL(CONTRACT);
            db.execSQL(createTableSql);

        } catch (IllegalAccessException | NoSuchFieldException ex) {
            Log.d(TAG, "Error: Failed to create the User's database.", ex.fillInStackTrace());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + MobileDeviceContractEntry.TABLE);
        this.onCreate(db);
    }
}