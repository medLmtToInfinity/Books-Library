package com.example.bookslibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bookslibrary.databinding.ActivityMainBinding
import com.example.bookslibrary.databinding.BookDetailsBinding
import com.example.bookslibrary.databinding.BookLayoutBinding

class BookDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: BookDetailsBinding = DataBindingUtil.setContentView(this, R.layout.book_details)
        val imageId = intent.getIntExtra("imageId", 0)
        val name = intent.getStringExtra("name")
        val isbn = intent.getStringExtra("isbn")
        val author = intent.getStringExtra("author")
        val category = intent.getStringExtra("category")
        val description = intent.getStringExtra("description")
        val rating = intent.getStringExtra("rating")
        binding.imageView.setImageResource(imageId)
        binding.bTitle.text = name
        binding.bAuthor.text = author
        binding.bIsbn.text = isbn
        binding.bCat.text = category
        binding.bRating.text = rating
        binding.bDesc.text = description

    }
}