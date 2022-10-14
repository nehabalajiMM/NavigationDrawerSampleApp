package com.example.navigationdrawersampleapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationdrawersampleapp.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private var binding: FragmentThirdBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentThirdBinding.bind(view)
        binding?.tvThree?.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToFirstFragment(4)
            Navigation.findNavController(view).navigate(action)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}
