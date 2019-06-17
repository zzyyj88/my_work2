package com.example.honey.mywork;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.honey.mytry.R;

public class Classification extends FragmentActivity {

    private Fragment mFragments[];
    private RadioGroup radioGroup;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private RadioButton rbtHome,rbtFunc,rbtSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_classification);
        mFragments = new Fragment[3];
        fragmentManager = getSupportFragmentManager();
        mFragments[0] = fragmentManager.findFragmentById(R.id.fragment_ability);
        mFragments[1] = fragmentManager.findFragmentById(R.id.fragment_personality);
        mFragments[2] = fragmentManager.findFragmentById(R.id.fragment_attitude);

        fragmentTransaction = fragmentManager.beginTransaction().hide(mFragments[0]).hide(mFragments[1]).hide(mFragments[2]);
        fragmentTransaction.show(mFragments[0]).commit();

        radioGroup = (RadioGroup)findViewById(R.id.bottomGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.i("radioGroup", "checkId=" + checkedId);
                fragmentTransaction = fragmentManager.beginTransaction().hide(mFragments[0]).hide(mFragments[1]).hide(mFragments[2]);

                switch(checkedId){
                    case R.id.ability:
                        fragmentTransaction.show(mFragments[0]).commit();
                        break;
                    case R.id.character:
                        fragmentTransaction.show(mFragments[1]).commit();
                        break;
                    case R.id.emotion:
                        fragmentTransaction.show(mFragments[2]).commit();
                        break;
                    default:
                        break;
                }
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.frame,menu);
//        return true;


//

}
