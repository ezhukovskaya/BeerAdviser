package com.hfad.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import framework.constants.Paths;
import framework.utils.PropertiesRead;

public class MainActivity extends Activity {
    private static final Logger LOG = Logger.getLogger(MainActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PropertyConfigurator.configure(PropertiesRead.readFromFrameworkConfig("logfile", Paths.FRAMEWORK_PROPERTY));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        LOG.info("Gets component TextView");
        TextView brands = findViewById(R.id.brands);
        LOG.info("Gets spinner");
        Spinner color = findViewById(R.id.color);
        LOG.info("Gets beer type from Spinner");
        String beerType = color.getSelectedItem().toString();
        LOG.info("Sets beer type to the TextView field");
        brands.setText(BeerExpert.getBrands(beerType));
    }
}