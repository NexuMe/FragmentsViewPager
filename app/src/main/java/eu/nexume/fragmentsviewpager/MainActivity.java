package eu.nexume.fragmentsviewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZoomOutPageTransformer zoomOutPageTransformer = new ZoomOutPageTransformer();

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager2 viewPager2 = findViewById(R.id.pager);

        // display a different animation from the default screen slide animation
        viewPager2.setPageTransformer(zoomOutPageTransformer);

        // Create an adapter that knows which fragment should be shown on each page
        ScreenSlidePagerAdapter adapter = new ScreenSlidePagerAdapter(this);

        // Set the adapter onto the view pager
        viewPager2.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        // Connect the tab layout with the view pager.
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> {
                    if (position == 0) {
                        tab.setText(getString(R.string.specialty_informatics));
                    } else if (position == 1) {
                        tab.setText(getString(R.string.specialty_it));
                    } else {
                        tab.setText(getString(R.string.specialty_multimedia));
                    }
                }).attach();
    }
}
