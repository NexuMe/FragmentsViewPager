
package eu.nexume.fragmentsviewpager;

import android.content.Context;
import androidx.core.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link StudentsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Students} objects.
 */
public class StudentsAdapter extends ArrayAdapter<Students> {

    /**
     * Resource ID for the background color for this list of sites
     */
    private int mColorResourceId;

    /**
     * Create a new {@link StudentsAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param students        is the list of {@link Students}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of sites
     */
    public StudentsAdapter(Context context, ArrayList<Students> students, int colorResourceId) {
        super(context, 0, students);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Students} object located at this position in the list
        Students currentSite = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        // Get the name from the currentSite object and set this text on
        // the Name TextView.
        nameTextView.setText(currentSite.getStudentName());

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView numberTextView = listItemView.findViewById(R.id.number_text_view);
        // Get the address from the currentSite object and set this text on
        // the Address TextView.
        numberTextView.setText(currentSite.getStudentNumber());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}