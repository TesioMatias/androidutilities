package com.example.strategy

class StrategyUsage {

    init {
        AssetLoader.strategy = OtherExampleAssetLoaderStrategy()
        AssetLoader.loadImage()
    }
}
