package com.example.parcial_ll_pv.views

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.parcial_ll_pv.R
import com.example.parcial_ll_pv.databinding.FragmentRandomNumberBinding
import kotlin.random.Random

class randomNumber : Fragment() {
    lateinit var binding: FragmentRandomNumberBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRandomNumberBinding.inflate(inflater,container, false)
        binding.btnRandom.setOnClickListener{
            val randomNumber = Random.nextInt(1, 7)
            val drawableResource = when (randomNumber) {
                1 -> R.drawable.dado_1
                2 -> R.drawable.dado_2
                3 -> R.drawable.dado_3
                4 -> R.drawable.dado_4
                5 -> R.drawable.dado_5
                else -> R.drawable.dado_6
            }

            binding.imgPet.setImageResource(drawableResource)
        }
        binding.btnRegresar.setOnClickListener {
            findNavController().navigate(R.id.action_randomNumber_to_menuFragment)
        }
        return binding.root
    }
}