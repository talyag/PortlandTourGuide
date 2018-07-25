package com.example.android.portlandtourguide;

import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        // Locate toolbar resource
        Toolbar toolbar = findViewById(R.id.toolbar);
        // Set the toolbar to be the action bar
        setSupportActionBar(toolbar);
        // Retrieve an instance of the action bar
        ActionBar actionbar = getSupportActionBar();
        // Enable home button
        actionbar.setDisplayHomeAsUpEnabled(true);
        // Set menu icon as home button indicator
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        // At launch, replace content frame with home fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame, new HomeFragment())
                .commit();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // Select item method called
                        selectDrawerItem(menuItem);

                        return true;
                    }
                });

    }

    @Override
    // Listen for click on ID home
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // If clicked, open drawer
            case android.R.id.home:
                // Gravity compat is a drawer open animation
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);

    }

    public void selectDrawerItem(MenuItem menuItem) {
        // Create a new fragment and specify the fragment to show based on nav item clicked
        // Method from codepath tutorial
        Fragment fragment = null;
        Class fragmentClass;
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                fragmentClass = HomeFragment.class;
                break;
            case R.id.nav_art:
                fragmentClass = ArtFragment.class;
                break;
            case R.id.nav_parks:
                fragmentClass = ParksFragment.class;
                break;
            case R.id.nav_food:
                fragmentClass = FoodFragment.class;
                break;
            case R.id.nav_shop:
                fragmentClass = ShopFragment.class;
                break;
            default:
                fragmentClass = HomeFragment.class;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame, fragment)
                .commit();

        // set item as selected to persist highlight
        menuItem.setChecked(true);
        // close drawer when item is tapped
        mDrawerLayout.closeDrawers();

    }

}
