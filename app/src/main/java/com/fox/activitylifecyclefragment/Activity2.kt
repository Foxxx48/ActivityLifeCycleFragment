package com.fox.activitylifecyclefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.fox.activitylifecyclefragment.databinding.Activity2Binding
import com.fox.activitylifecyclefragment.databinding.ActivityMainBinding

class Activity2 : AppCompatActivity() {
    private var _binding: Activity2Binding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "OnCreate, savedState = $savedInstanceState")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "OnStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity.TAG, "OnRestart")
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "OnSaveInstanceState")
    }

    companion object {
        @JvmStatic val TAG = "MyApp: " + Activity2::class.simpleName
    }
}