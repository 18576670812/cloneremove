Public Class Call {
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
    
    public int getCallState() {
        return mCallState;
    }
    
    public long getTimes() {
        return mTimes;
    }
}
