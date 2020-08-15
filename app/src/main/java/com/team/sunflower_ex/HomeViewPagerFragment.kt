package com.team.sunflower_ex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.team.sunflower_ex.databinding.FragmentViewPagerBinding


/**
 * A simple [Fragment] subclass.
 * Use the [HomeViewPagerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        val tabLayout = binding.tabs
        val viewPager = binding.viewPager

        viewPager.adapter = SunflowerPagerAdapter(this)

        // Set the icon and text for each tab
        TabLayoutMediator(tabLayout, viewPager){ tab, position ->

        }

        return binding.root
    }

    


}