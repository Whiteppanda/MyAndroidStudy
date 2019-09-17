package com.example.thirdstudyassignment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class proAdapter(val context: Context, val proList: ArrayList<pro>) : RecyclerView.Adapter<proAdapter.Holder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.pro_list,parent,false)
        val holder:Holder = Holder(view)
        val position = holder.adapterPosition
        view.setOnClickListener {
            if(position == 1)
            Toast.makeText(context, "시발",Toast.LENGTH_SHORT).show()
            else Toast.makeText(context, "" + position,Toast.LENGTH_SHORT).show()

        }
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return proList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.num.text = proList[position].num
        /*holder.num.setOnClickListener{

        }*/

        holder.name.text = proList[position].name
        /*holder.name.setOnClickListener{

        }*/
    }

    inner class Holder(v: View) : RecyclerView.ViewHolder(v){
        val num = v.findViewById<TextView>(R.id.numtext)
        val name = v.findViewById<TextView>(R.id.nametext)
    }
}