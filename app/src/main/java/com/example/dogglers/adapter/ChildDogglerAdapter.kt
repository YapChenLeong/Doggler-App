package com.example.dogglers.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.model.Dog
import com.example.dogglers.model.DogConverted


class ChildDogglerAdapter(var memberData: List<Dog>) : RecyclerView.Adapter<ChildDogglerAdapter.DataViewHolder>() {

        private var membersList: List<Dog> = ArrayList()

        init {
            this.membersList = memberData
        }

       // var onItemClick: ((String) -> Unit)? = null

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//            init {
//                itemView.setOnClickListener {
//                    onItemClick?.invoke(membersList[adapterPosition].name)
//                }
//            }

            private val imageView: ImageView = itemView!!.findViewById(R.id.imageView)
            private val textName: TextView = itemView!!.findViewById(R.id.textName)
            private val textAge: TextView = itemView!!.findViewById(R.id.textAge)
            private val textHobbies: TextView = itemView!!.findViewById(R.id.textHobbies)

            fun bind(result: Dog) {
                imageView.setImageResource(result.imageResourceId)
                textName.text = result.name
                textAge.text = itemView.context.getString(R.string.dog_age, result.age)
                textHobbies.text = itemView.context.getString(R.string.dog_hobbies, result.hobbies)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.vertical_horizontal_list_item, parent,
                false
            )
        )

        override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
            holder.bind(membersList[position])
        }

        override fun getItemCount(): Int = membersList.size
}