package com.shoheiskawano.circleciandroidsample;

import com.shoheiskawano.circlecisample.MainActivity;
import com.shoheiskawano.circlecisample.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.TextView;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
@MediumTest
public class HelloCircleCiTest2 extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mActivity;
    TextView mTextView;

    public HelloCircleCiTest2() {
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        mActivity = getActivity();
        mTextView = (TextView) mActivity.findViewById(R.id.activity_main_text_hello);
    }

    @Test
    public void testHelloCircleCiString() {
        assertThat(mTextView.getText().toString(), is(getActivity().getResources().getString(R.string.hello_circle_ci)));
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}