package com.example.bookslibrary

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bookslibrary.databinding.BookLayoutBinding


class RecycleViewAdapter(val context: Context, val data: Array<Book>): RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>() {

    class MyViewHolder(row: BookLayoutBinding): RecyclerView.ViewHolder(row.root) {
        val title = row.bookTitle
        val image = row.bookImg
        val cardView = row.cardView;
        //val cardView =

        fun bind(book: Book) {
            title.text = book.name
            image.setImageResource(book.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewAdapter.MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = BookLayoutBinding.inflate(layoutInflater, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val book = data[position]
        holder.bind(book)

        // Set an OnClickListener for the cardView
        holder.cardView.setOnClickListener {
            // Create an intent to start the BookDetailsActivity
            val intent = Intent(context, BookDetailsActivity::class.java)

            // Pass book details to the intent
            intent.putExtra("name", book.name)
            intent.putExtra("author", book.author)
            intent.putExtra("isbn", book.isbn)
            intent.putExtra("category", book.category)
            intent.putExtra("rating", book.rating)
            intent.putExtra("description", book.description)
            intent.putExtra("imageId", book.imageId)

            // Start the BookDetailsActivity
            context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return data.size
    }
}