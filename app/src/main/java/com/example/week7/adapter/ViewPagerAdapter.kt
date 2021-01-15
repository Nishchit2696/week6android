package com.example.week7.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (
    private val lstfragments: ArrayList<Fragment>,
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {
        return lstfragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return lstfragments[position]
    }
}