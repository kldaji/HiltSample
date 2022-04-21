package com.kldaji.hiltsample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


// application-level dependency container
@HiltAndroidApp
class App : Application()
