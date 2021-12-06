package com.example.android_utilities.strategy

import android.util.Log

class OtherExampleAssetLoaderStrategy : AssetLoaderStrategy {

    override fun loadImage() {
        Log.i("OtherExampleAssetLoaderStrategy", "this worked")
    }
}
