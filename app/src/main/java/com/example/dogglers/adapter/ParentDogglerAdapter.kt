package com.example.dogglers.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.data.DataSource
import com.example.dogglers.model.Dog
import com.example.dogglers.model.DogConverted

class ParentDogglerAdapter : RecyclerView.Adapter<ParentDogglerAdapter.DogParentViewHolder>() {

    val dataset = DataSource.dogs

    var mapResult = DataSource.dogs.groupBy { it.section }

    var dogList: MutableList<DogConverted> = ArrayList()

    //var dogeList: List<Dog> = ArrayList()

     class DogParentViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        // TODO: Declare and initialize all of the list item UI components
        val titleContent: TextView = view!!.findViewById(R.id.content_title)
        val recyclerView: RecyclerView = view!!.findViewById(R.id.child_recycler_view)

        fun bind(dogSingleList: DogConverted){
            titleContent.text = dogSingleList.name
            recyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.VERTICAL,false)
            val childMembersAdapter = ChildDogglerAdapter(dogSingleList.members)
            recyclerView.adapter = childMembersAdapter


//            val childMembersAdapter = ChildMembersAdapter(result.members)
//            itemView.child_recycler_view.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL,false)
//            itemView.child_recycler_view.adapter = childMembersAdapter
        }

    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogParentViewHolder {
//
//
//        val adapterLayout = LayoutInflater.from(parent.context)
//            .inflate(R.layout.parent_vertical_list, parent, false)
//        return DogParentViewHolder(adapterLayout)
//
//
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ParentDogglerAdapter.DogParentViewHolder(

            LayoutInflater.from(parent.context).inflate(
                R.layout.parent_vertical_list, parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ParentDogglerAdapter.DogParentViewHolder, position: Int) {
//        val item = dataset[position]

        //
       for(result in mapResult){
           var a = result.key
           var b  = result.value
           dogList.add(DogConverted(a, b))
       }

        holder.bind(dogList[position])
    }

    override fun getItemCount(): Int = mapResult.count()

}