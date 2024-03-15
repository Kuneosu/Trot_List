package com.kks.trot_list

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.kks.trot_list.databinding.FragmentSinger2Binding

class Singer2Fragment : Fragment() {

    private lateinit var binding: FragmentSinger2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Singer2Fragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("Singer2Fragment", "onCreateView")
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_singer2, container, false)

        binding.image1.setOnClickListener {
            moveSinger1Fragment(it)
        }

        binding.image3.setOnClickListener {
            moveSinger3Fragment(it)
        }

        return binding.root
    }

    private fun moveSinger1Fragment(view: View) {
        view.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
    }

    private fun moveSinger3Fragment(view: View) {
        view.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
    }

}