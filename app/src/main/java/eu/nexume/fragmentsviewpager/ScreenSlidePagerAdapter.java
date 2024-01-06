package eu.nexume.fragmentsviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

// A simple ViewPager adapter class for paging through fragments
public class ScreenSlidePagerAdapter extends FragmentStateAdapter {
    /**
     * Create a new {@link ScreenSlidePagerAdapter} object.
     */
    public ScreenSlidePagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 3;

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new FragmentOne();
        } else if (position == 1) {
            return new FragmentTwo();
        } else {
            return new FragmentThree();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }

}
