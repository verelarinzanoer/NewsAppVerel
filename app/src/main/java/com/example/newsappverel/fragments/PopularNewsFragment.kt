package com.example.newsappverel.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsappverel.R
import com.example.newsappverel.adapter.NewsAdapter
import com.example.newsappverel.data.DataNews
import com.example.newsappverel.helper.initViewHeadline

class PopularNewsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_popular, container, false)
        val rvAllNews = view.findViewById<RecyclerView>(R.id.rv_popular_news)
        rvAllNews.apply {
            adapter = NewsAdapter(DataNews.dataPopularNews)
            layoutManager = LinearLayoutManager(view.context)
            setHasFixedSize(true)
        }

        val newsHeadline = view.findViewById<View>(R.id.news_headline)
        initViewHeadline(view.context, newsHeadline, 2)

        return view
    }
}