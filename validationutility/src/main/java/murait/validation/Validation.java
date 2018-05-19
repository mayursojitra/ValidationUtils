package murait.validation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
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
    public static boolean validateEmail(@NonNull Context mContext, @NonNull String email, @NonNull int toastLength) {
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
    public static boolean validateEmail(@NonNull Context mContext, @NonNull String email, @NonNull int toastLength, @NonNull CharSequence toastMsg) {
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
}
