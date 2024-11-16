package com.fjmv.componente24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FirstjmFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root=inflater.inflate(R.layout.fragment_firstjm, container, false)

        val btnNavegar = root.findViewById<Button>(R.id.btnNavegar)

        btnNavegar.setOnClickListener {
            findNavController().navigate(R.id.action_firstjmFragment_to_secondjmFragment)
        }



        return root
    }

}