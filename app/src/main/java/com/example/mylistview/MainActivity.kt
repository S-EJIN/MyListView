package com.example.mylistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mylistview.adapters.StudentListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    멤버 변수 선언
    val mStudenList = ArrayList<StudentData>()

//    어댑터 클래스 멤버변수화
    lateinit var mStudentListAdapter: StudentListAdapter

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

//  실제 어댑터와 ArrayList를 연결(어댑터 클래스를 객체화)
//        context는 화면을 나타내서 그냥 activity를 던져주면 된다(이화면이야!)
//        여기서, 리스트 화면에, 만든 데이터를 던진다
        mStudentListAdapter = StudentListAdapter(this, R.layout.student_list_item, mStudenList)

//        액티비티 화면의 listview 태그와 adapter를 연결
        mainListView.adapter = mStudentListAdapter

//        리스트뷰 한줄에 대한 클릭 이벤트 처리. i는 한칸 포지션에 대한 인스턴스 번호 = position
        mainListView.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this, "${position}번째 아이템입니다", Toast.LENGTH_SHORT).show()
        }

//        리스트뷰 한 줄에 대한 롱크릭 이벤트 처리
        mainListView.setOnItemLongClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "${i}번째 아이템 롱클릭 이벤트", Toast.LENGTH_SHORT).show()
            return@setOnItemLongClickListener(true)
        }
    }
}