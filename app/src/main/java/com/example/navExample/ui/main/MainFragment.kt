package com.example.navExample.ui.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navExample.R
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        product_btn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_productFragment)
        }
        service_btn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_serviceFragment)
        }
        shopping_btn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_myShoppingFragment)
        }
    }


}
