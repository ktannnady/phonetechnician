package com.example.phonetechinician.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.phonetechinician.R
import com.example.phonetechinician.TestRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment() {

    private lateinit var searchViewModel: SearchViewModel
    private lateinit var testAdapter: TestRecyclerAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
         return inflater.inflate(R.layout.fragment_search, container, false)
        //return root
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        initRecycleView()
        testAdapter.submitList()
    }

    private fun initRecycleView(){
        recycler_view.layoutManager = LinearLayoutManager(activity)
        recycler_view.apply{
        //val topSpacingDecoration = TopSpacingItemDecoration(30)
        //addItemDecoration(topSpacingDecoration)
        testAdapter = TestRecyclerAdapter()
        adapter = testAdapter
        }
    }
}