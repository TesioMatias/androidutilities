package com.example.android_utilities.strategy

object AssetLoader {

    var strategy: AssetLoaderStrategy = ProductionAssetLoaderStrategy()

    fun loadImage(){
        strategy.loadImage()
    }
}
