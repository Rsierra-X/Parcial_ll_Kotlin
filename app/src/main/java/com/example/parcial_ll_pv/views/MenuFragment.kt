package com.example.parcial_ll_pv.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.parcial_ll_pv.R
import com.example.parcial_ll_pv.databinding.FragmentMenuBinding

class MenuFragment: Fragment() {

    lateinit var binding: FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater,container, false)
        binding.btnRandomNumber.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_randomNumber)
        }
        binding.btnPet.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_petsFragment)
        }
        return binding.root
    }
}