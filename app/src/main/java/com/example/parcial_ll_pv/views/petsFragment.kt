package com.example.parcial_ll_pv.views

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parcial_ll_pv.R
import com.example.parcial_ll_pv.databinding.FragmentPetsBinding
import com.example.parcial_ll_pv.databinding.PetsListBinding
import com.example.parcial_ll_pv.viewmodels.PetListModel
import com.jalfaro.preparacionexamen.adapter.PetAdapter

class petsFragment : Fragment() {
    lateinit var binding: FragmentPetsBinding
    lateinit var viewModel: PetListModel
    lateinit var adapter: PetAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPetsBinding.inflate(inflater,container, false)
        viewModel = ViewModelProvider(this).get(PetListModel::class.java)
        adapter = PetAdapter(viewModel.getData())
        binding.btnRegresar.setOnClickListener {
            findNavController().navigate(R.id.action_petsFragment_to_menuFragment)
        }
        binding.rcListado.layoutManager = LinearLayoutManager(activity?.baseContext)
        binding.rcListado.adapter = adapter

        return binding.root
    }

}