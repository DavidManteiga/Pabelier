package com.example.dm2.pabelier;

import android.content.res.Resources;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class Main2Activity extends AppCompatActivity {
    private Resources res;
    private TabHost mitab;
    TabHost.TabSpec perfil,limpieza,recoge,eventos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        res=getResources();
        mitab = (TabHost)findViewById(R.id.mitab);
        mitab.setup();

        TabHost.TabSpec perfil=mitab.newTabSpec("Perfil");
        perfil.setContent(R.id.perfil);
        perfil.setIndicator("Perfil", ContextCompat.getDrawable(this, android.R.drawable.ic_btn_speak_now));
        mitab.addTab(perfil);

        TabHost.TabSpec limpieza=mitab.newTabSpec("Limpieza");
        limpieza.setContent(R.id.perfil);
        limpieza.setIndicator("Limpieza", ContextCompat.getDrawable(this, android.R.drawable.ic_btn_speak_now));
        mitab.addTab(limpieza);

        TabHost.TabSpec recoge=mitab.newTabSpec("Recoge");
        recoge.setContent(R.id.perfil);
        recoge.setIndicator("Recoge", ContextCompat.getDrawable(this, android.R.drawable.ic_btn_speak_now));
        mitab.addTab(recoge);

        TabHost.TabSpec eventos=mitab.newTabSpec("Eventos");
        eventos.setContent(R.id.perfil);
        eventos.setIndicator("Eventos", ContextCompat.getDrawable(this, android.R.drawable.ic_btn_speak_now));
        mitab.addTab(eventos);


        mitab.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Log.i("AndroidTabsDemo", "Pulsada pestaña: " + tabId);


                if (tabId.equals("Perfil")) {


                }
                if (tabId.equals("Limpieza")) {


                }
                if (tabId.equals("Recoge")) {



                }
                if (tabId.equals("Eventos")) {



                }


            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
