package com.example.navExample.ui.payment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navExample.R
import kotlinx.android.synthetic.main.fragment_payment.*


class PaymentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pay_btn.setOnClickListener {
            findNavController().navigate(R.id.action_paymentFragment_to_mainFragment)
        }
        conditions_text.text = text
    }

    companion object {
        const val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc mi lectus, convallis sit amet convallis eget, bibendum at lectus. Sed id pharetra augue. Mauris vitae volutpat magna, quis rutrum eros. Sed eu nunc dui. Nullam aliquam dui nec tristique pulvinar. Fusce mollis dolor et dui aliquet congue. Fusce eu lectus aliquam, dapibus libero quis, ullamcorper sapien. Integer nec malesuada nulla, eget tristique turpis. Donec ullamcorper magna vitae ex vulputate dapibus. Ut leo diam, pharetra a lacinia non, vulputate nec risus. Donec condimentum eleifend risus vitae pulvinar. Phasellus eget nibh aliquet, interdum odio in, condimentum lorem. Nulla luctus, sapien et mattis rutrum, risus magna varius tortor, et sodales urna eros vitae mi. Vivamus egestas nulla arcu, eget venenatis orci iaculis in.\n" +
                "\n" +
                "Phasellus nec justo nisl. Aliquam cursus libero urna. Suspendisse volutpat quam nunc, quis auctor turpis dapibus id. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Sed eu felis augue. In finibus elementum libero, eget bibendum magna pellentesque eu. Phasellus hendrerit mollis eros, eget mattis quam varius nec. Aliquam fringilla tellus ut dolor finibus, vel vestibulum elit fermentum. Mauris sodales lacus ac neque sollicitudin lacinia. Phasellus tempor, massa in faucibus consequat, velit leo dictum lectus, vel faucibus mi arcu eu nisi. Aliquam erat volutpat. Aliquam hendrerit aliquet sem commodo aliquet. Ut ut orci quam. Morbi feugiat arcu enim, id interdum dui mollis nec.\n" +
                "\n" +
                "Cras a sapien molestie, feugiat ligula vel, suscipit orci. Nunc blandit ligula eros, ac imperdiet mi gravida in. Vivamus congue eu purus ac molestie. Mauris aliquet metus ex, sed ornare neque placerat eget. Morbi quis dapibus massa, eu posuere turpis. Proin sodales dolor nisi, congue sodales eros tristique vel. Aenean sed tortor ac sapien pretium pharetra non a mauris. Nullam nisi sapien, volutpat sed tincidunt finibus, eleifend eu augue.\n" +
                "\n" +
                "Phasellus sit amet nisl blandit, sollicitudin odio at, tristique lorem. Vivamus non vulputate nunc. Morbi consectetur est vitae gravida aliquam. Ut mollis porta ex sit amet tristique. Nulla suscipit, quam quis laoreet eleifend, erat eros fermentum risus, vel aliquet nunc leo vitae purus. Curabitur mollis facilisis leo, eget tempor arcu accumsan nec. Proin congue efficitur ullamcorper. Cras lobortis sapien vel neque mattis, nec sodales orci posuere. Etiam commodo nunc vitae feugiat mattis. Vestibulum id fermentum augue, ut auctor metus. Suspendisse volutpat diam eget commodo volutpat. Aenean dapibus magna sit amet arcu efficitur malesuada eu non arcu.\n" +
                "\n" +
                "Praesent mollis augue finibus augue rutrum auctor. Ut sit amet dolor quis sapien consequat euismod. Sed erat ipsum, egestas sed eros in, finibus sagittis purus. Morbi sed ligula sapien. In rutrum risus eget dignissim bibendum. Donec feugiat in neque eu blandit. Duis non vestibulum eros."
    }
}
