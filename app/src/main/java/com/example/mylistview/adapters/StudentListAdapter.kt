package com.example.mylistview.adapters
//학생의 목록을 보여주는 adapter
import android.content.Context
import android.widget.ArrayAdapter
import com.example.mylistview.StudentData

//    상속 : 이미 만들어진 클래스의 개념을 사용
class StudentListAdapter(val mContext : Context, val resId : Int, val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList)
{

}