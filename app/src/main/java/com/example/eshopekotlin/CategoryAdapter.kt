package com.example.eshopekotlin


import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView


import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private val category: List<Category>, private val category_2: List<Category>) : RecyclerView.Adapter<ViewHolder>() {

    var row_index = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.textView.text = category[position].description
        holder.imageView.setImageResource(category[position].icon)
        holder.linearLayout.setOnClickListener {
            row_index = position
            notifyDataSetChanged()
        }
            if (row_index == position){

                holder.imageView.setImageResource(category_2[position].icon)
                holder.textView.setTextColor(Color.parseColor("#FF6E4E"))
            }else
            {
                //holder.imageView.setImageResource(R.drawable.ic_ellipse_4)
                holder.textView.setTextColor(Color.parseColor("#010035"))
            }




    }

    override fun getItemCount(): Int {
        return category.size
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var textView: TextView = itemView.findViewById(R.id.textViewCategory)
    var imageView: ImageView = itemView.findViewById(R.id.imageViewCategory)
    var linearLayout: LinearLayout = itemView.findViewById(R.id.linearLayout)
//    init {
//        itemView.setOnClickListener{
//
//            imageView.setImageResource(R.drawable.ic_ellipse_7)
//            textView.setTextColor(Color.parseColor("#FF6E4E"))
//
//
//        }
//    }


}
