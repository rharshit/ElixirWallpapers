package com.elixir.wallpapers;

import static android.content.ContentValues.TAG;

import android.service.wallpaper.WallpaperService;
import android.util.Log;

public class ElixirWallpapers extends WallpaperService {
    @Override
    public Engine onCreateEngine() {
        Log.d(TAG, "onCreateEngine: Creating engine");
        return new Engine();
    }
}
