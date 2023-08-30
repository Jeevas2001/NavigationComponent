package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation


class First_Fragment : Fragment() {
    lateinit var txtView:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_first, container, false)
        txtView=view.findViewById(R.id.firstFragText)
        txtView.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.navigate_SecondFragment)
            Toast.makeText(context,"Hello",Toast.LENGTH_SHORT).show()
        }
        return view
    }
}