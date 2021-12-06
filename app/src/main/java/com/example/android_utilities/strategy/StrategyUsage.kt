package com.example.android_utilities.strategy

class StrategyUsage {

    init {
        AssetLoader.strategy = OtherExampleAssetLoaderStrategy()
        AssetLoader.loadImage()
    }
}
