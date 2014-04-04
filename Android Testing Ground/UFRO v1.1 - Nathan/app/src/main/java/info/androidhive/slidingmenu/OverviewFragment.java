package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OverviewFragment extends Fragment {
	
	public OverviewFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        View rootView = inflater.inflate(R.layout.fragment_overview, container, false);
         
        return rootView;
    }
}
