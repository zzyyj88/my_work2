package com.example.honey.mywork.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.honey.mytry.R;

public class EmotionFragment extends android.support.v4.app.Fragment {

    private Button but;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //ac_fargment_a为fragment当前布局
        View view=inflater.inflate(R.layout.activity_emotion_fragment,null);
//        // 绑定该LinearLayout的ID
//        but=(Button) view.findViewById(R.id.Ocean);
//        // 设置监听
//        but.setOnClickListener(new View.OnClickListener() {
//            @Override public void onClick(View view) {
//                Intent intent = new Intent();
//                //SoilsenerActivity.class为想要跳转的Activity
//                intent.setClass(getActivity(), BriefIntroduction.class); //比内量表的地方
//                startActivity(intent);
//            }
//        });
        return view;
    }


}
