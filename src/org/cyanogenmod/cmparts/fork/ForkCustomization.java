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

import com.android.internal.logging.MetricsProto.MetricsEvent;

import cyanogenmod.preference.CMSecureSettingSwitchPreference;
import cyanogenmod.providers.CMSettings;
import org.cyanogenmod.cmparts.R;
import org.cyanogenmod.cmparts.SettingsPreferenceFragment;

public class ForkCustomization extends SettingsPreferenceFragment {
    private static final String TAG = "ForkCustomization";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.fork_customization);
    }
}
