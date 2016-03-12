package com.nguyeningcode.jnguyen7410.give_n_take;

import android.app.ListActivity;
import android.app.LoaderManager;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;

/**
 * Created by jnguyen7410 on 3/11/2016.
 */
public class HistoryListView extends ListActivity implements  LoaderManager.LoaderCallbacks<Cursor>{


    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}
