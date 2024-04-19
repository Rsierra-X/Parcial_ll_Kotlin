package com.example.parcial_ll_pv.viewmodels

import androidx.lifecycle.ViewModel
import com.jalfaro.preparacionexamen.models.Pet
import com.example.parcial_ll_pv.R


class PetListModel: ViewModel() {
    fun getData() : ArrayList<Pet> = arrayListOf(
        Pet("Canelo", "5 años", R.drawable.dog),
        Pet("Plumas", "6 años", R.drawable.bird),
        Pet("Garras", "4 años", R.drawable.cat)
    )
}