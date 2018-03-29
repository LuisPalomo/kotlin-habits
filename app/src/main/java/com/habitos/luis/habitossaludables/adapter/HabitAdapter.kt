package com.habitos.luis.habitossaludables.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.habitos.luis.habitossaludables.R
import com.habitos.luis.habitossaludables.data.Habit
import kotlinx.android.synthetic.main.item_habit.view.*

/**
 * Created by kotlin on 20/03/2018.
 */
class HabitAdapter(val habits:List<Habit>, val itemClick: (Habit) -> Unit): RecyclerView.Adapter<HabitAdapter.HabitViewHolder>() {

    class HabitViewHolder(val iv:View): RecyclerView.ViewHolder(iv)

    override fun onBindViewHolder(holder: HabitViewHolder?, position: Int) {
        if (holder != null) {
            val habit = habits[position]
            holder.iv.icono.setImageResource(habit.icon)
            holder.iv.nombre.text = habit.nombre
            holder.iv.descripcion.text= habit.desc

            holder.iv.setOnClickListener {
                // enviar el objeto 'habit' seleccionado
                itemClick(habit)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): HabitViewHolder{
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_habit, parent, false)

        return HabitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return habits.size
    }

}