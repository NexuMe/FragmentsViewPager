package eu.nexume.fragmentsviewpager;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.students_list, container, false);

        // Create a list of students
        final ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Иван Иванов", "112233"));
        students.add(new Students("Георги Георгиев", "992244"));
        students.add(new Students("Стефан Стефанов", "882255"));
        StudentsAdapter adapter = new StudentsAdapter(getActivity(), students, R.color.specialty_informatics);

        final ListView listView = rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootview;
    }
}
