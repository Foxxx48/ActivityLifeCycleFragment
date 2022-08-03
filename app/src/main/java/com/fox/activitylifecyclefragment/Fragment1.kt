package com.fox.activitylifecyclefragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fox.activitylifecyclefragment.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private var _binding: Fragment1Binding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "OnAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "OnCreate, savedState = $savedInstanceState")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment1Binding.inflate(layoutInflater, container, false)
        Log.d(TAG, "OnCreateView")
        val myBundle = Bundle()

        binding.fr1Btn2Send.setOnClickListener {
            Log.d(TAG, "CLICKED ON SEND BUNDLE SAFE ARGS BUTTON")

            val textBundle = binding.fr1Et2.text.toString()

            myBundle.putString("key1", textBundle)

            println("Result 1: " + myBundle.getString("key1"))

            findNavController().navigate(R.id.action_fragment1_to_fragment2, myBundle)
        }

        binding.fr1Btn1Send.setOnClickListener{
            Log.d(TAG, "CLICKED ON SEND SAFE ARGS BUTTON")

            val textSafe = binding.fr1Et1.text.toString()

            val action = Fragment1Directions.actionFragment1ToFragment3(textSafe)

            println("Result2:  $textSafe")

            findNavController().navigate(action)
        }

        binding.fr1Btn3Activity2.setOnClickListener {
            Log.d(TAG, "CLICKED ON GO TO ACTIVITY BUTTON")


            val action = Fragment1Directions.actionFragment1ToActivity2()
            findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "OnViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(TAG, "onViewStateRestored")
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


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "OnSaveInstanceState = $outState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "OnDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach")
    }

    companion object {
        @JvmStatic val TAG = "MyApp: " +  Fragment1::class.simpleName
    }


}