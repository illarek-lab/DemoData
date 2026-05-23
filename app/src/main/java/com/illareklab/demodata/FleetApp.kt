package com.illareklab.demodata



import android.app.Application
import com.illareklab.demodata.data.local.FileStorageManager
import com.illareklab.demodata.data.local.DemoDataDatabase
import com.illareklab.demodata.data.repository.AudioRepository
import com.illareklab.demodata.data.repository.GpsRepository
import com.illareklab.demodata.data.repository.MediaRepository
import com.illareklab.demodata.data.session.SessionManager

class DemoDataApp : Application() {

    // Inicialización perezosa: solo se crea al primer acceso
    val database by lazy { DemoDataDatabase.getInstance(this) }
    val fileStorage by lazy { FileStorageManager(this) }
    val sessionManager by lazy { SessionManager(this) }

    val gpsRepository by lazy {
        GpsRepository(database.gpsGoogleDao(), database.gpsSensorsDao())
    }
    val mediaRepository by lazy {
        MediaRepository(database.mediaDao(), fileStorage)
    }
    val audioRepository by lazy {
        AudioRepository(database.audioDao(), fileStorage)
    }
}