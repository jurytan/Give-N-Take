package com.nguyeningcode.jnguyen7410.give_n_take;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by jnguyen on 3/14/16.
 */
public class RecordProvider  extends ContentProvider{

    //Database related constants
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "data";
    public static final String DATABASE_TABLE = "transaction";

    public static final String COLUMN_ID = "transaction_id";
    public static final String COLUMN_FROM = "from";
    public static final String COLUMN_TO = "to";
    public static final String COLUMN_ITEM = "item";
    public static final String COLUMN_QTY = "qty";
    public static final String COLUMN_FAVORITE = "favorite";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_BORROWED = "borrowed";
    public static final String COLUMN_WILL_RETURN = "will_return";
    public static final String COLUMN_CATEGORY = "category";
    public static final String COLUMN_COLOR = "color";

    public static final String DATABASE_CREATE = "CREATE TABLE IF NOT EXISTS" + DATABASE_TABLE +
            "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN_FROM + " TEXT, "+ COLUMN_TO + " TEXT, " + COLUMN_ITEM + " TEXT, " + COLUMN_QTY + " INTEGER, " +
            COLUMN_FAVORITE + " TEXT NOT NULL CHECK (typeof(\"" + COLUMN_FAVORITE +  "\") = \"text\" AND \"" + COLUMN_FAVORITE + "\" IN (\"TRUE\", \"FALSE\")), " +
            COLUMN_DESCRIPTION + " TEXT, " + COLUMN_BORROWED + " INTEGER, " + COLUMN_WILL_RETURN + " INTEGER, " +
            COLUMN_CATEGORY + " INTEGER, " + COLUMN_COLOR + " TEXT";

    private SQLiteDatabase mDB;

    @Override
    public boolean onCreate() {
        Log.i("NewRecordActivity", "[onCreate] Creating the database...");
        mDB = new DatabaseHelper(getContext()).getWritableDatabase();
        return true;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
