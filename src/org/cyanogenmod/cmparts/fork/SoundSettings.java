package org.cyanogenmod.cmparts.fork;

import android.os.Bundle;
import cyanogenmod.preference.CMSecureSettingSwitchPreference;
import cyanogenmod.providers.CMSettings;
import org.cyanogenmod.cmparts.R;
import org.cyanogenmod.cmparts.SettingsPreferenceFragment;

public class SoundSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.fork_sound);
    }
}
