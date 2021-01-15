package com.example.week7.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.week7.R
import com.example.week7.adapter.StudentAdapter
import com.example.week7.module.StudentList


class FirstFragment : Fragment() {
    private lateinit var viewStudent: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)
        viewStudent = view.findViewById(R.id.viewStudent)
        val studentAdapter = StudentAdapter(StudentList.showStudent(), context!!)
        viewStudent.layoutManager = LinearLayoutManager(context)
        viewStudent.adapter=studentAdapter
        return view
    }


}