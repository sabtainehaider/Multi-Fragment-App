import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    TextView tvName, tvEmail;

    public ProfileFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        tvName = view.findViewById(R.id.tvName);
        tvEmail = view.findViewById(R.id.tvEmail);

        SharedPreferences sharedPreferences =
                getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        String name = sharedPreferences.getString("username", "No Name Saved");
        String email = sharedPreferences.getString("email", "No Email Saved");

        tvName.setText("Name: " + name);
        tvEmail.setText("Email: " + email);

        return view;
    }
}
