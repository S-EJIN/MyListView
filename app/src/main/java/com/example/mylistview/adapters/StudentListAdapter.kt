package com.example.mylistview.adapters
//학생의 목록을 보여주는 adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.mylistview.R
import com.example.mylistview.StudentData

//    상속 : 이미 만들어진 클래스의 개념을 사용
class StudentListAdapter(val mContext : Context, val resId : Int, val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList)
{
//    한 칸의 xml에 나타날 모양을 커스터마이징
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//    convertView는 listview의 한 칸이라고 보면 된다
        var tempRow = convertView
        if(tempRow == null){
            //val은 변화가 안되는데 tempRow를 바꾸면 에러가 뜨니 tempRow변수는 val이아닌 var을 사용
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!
//        !! 두개 박으면 null값 안들어간다는 뜻

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)

//      mList[Position] => mList의 position번째 있는 StudentData
        nameTxt.text = mList[position].name
        ageTxt.text = mList[position].birthYear.toString()
        addressTxt.text = mList[position].address

        return row
    }

}