package br.com.local.cafeteria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    listFragment listFragment = new listFragment();
    MuffinFragment muffinFragment = new MuffinFragment();
    TeaFragment teaFragment = new TeaFragment();
    DonutsFragment donutsFragment = new DonutsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.idBottonNavView);

        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.idContainer,listFragment).
                commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.coffee:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, listFragment).
                                commit();
                        return true;
                    case R.id.muffin:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, muffinFragment).
                                commit();
                        return true;
                    case R.id.tea:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, teaFragment).
                                commit();
                        return true;

                    case R.id.donuts:
                        getSupportFragmentManager().
                                beginTransaction().
                                replace(R.id.idContainer, donutsFragment).
                                commit();
                        return true;
                }

                return false;
            }
        });
    }
}