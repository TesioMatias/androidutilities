package com.example.android_utilities.strategy

import android.util.Log

class ProductionAssetLoaderStrategy : AssetLoaderStrategy {

    override fun loadImage() {
        Log.i("ProductionAssetLoaderStrategy", "this worked")
    }
}
