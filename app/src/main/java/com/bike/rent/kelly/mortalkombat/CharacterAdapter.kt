package com.bike.rent.kelly.mortalkombat

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class CharacterAdapter(private var characterList:ArrayList<Characters>, private val context: Context,
    val listener: (Int) -> Unit): RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.characters_list_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return characterList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindView(characterList[position], position, listener)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name = itemView.findViewById<TextView>(R.id.charName)
        var home = itemView.findViewById<TextView>(R.id.charHome)
        var move = itemView.findViewById<TextView>(R.id.charMove)
        var charImage = itemView.findViewById<ImageView>(R.id.charImg)

        /**
         *
         */
        fun bindView(char: Characters, pos: Int, listener: (Int) -> Unit) = with(itemView) {
            name.text = "Name: ${char.name}"
            home.text = "Home: ${char.place}"
            move.text = "Favourite Move: ${char.favMove}"
            charImage.setImageDrawable(char.image)

        }
    }
}