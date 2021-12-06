package com.example.strategy

object AssetLoader {

    var strategy: AssetLoaderStrategy = ProductionAssetLoaderStrategy()

    fun loadImage(){
        strategy.loadImage()
    }
}
