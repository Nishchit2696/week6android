package com.example.week7.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import com.example.week7.R
import com.example.week7.module.Student
import com.example.week7.module.StudentList

class SecondFragment : Fragment() {
    private lateinit var username: EditText
    private lateinit var age: EditText
    private lateinit var address: EditText
    private lateinit var radiomale: RadioButton
    private lateinit var radiofemale: RadioButton
    private lateinit var radioother: RadioButton
    private lateinit var submit: Button
    private var gender=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        username=view.findViewById(R.id.username)
        age=view.findViewById(R.id.age)
        address=view.findViewById(R.id.address)
        radiomale=view.findViewById(R.id.radioMale)
        radiofemale=view.findViewById(R.id.radioFemale)
        radioother=view.findViewById(R.id.radioother)
        submit=view.findViewById(R.id.submit)
        radiomale.setOnClickListener {
            gender = "male"
        }
        radiofemale.setOnClickListener {
            gender = "female"
        }
        radioother.setOnClickListener {
            gender = "other"
        }
        submit.setOnClickListener {
            val student= Student(username.text.toString(), age.text.toString().toInt(),gender, address.text.toString())
            StudentList.addStudent(student)
            username.setText("")
            age.setText("")
            address.setText("")
        }
        return view
    }


}