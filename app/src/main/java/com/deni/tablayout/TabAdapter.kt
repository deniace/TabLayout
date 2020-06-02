package com.deni.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.deni.tablayout.fragment.ChatFragment
import com.deni.tablayout.fragment.PanggilanFragment
import com.deni.tablayout.fragment.StatusFragment

/**
 * Created by Deni Supriyatna (deni ace) on 02 - 06 - 2020.
 * Email : denisupriyatna01@gmail.com
 */
class TabAdapter(fm: FragmentManager, behavior: Int): FragmentStatePagerAdapter(fm, behavior) {
    // nama tab
    private val tabName: Array<String> = arrayOf("Chat", "Status", "Profile")

        // untuk posisi
        override fun getItem(position: Int): Fragment =
            when (position) {
                0 -> ChatFragment()
                1 -> PanggilanFragment()
                2 -> StatusFragment()
                else -> ChatFragment()
            }

        override fun getCount(): Int = 3
        override fun getPageTitle(position: Int): CharSequence? = tabName.get(position)
}