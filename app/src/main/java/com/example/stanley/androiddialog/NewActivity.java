package com.example.stanley.androiddialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NewActivity extends ActionBarActivity

{

    boolean mIsLargeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mIsLargeLayout = getResources().getBoolean(R.bool.large_layout);
        setContentView(R.layout.activity_new);
        if (savedInstanceState == null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            DialogFragment newFragment = MyDialogFragment.newInstance();
            ft.add(R.id.container, newFragment);
            ft.commit();
        }
    }


    public static class MyDialogFragment extends DialogFragment {

        static DialogFragment newInstance()
        {
            return new MyDialogFragment();
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState)
        {
            View rootView = inflater.inflate(R.layout.fragment_new, container, false);
            return rootView;
        }
    }

//    public void _showDialog() {
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        DialogFragment newFragment = new MyDialogFragment();
//
//        if (mIsLargeLayout) {
//
//            newFragment.show(fragmentManager, "dialog");
//        } else {
//
//            FragmentTransaction transaction = fragmentManager.beginTransaction();
//            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//            transaction.add(android.R.id.content, newFragment)
//                  .addToBackStack(null).commit();
//        }
//    }


//            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//            DialogFragment newFragment = MyDialogFragment.newInstance();
//            try {
//                newFragment.show(ft,"dialog");
//            }
//           catch (Exception e)
//            {
//               e.printStackTrace();
//            }

}


//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_new, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    /**
//     * A placeholder fragment containing a simple view.
//     */
//    public static class PlaceholderFragment extends Fragment {
//
//        public PlaceholderFragment() {
//        }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                                 Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_new, container, false);
//            return rootView;
//        }
//    }
//}
