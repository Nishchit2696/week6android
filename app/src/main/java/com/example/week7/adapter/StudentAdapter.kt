package com.example.week7.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.week7.R
import com.example.week7.module.Student
import de.hdodenhof.circleimageview.CircleImageView

class StudentAdapter(
    val studentList: ArrayList<Student>,
    val context: Context
) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    class  StudentViewHolder(view: View): RecyclerView.ViewHolder(view){
        val profile : CircleImageView
        val tv_name: TextView
        val tv_age: TextView
        val tv_gender: TextView
        val tv_address: TextView
        val bt_Delet: Button
        init {
            profile = view.findViewById(R.id.imgProfile)
            tv_name = view.findViewById(R.id.tvName)
            tv_age = view.findViewById(R.id.tvAddress)
            tv_gender = view.findViewById(R.id.tvage)
            tv_address = view.findViewById(R.id.tvGender)
            bt_Delet = view.findViewById(R.id.Delet)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_student_layout, parent, false)
        return  StudentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = studentList[position]
        holder.tv_name.text=student.Name
        holder.tv_age.text=student.Age.toString()
        holder.tv_address.text=student.Address
        holder.tv_gender.text=student.Gender
        holder.bt_Delet.setOnClickListener {
            studentList.removeAt(position)
            notifyDataSetChanged()
        }

    }
}