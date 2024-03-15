package com.kks.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.kks.trot_list.databinding.FragmentSinger3Binding

class Singer3Fragment : Fragment() {

    private lateinit var binding: FragmentSinger3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_singer3, container, false)
        binding.image1.setOnClickListener {
            moveSinger1Fragment(it)
        }
        binding.image2.setOnClickListener {
            moveSinger2Fragment(it)
        }

        return binding.root
    }

    private fun moveSinger1Fragment(view: View) {
        view.findNavController().navigate(R.id.action_singer3Fragment_to_singer1Fragment)
    }

    private fun moveSinger2Fragment(view: View) {
        view.findNavController().navigate(R.id.action_singer3Fragment_to_singer2Fragment)
    }
}