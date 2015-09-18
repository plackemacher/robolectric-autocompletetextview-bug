package com.plackemacher.autocompletetextviewbug;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

@RunWith(RobolectricGradleTestRunner.class)
@Config(
        sdk = 21,
        constants = BuildConfig.class
)
public class MainActivityTest {

    private ActivityController<MainActivity> mActivityController;
    private MainActivity mActivity;

    @Before
    public void setUp() throws Exception {
        mActivityController = Robolectric.buildActivity(MainActivity.class);
        mActivity = mActivityController.setup().get();
    }

    @Test
    public void testDismissDropDown() throws Exception {
        mActivity.mAutoCompleteTextView.dismissDropDown();
    }

    @After
    public void tearDown() throws Exception {
        mActivityController.pause().stop().destroy();
    }
}