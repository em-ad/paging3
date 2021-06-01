package com.emad.paging3.adapter

import android.view.View
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView

class HeaderFooterAdapter() : LoadStateAdapter<HeaderFooterAdapter.ViewHolder>() {


//    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoadStateViewHolder {
//        return LoadStateViewHolder(
//            //layout file
//        )
//    }

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view)

    override fun onBindViewHolder(holder: ViewHolder, loadState: LoadState) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): ViewHolder {
        TODO("Not yet implemented")
    }

}