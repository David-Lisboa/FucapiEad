@file:Suppress("PackageName")

package com.davidpjoject.fucapiead.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.davidpjoject.fucapiead.Fragment.ChatFragment
import com.davidpjoject.fucapiead.Fragment.ContactFragment
import com.davidpjoject.fucapiead.Fragment.GroupChatFragment

class TabSwitcher(fragmentManager: FragmentManager): FragmentPagerAdapter (fragmentManager) {

    override fun getItem(position: Int): Fragment {

        when(position) {
            0 -> {
                val chatFragment = ChatFragment()
                return chatFragment
            }
            1 -> {
                val groupChatFragment = GroupChatFragment()
                return groupChatFragment
            }
            2 -> {
                val contactFragment = ContactFragment()
                return contactFragment
            }
            else -> {
                return null!!
            }
        }
    }
    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> {
                "Chat"
            }
            1 -> {
                "Group Chat"
            }
            2 -> {
                "Contact"
            }
            else -> {
                null!!
            }
        }
    }

}
