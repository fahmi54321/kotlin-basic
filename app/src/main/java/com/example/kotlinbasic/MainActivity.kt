package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var toogle: ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer)
        navView = findViewById(R.id.nav_view)

        toogle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            R.string.open,
            R.string.close,
        )

        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // functionality for the nav drawer items
        navView.setNavigationItemSelectedListener {
            it.isCheckable = true

            when(it.itemId){
                R.id.home -> {
                    replaceFragment(HomeFragment(),it.title.toString())
                }
                R.id.message -> {
                    replaceFragment(MessagesFragment(),it.title.toString())
                }
                R.id.settings -> {
                    replaceFragment(SettingsFragment(),it.title.toString())
                }

                R.id.login -> {
                    replaceFragment(SettingsFragment(),it.title.toString())
                }
            }

            true
        }
    }

    private fun replaceFragment(fragment: Fragment, title: String){
        val fragmentManager = supportFragmentManager
        val fragTrans = fragmentManager.beginTransaction()
        fragTrans.replace(R.id.frame_layout_1,fragment)
        fragTrans.commit()

        drawerLayout.closeDrawers()
        setTitle(title)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toogle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}