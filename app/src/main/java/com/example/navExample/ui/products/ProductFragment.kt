package com.example.navExample.ui.products


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navExample.R
import com.example.navExample.ui.generic_adapter.GenericAdapter
import kotlinx.android.synthetic.main.fragment_product.*


class ProductFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = GenericAdapter()
        adapter.setItems(PRODUCTS)
        adapter.setOnItemClickedListener {
            findNavController().navigate(R.id.action_productFragment_to_paymentFragment)
        }
        product_list.adapter = adapter
    }

    companion object {
        val PRODUCTS = listOf<String>(
            "Arroz libra",
            "Coliflor libra", "Azúcar libra", "Banano gajo",
            "Lenteja libra", "Coca cola litro y medio",
            "Frijol libra", "Pepsi litro y medio"
        )
    }

}
