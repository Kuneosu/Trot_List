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
import androidx.recyclerview.widget.LinearLayoutManager
import com.kks.trot_list.databinding.FragmentSinger1Binding


class Singer1Fragment : Fragment() {
    private val TAG = "Singer1Fragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentSinger1Binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_singer1, container, false)

        val singList = makeSingList()

        val adapter = SingRvAdapter(singList)
        binding.singerRecyclerView.adapter = adapter
        binding.singerRecyclerView.layoutManager = LinearLayoutManager(context)

        binding.image2.setOnClickListener {
            moveSinger2Fragment(it)
        }
        binding.image3.setOnClickListener {
            moveSinger3Fragment(it)
        }
        return binding.root
    }

    private fun makeSingList(): MutableList<String> {
        val singList = mutableListOf<String>()
        singList.add("니가 왜 거기서나와")
        singList.add("이불")
        singList.add("찐이야")
        singList.add("비상")
        singList.add("니가 왜 거기서나와")
        singList.add("이불")
        singList.add("찐이야")
        singList.add("비상")
        singList.add("니가 왜 거기서나와")
        singList.add("이불")
        singList.add("찐이야")
        singList.add("비상")
        singList.add("니가 왜 거기서나와")
        singList.add("이불")
        singList.add("찐이야")
        singList.add("비상")
        return singList
    }

    private fun moveSinger2Fragment(view: View) {
        view.findNavController().navigate(R.id.action_singer1Fragment_to_singer2Fragment)
    }

    private fun moveSinger3Fragment(view: View) {
        view.findNavController().navigate(R.id.action_singer1Fragment_to_singer3Fragment)
    }

}