package eu.darken.capod.common.debug.autoreport

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import eu.darken.capod.common.preferences.createFlowPreference
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DebugSettings @Inject constructor(
    @ApplicationContext private val context: Context,
) {

    private val prefs by lazy {
        context.getSharedPreferences("settings_debug", Context.MODE_PRIVATE)
    }

    val isAutoReportEnabled = prefs.createFlowPreference("bugreport.automatic.enabled", true)

}