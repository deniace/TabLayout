package com.deni.tablayout.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.deni.tablayout.R

/**
 * Created by Deni Supriyatna (deni ace) on 31 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

class ChatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

}
