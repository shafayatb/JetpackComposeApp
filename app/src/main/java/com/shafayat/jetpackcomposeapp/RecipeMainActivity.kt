package com.shafayat.jetpackcomposeapp

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.shafayat.jetpackcomposeapp.databinding.ActivityRecipeMainBinding

class RecipeMainActivity: AppCompatActivity()  {

    private lateinit var binding: ActivityRecipeMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecipeMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainerView.id, RecipeListFragment())
            .commit()

    }

}