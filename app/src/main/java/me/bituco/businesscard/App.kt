package me.bituco.businesscard

import android.app.Application
import me.bituco.businesscard.data.AppDataBase
import me.bituco.businesscard.data.BusinessCardRepository

class App : Application() {
    val dataBase by lazy { AppDataBase.getDatabase(this) }
    val BusinessCardRepository by lazy { BusinessCardRepository(dataBase.businessDao()) }
}