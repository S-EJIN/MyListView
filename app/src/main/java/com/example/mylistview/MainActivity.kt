package com.example.mylistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
//    멤버 변수 선언
    val mStudenList = ArrayList<StudentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생 데이터(더미 데이터 생성)
//        StudentData(~~~)라는 학생 데이터 객체들을 생성
//        ArrayList에 추가
        mStudenList.add(StudentData("김민철1", 1990,"서울시 서대문구"))
        mStudenList.add(StudentData("김민철2", 1990,"서울시 서대문구"))
        mStudenList.add(StudentData("김민철3", 1990,"서울시 서대문구"))
        mStudenList.add(StudentData("김민철4", 1990,"서울시 서대문구"))
        mStudenList.add(StudentData("김민철5", 1990,"서울시 서대문구"))
        mStudenList.add(StudentData("김민철6", 1990,"서울시 서대문구"))
        mStudenList.add(StudentData("김민철7", 1990,"서울시 서대문구"))
        mStudenList.add(StudentData("김민철8", 1990,"서울시 서대문구"))
        mStudenList.add(StudentData("김민철9", 1990,"서울시 서대문구"))
        mStudenList.add(StudentData("김민철10", 1990,"서울시 서대문구"))





    }
}