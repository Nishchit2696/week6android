package com.example.week7.module

object StudentList {
    var lstStudent=ArrayList<Student>()
    fun showStudent(): ArrayList<Student> {
        return lstStudent
    }
    fun addStudent(student:Student){
        lstStudent.add(student)
    }
}