package com.android.settings;

import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceScreen;
import android.provider.Settings;
import com.android.internal.logging.MetricsLogger;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.android.settings.R;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import com.android.internal.logging.MetricsLogger;
import com.android.settings.AccessiblePreferenceCategory;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.Utils;
import com.android.settings.users.UserDialogs;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WakeLocksSettings extends SettingsPreferenceFragment {
    private ListView mainListView;
    private ArrayAdapter<String> listAdapter;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
//    private GoogleApiClient client;

    @Override
    protected int getMetricsCategory() {
        return InstrumentedFragment.WAKELOCKS;
    }

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

	addPreferencesFromResource(R.xml.wakelocks_settings);

/*
        setContentView(R.layout.wakelocks_activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mainListView = (ListView) findViewById(R.id.listView);
        listAdapter = new ArrayAdapter<String>(this, R.layout.wakelocks_simplerow);
*/
/*
        final Button button_forceClose = (Button) findViewById(R.id.button_forceClose);
        button_forceClose.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "FORCE CLOSED! :D", Toast.LENGTH_SHORT).show();

                /*
                ActivityManager am = (ActivityManager) getSystemService(
                        Context.ACTIVITY_SERVICE);

                try {

                   Method method =  ActivityManager.class.getMethod("forceStopPackage");
                    method.invoke("com.android.music");

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                */
/*            }
        });
*/
/*
        try {

            Process processPower = Runtime.getRuntime().exec("dumpsys power SPA");

            BufferedReader bufferedReaderPower = new BufferedReader(new InputStreamReader(processPower.getInputStream()));

            for (String line = bufferedReaderPower.readLine(); line != null; line = bufferedReaderPower.readLine()) {
                listAdapter.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        mainListView.setAdapter(listAdapter);
        mainListView.setClickable(true);
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
//                Object o = mainListView.getItemAtPosition(position);
                Log.v("TEST", "Row button clicked at position: " + position);
            }
        });
*/
/*
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
*/
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
/*    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }
*/
    @Override
    public void onStart() {
        super.onStart();
/*
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
*/
    }

    @Override
    public void onStop() {
        super.onStop();
/*
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
*/
    }
}
