package com.ggmatej.beerfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;




public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> list = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();

        for(String x : list){
            brandsFormatted.append(x).append('\n');
        }
        brands.setText(brandsFormatted);
    }

        //Call when the user clicks the button}
}
