import android.text.TextUtils;
import android.util.Log;

Public Class Call {
    public static final String TAG = "Call";

    String mNumber;
    String mDisplayName;
    int mCallState;
    long mStartTime;
    long mEndTime;
    long mTimes;
    
    public Call () {
        mNumber = "";
        mDisplayName = "";
        mCallState = -1;
    }
    
    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        if(!TextUtils.isEmpty(number)) {
	    mNumber = number;
	} else {
            Log.i(TAG, "number is null or number is empty, do nothing!");
	}
    }

    public String getDisplayName() {
        return mDisplayName;
    }

    public void setDisplayName(String name) {
        if(!TextUtils.isEmpty(name)) {
            mDisplayName = name;
	} else {
            Log.i(TAG, "name is null or name is empty, do nothing!");
	}
    }
    
    public int getCallState() {
        return mCallState;
    }
    
    public long getTimes() {
        return mTimes;
    }
}
