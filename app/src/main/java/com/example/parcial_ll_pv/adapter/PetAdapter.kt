package com.jalfaro.preparacionexamen.adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_ll_pv.R
import com.example.parcial_ll_pv.databinding.PetsListBinding
import com.jalfaro.preparacionexamen.models.Pet

class PetAdapter(val listado: ArrayList<Pet>):
    RecyclerView.Adapter<PetAdapter.PetViewHolder>() {
    class PetViewHolder(val binding: PetsListBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetViewHolder =
        PetViewHolder(PetsListBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = listado.size

    override fun onBindViewHolder(holder: PetViewHolder, position: Int) {
        val drawableResource = listado.get(position).src
        holder.binding.imgPet.setImageResource(drawableResource)
        holder.binding.petName.text = listado.get(position).name
        holder.binding.petBirth.text = listado.get(position).birth
    }
}