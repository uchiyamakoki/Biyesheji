package jieyaapp.sn.com.jieyaapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by John on 2018/1/15.
 */
public class FirstFragment extends Fragment {
    private String context;
    private TextView mTextView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.first_fragment,container,false);
        mTextView =(TextView)view.findViewById(R.id.txt_content);
        return view;
    }
}
