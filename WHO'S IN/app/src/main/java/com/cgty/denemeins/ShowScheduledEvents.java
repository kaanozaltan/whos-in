package com.cgty.denemeins;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class ShowScheduledEvents extends Activity {
    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );

        setContentView( R.layout.show_scheduled_events );
    }
}
