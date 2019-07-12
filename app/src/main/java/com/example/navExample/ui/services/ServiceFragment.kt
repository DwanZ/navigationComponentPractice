package com.example.navExample.ui.services


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navExample.R
import com.example.navExample.ui.generic_adapter.GenericAdapter
import kotlinx.android.synthetic.main.fragment_service.service_list


class ServiceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_service, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = GenericAdapter()
        adapter.setItems(SERVICES)
        adapter.setOnItemClickedListener {
            findNavController().navigate(R.id.action_serviceFragment_to_paymentFragment)
        }
        service_list.adapter = adapter
    }

    companion object {
        val SERVICES = listOf<String>(
            "Pagar factura", "Recargar celular",
            "Compra de ticketes", "Solicitar domicilio",
            "Servicio de asistencia medica", "Enviarle saldo a un amigo",
            "Eventos en tu ciudad", "Contactar a soporte"
        )
    }

}
