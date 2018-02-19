package com.cidm4385.troyr.criminalintent;


import android.support.v4.app.Fragment;


/**
 * Created by troyr on 2/19/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }
}
