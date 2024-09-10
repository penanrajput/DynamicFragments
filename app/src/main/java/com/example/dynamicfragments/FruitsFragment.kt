package com.example.dynamicfragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.dynamicfragments.databinding.FragmentFruitsBinding


class FruitsFragment : Fragment() {

    private var _binding: FragmentFruitsBinding? = null
    private val binding get() = _binding!!

    var fruits = arrayOf(
        "Apple", "Orange", "Banana", "Pineapple", "Grapes", "Pomegranate",
        "Kiwi", "Watermelon", "Cherry"
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        _binding = FragmentFruitsBinding.inflate(inflater, container, false)

        binding.lvFruits.adapter = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            fruits
        )
        return binding.root
//        return inflater.inflate(R.layout.fragment_fruits, container, false)
    }


}