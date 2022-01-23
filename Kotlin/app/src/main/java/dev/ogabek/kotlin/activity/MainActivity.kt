package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.ViewPagerAdapter
import dev.ogabek.kotlin.fragment.PageOneFragment
import dev.ogabek.kotlin.fragment.PageTwoFragment

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var viewPagerAdapter: PagerAdapter
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        viewPager = findViewById(R.id.viewpager)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)


        (viewPagerAdapter as ViewPagerAdapter).add(PageOneFragment(), "Page 2")
        (viewPagerAdapter as ViewPagerAdapter).add(PageTwoFragment(), "Page 2")


        viewPager.adapter = viewPagerAdapter

        tabLayout = findViewById(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }
}