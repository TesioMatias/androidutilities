package com.example.android_utilities.builder

import android.net.Uri

interface FragmentHostStep {
    fun withArguments(uri: Uri?): FragmentArgsStep
}
