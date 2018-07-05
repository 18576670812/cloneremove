/*
 * Class Description: this object is used to descripte one call. include following information:
 * call number; the user name, call state, start and end time, and talk duration.
 * */

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
