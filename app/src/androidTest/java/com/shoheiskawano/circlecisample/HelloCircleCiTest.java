package com.shoheiskawano.circlecisample;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class HelloCircleCiTest extends ActivityInstrumentationTestCase2<MainActivity> {

    TextView mTextView;

    public HelloCircleCiTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mTextView = (TextView) getActivity().findViewById(R.id.activity_main_text_hello);
    }

    public void testHelloCircleCiString() {
        assertEquals(mTextView.getText().toString(), getActivity().getResources().getString(R.string.hello_circle_ci));
    }
}