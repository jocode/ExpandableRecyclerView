package com.crexative.expandablerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();


        ArrayList<Product> googleProducts = new ArrayList<>();
        googleProducts.add(new Product("Google AdSense"));
        googleProducts.add(new Product("Google Drive"));
        googleProducts.add(new Product("Google Mail"));
        googleProducts.add(new Product("Google Alo"));
        googleProducts.add(new Product("Google Glass"));
        googleProducts.add(new Product("Google Docs"));
        googleProducts.add(new Product("Google Presentations"));

        Company google = new Company("Google", googleProducts);
        companies.add(google);

        ArrayList<Product> microsoftProducts = new ArrayList<>();
        microsoftProducts.add(new Product("Azure"));
        microsoftProducts.add(new Product("Skype"));
        microsoftProducts.add(new Product("Windows"));
        microsoftProducts.add(new Product("Office"));
        microsoftProducts.add(new Product("HoloLens"));
        microsoftProducts.add(new Product("OneDrive"));

        Company microsoft = new Company("Microsoft", microsoftProducts);
        companies.add(microsoft);

        ProductAdapter adapter = new ProductAdapter(companies);
        recyclerView.setAdapter(adapter);
    }
}
