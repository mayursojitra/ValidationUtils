package murait.validation;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private final static Pattern emailPattern = Pattern.compile(Constants.emailPattern);

    /**
     * Method to check if email is valid or not
     *
     * @param email The Email which is to be checked for is valid or not
     * @return true if the email is valid, false otherwise
     */
    public static boolean validateEmail(String email) {
        email = email.trim();

        // If email is empty
        if (TextUtils.isEmpty(email)) {
            return false;
        }

        Matcher mMatcher = emailPattern.matcher(email);

        return mMatcher.matches();
    }

    /**
     * Method to check if email is valid or not
     *
     * @param mContext    The context to use.  Usually your {@link android.app.Application}
     *                    or {@link android.app.Activity} object.
     * @param email       The Email which is to be checked for is valid or not
     * @param toastLength How long to display the message
     * @return true if the email is valid, false otherwise
     */
    public static boolean validateEmail(Context mContext, String email, int toastLength) {
        email = email.trim();

        // If email is empty
        if (TextUtils.isEmpty(email)) {
            return false;
        }

        Matcher mMatcher = emailPattern.matcher(email);

        if (!mMatcher.matches()) {
            Toast.makeText(mContext, "Please enter valid email!!!", toastLength).show();
        }

        return mMatcher.matches();
    }

    /**
     * Method to check if email is valid or not
     *
     * @param mContext    The context to use.  Usually your {@link android.app.Application}
     *                    or {@link android.app.Activity} object.
     * @param email       The Email which is to be checked for is valid or not
     * @param toastLength How long to display the message
     * @param toastMsg    The text to show.  Can be formatted text.
     * @return true if the email is valid, false otherwise
     */
    public static boolean validateEmail(Context mContext, String email, int toastLength, CharSequence toastMsg) {
        email = email.trim();

        // If email is empty
        if (TextUtils.isEmpty(email)) {
            return false;
        }

        Matcher mMatcher = emailPattern.matcher(email);

        if (!mMatcher.matches()) {
            Toast.makeText(mContext, toastMsg, toastLength).show();
        }

        return mMatcher.matches();
    }

    /**
     * Method to check if edittext is empty or not
     *
     * @param etText The EditText which is to be checked for is empty or not
     * @return true if the edittext is empty, false otherwise
     */
    public static boolean isEmptyEditText(EditText etText) {

        //If edittext is NULL
        if (etText == null)
            return true;
        return etText.getText().toString().trim().isEmpty();
    }

    /**
     * Method to check if Spinner is empty or not
     *
     * @param mSpinner The mSpinner which is empty or not
     * @return true if the mSpinner is empty, false otherwise
     */
    public static boolean isEmptySpinner(Spinner mSpinner) {

        //If edittext is NULL
        if (mSpinner == null) {
            return true;
        }

        Adapter mAdapter = mSpinner.getAdapter();

        if (mAdapter == null)
            return true;
        else return mAdapter.getCount() <= 0;
    }

    /**
     * Method to check if email is valid or not
     *
     * @param phone The Phone Number which is to be checked for is valid or not
     * @return true if the phone number is valid, false otherwise
     */
    public static boolean validatePhoneNumber(String phone) {
        phone = phone.trim();

        // If phone is empty
        if (TextUtils.isEmpty(phone)) {
            return false;
        }

        for (String phoneRegx : Constants.phonePatterns) {
            if (Pattern.compile(phoneRegx).matcher(phone).matches())
                return true;
        }

        return false;
    }

    /**
     * Method to check if email is valid or not
     *
     * @param mContext    The context to use.  Usually your {@link android.app.Application}
     *                    or {@link android.app.Activity} object.
     * @param phone       The Phone which is to be checked for is valid or not
     * @param toastLength How long to display the message
     * @return true if the email is valid, false otherwise
     */
    public static boolean validatePhoneNumber(Context mContext, String phone, int toastLength) {
        phone = phone.trim();

        // If phone is empty
        if (TextUtils.isEmpty(phone)) {
            return false;
        }

        for (String phoneRegx : Constants.phonePatterns) {
            if (Pattern.compile(phoneRegx).matcher(phone).matches())
                return true;
        }

        Toast.makeText(mContext, "Please enter valid phone!!!", toastLength).show();

        return false;
    }

    /**
     * Method to check if email is valid or not
     *
     * @param mContext    The context to use.  Usually your {@link android.app.Application}
     *                    or {@link android.app.Activity} object.
     * @param phone       The Phone which is to be checked for is valid or not
     * @param toastLength How long to display the message
     * @param toastMsg    The text to show.  Can be formatted text.
     * @return true if the email is valid, false otherwise
     */
    public static boolean validatePhoneNumber(Context mContext, String phone, int toastLength, CharSequence toastMsg) {
        phone = phone.trim();

        // If phone is empty
        if (TextUtils.isEmpty(phone)) {
            return false;
        }

        for (String phoneRegx : Constants.phonePatterns) {
            if (Pattern.compile(phoneRegx).matcher(phone).matches())
                return true;
        }

        Toast.makeText(mContext, toastLength, toastLength).show();

        return false;
    }

}
