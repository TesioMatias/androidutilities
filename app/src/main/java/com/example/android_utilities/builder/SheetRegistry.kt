package com.example.android_utilities.builder

import androidx.fragment.app.Fragment

object SheetRegistry {
    private const val EXAMPLE = "EXAMPLE_SHEET"

    val SHEETS = HashMap<String, Class<out Fragment>>()

    init {
        setRegistry(EXAMPLE, Fragment::class.java)
    }

    private fun setRegistry(type: String, view: Class<Fragment>) {
        SHEETS[type] = view
    }
}
