package com.zaher.recyclerwithmotionlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.zaher.recyclerwithmotionlayout.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_list, container, false)
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // binding.recyclerViewItems
        val modelData = ArrayList<ItemsViewModel>()
        for (item in 1..90) {
            modelData.add(ItemsViewModel(R.mipmap.ic_launcher, "item $item"))
        }
        binding.recyclerViewItems.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerViewItems.adapter = CustomAdapter(modelData)
    }
}