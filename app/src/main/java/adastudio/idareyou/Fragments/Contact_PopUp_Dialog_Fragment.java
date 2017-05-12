package adastudio.idareyou.Fragments;


import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import adastudio.idareyou.R;


public class Contact_PopUp_Dialog_Fragment extends DialogFragment {

//    public static Contact_PopUp_Fragment newInstance(Activity activity) {
//        Contact_PopUp_Fragment contactPopFragment = new Contact_PopUp_Fragment();
//        return contactPopFragment;
//    }

    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact_popup, container, false);
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getDialog().getWindow().setBackgroundDrawableResource(R.drawable.contact_picture_shape);
        return v;
    }

}
