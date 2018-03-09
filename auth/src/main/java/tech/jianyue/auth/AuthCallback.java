package tech.jianyue.auth;

public abstract class AuthCallback {
    private int mWith;
    private int mAction;

    void setWith(@Auth.WithThird int with, int action) {
        mWith = with;
        mAction = action;
    }

    public final int getWith() {
        return mWith;
    }

    public final int getAction() {
        return mAction;
    }

    /**
     * build 开始之前调用, onStart 之后可调用 getWith \ getAction 函数
     */
    public void onStart() {

    }

    public void onSuccessForLogin(UserInfoForThird info) {

    }

    public void onSuccessForPay(String result) {

    }

    public void onSuccessForShare() {

    }

    public void onCancel() {

    }

    public void onFailed(String msg) {

    }
}