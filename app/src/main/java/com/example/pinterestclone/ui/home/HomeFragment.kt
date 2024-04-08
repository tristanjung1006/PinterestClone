package com.example.pinterestclone.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.pinterestclone.PostItem
import com.example.pinterestclone.R
import com.example.pinterestclone.databinding.FragmentHomeBinding
import com.example.pinterestclone.ui.adapter.PinterestAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var rvAdapter: PinterestAdapter
    private var itemList = mutableListOf<PostItem>()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        // add items into recyclerview holder
        itemList.add(PostItem(R.drawable.daemon))
        itemList.add(PostItem(R.drawable.rhaenyra))
        itemList.add(PostItem(R.drawable.aemond))
        itemList.add(PostItem(R.drawable.baela_jace_luke_rhaena))
        itemList.add(PostItem(R.drawable.daemon_hall))
        itemList.add(PostItem(R.drawable.hotds2))
        itemList.add(PostItem(R.drawable.syrax))

        rvAdapter = PinterestAdapter(requireContext(), itemList)

        binding.rvPinterest.adapter = rvAdapter

        binding.rvPinterest.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}