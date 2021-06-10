package com.davidpjoject.fucapiead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.davidpjoject.fucapiead.Adapter.TabSwitcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setSupportActionBar(main_toolbar as Toolbar?)
//        supportActionBar?.title = "Whatsapp"

        main_view_pager.adapter = TabSwitcher(supportFragmentManager)

        tab_switcher.setupWithViewPager(main_view_pager)

    }
}