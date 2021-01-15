package com.example.week7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.week7.adapter.ViewPagerAdapter
import com.example.week7.fragment.FirstFragment
import com.example.week7.fragment.SecondFragment
import com.example.week7.fragment.ThirdFragment
import com.example.week7.module.Student
import com.example.week7.module.StudentList
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class DashboardActivity : AppCompatActivity() {
    private var titleList=ArrayList<String>()
    private var fragmentList=ArrayList<Fragment>()
    private lateinit var viewPager: ViewPager2
    private lateinit var TabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        viewPager=findViewById(R.id.viewPager)
        TabLayout=findViewById(R.id.TabLayout)
        loadTitle()
        loadFragment()
        loadStudent()

        val adapter = ViewPagerAdapter(fragmentList,supportFragmentManager,lifecycle)
        viewPager.adapter = adapter
        TabLayoutMediator(TabLayout,viewPager){ tab, position -> tab.text=titleList[position] }.attach()
    }
    private fun loadFragment(){
        fragmentList.add(FirstFragment())
        fragmentList.add(SecondFragment())
        fragmentList.add(ThirdFragment())
    }
    private fun loadTitle(){
        titleList.add("Home")
        titleList.add("Add Student")
        titleList.add("About Us")
    }
    private fun loadStudent(){
        StudentList.addStudent(Student("Bhanubhakta Bhandari",24, "male", "chabel"))
        StudentList.addStudent(Student("Sabin Chapagain",13, "male", "jhapa"))
        StudentList.addStudent(Student("Unish Bhattrai",45, "male", "damak"))
    }
}