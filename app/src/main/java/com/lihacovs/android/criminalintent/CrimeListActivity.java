package com.lihacovs.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Konstantins on 10/31/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
