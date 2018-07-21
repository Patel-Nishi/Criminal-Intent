package com.bignerdranch.android.criminalintent;

public class CriminalListActivity extends SingleFragmentActivity{
    @Override
    protected CrimeListFragment createFragment() {
        return new CrimeListFragment();
    }

}
