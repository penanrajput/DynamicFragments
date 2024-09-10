package com.example.dynamicfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.dynamicfragments.databinding.FragmentVegetablesBinding


class VegetablesFragment : Fragment() {

    private var _binding: FragmentVegetablesBinding? = null
    private val binding get() = _binding!!

    var vegetables = arrayOf(
        "carrot",
        "broccoli",
        "spinach",
        "kale",
        "cabbage",
        "lettuce",
        "cauliflower",
        "cucumber",
        "zucchini",
        "bell pepper",
        "tomato",
        "eggplant",
        "radish",
        "beetroot",
        "potato",
        "sweet potato",
        "onion",
        "garlic",
        "ginger",
        "asparagus",
        "celery",
        "peas",
        "green beans",
        "pumpkin",
        "corn",
        "turnip",
        "leek",
        "fennel",
        "artichoke",
        "okra",
        "squash"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_vegetables, container, false)


        _binding = FragmentVegetablesBinding.inflate(inflater, container, false)

        binding.lvVegetables.adapter = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            vegetables
        )
        return binding.root
    }

}