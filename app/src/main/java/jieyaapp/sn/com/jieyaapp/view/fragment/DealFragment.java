package jieyaapp.sn.com.jieyaapp.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import jieyaapp.sn.com.jieyaapp.R;

/**
 * Created by John on 2018/1/18.
 */
public class DealFragment extends Fragment{
    private Button dButton;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.deal_fragment,container,false);
        dButton=(Button) view.findViewById(R.id.dealbutton1);
        return view;
    }
}
