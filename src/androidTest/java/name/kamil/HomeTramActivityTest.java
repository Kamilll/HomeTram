package name.kamil;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class name.kamil.HomeTramActivityTest \
 * name.kamil.tests/android.test.InstrumentationTestRunner
 */
public class HomeTramActivityTest extends ActivityInstrumentationTestCase2<HomeTramActivity> {

    public HomeTramActivityTest() {
        super("name.kamil", HomeTramActivity.class);
    }

}
