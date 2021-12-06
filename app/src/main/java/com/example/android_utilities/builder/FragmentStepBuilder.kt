package com.example.android_utilities.builder

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.android_utilities.builder.SheetRegistry.SHEETS

object FragmentStepBuilder {

    private const val FRAGMENT_ID_KEY = "fragment_id"

    private var fragment: Class<out Fragment>? = null
    private lateinit var args: Bundle

    fun create(): FragmentSelectionStep {
        return Builder()
    }

    class Builder : FragmentSelectionStep, FragmentHostStep, FragmentArgsStep {
        override fun build(): Fragment? {
            val instance = fragment?.newInstance()
            instance?.arguments = args
            return instance
        }

        override fun withArguments(uri: Uri?): FragmentArgsStep {
            args = Bundle()
            uri?.getQueryParameter(FRAGMENT_ID_KEY)?.let {
                args.putString(FRAGMENT_ID_KEY, it)
            }
            return this
        }

        override fun withHost(host: String?): FragmentHostStep {
            host?.let {
                fragment = SHEETS[it]
            }
            return this
        }
    }
}
