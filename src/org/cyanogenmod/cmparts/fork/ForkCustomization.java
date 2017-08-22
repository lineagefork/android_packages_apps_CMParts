package org.cyanogenmod.cmparts.fork;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.provider.Settings;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import org.cyanogenmod.cmparts.widget.SeekBarPreference;

import com.android.internal.logging.MetricsProto.MetricsEvent;

import cyanogenmod.preference.CMSecureSettingSwitchPreference;
import cyanogenmod.preference.SecureSettingSwitchPreference;
import cyanogenmod.providers.CMSettings;
import org.cyanogenmod.cmparts.R;
import org.cyanogenmod.cmparts.SettingsPreferenceFragment;

public class ForkCustomization extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.fork_customization);

        mScreenshotDelay = (SeekBarPreference) findPreference(SCREENSHOT_DELAY);
        int screenshotDelay = Settings.System.getInt(resolver,
                Settings.System.SCREENSHOT_DELAY, 1000);
        mScreenshotDelay.setValue(screenshotDelay / 1);
        mScreenshotDelay.setOnPreferenceChangeListener(this);
    }


    public boolean onPreferenceChange(Preference preference, Object objValue) {
        if (preference == mScreenshotDelay) {
            int screenshotDelay = (Integer) objValue;
            Settings.System.putInt(getActivity().getContentResolver(),
                    Settings.System.SCREENSHOT_DELAY, screenshotDelay * 1);
            return true;
        }
        return false;
    }
}
