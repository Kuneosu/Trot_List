package com.kks.trot_list

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.kks.trot_list.databinding.FragmentSinger1Binding


class Singer1Fragment : Fragment() {
    private val TAG = "Singer1Fragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentSinger1Binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_singer1, container, false)

        binding.image2.setOnClickListener {
            moveSinger2Fragment(it)
        }
        binding.image3.setOnClickListener {
            moveSinger3Fragment(it)
        }
        return binding.root
    }

    private fun moveSinger2Fragment(view: View) {
        view.findNavController().navigate(R.id.action_singer1Fragment_to_singer2Fragment)
    }

    private fun moveSinger3Fragment(view: View) {
        view.findNavController().navigate(R.id.action_singer1Fragment_to_singer3Fragment)
    }

}