package com.example.alarmium

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() : Int {
        return 3
    }

    override fun getItem(pos: Int): Fragment {
        return when (pos) {
            0 -> {
                FirstFragment()
            }
            1 -> SecondFragment()
            else -> {
                ThirdFragment()
            }
        }
    }

    override fun getPageTitle(pos: Int): CharSequence? {
        return when (pos) {
            0 -> "1st Tab"
            1 -> "2nd Tab"
            else -> {
                "3rd Tab"
            }
        }
    }

}