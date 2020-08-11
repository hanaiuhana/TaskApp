package jp.techacademy.yui.tanakayui.taskapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class TaskAdapter(context: Context) : BaseAdapter() {
    private val mLayoutInflater: LayoutInflater
//    var taskList = mutableListOf<String>()
    var taskList = mutableListOf<Task>()

    init{
        this.mLayoutInflater = LayoutInflater.from(context)
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: mLayoutInflater.inflate(android.R.layout.simple_list_item_2, null)

        val textView1 = view.findViewById<TextView>(android.R.id.text1)
        val textView2 = view.findViewById<TextView>(android.R.id.text2)

        textView1.text = taskList[position].title

        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.JAPANESE)
        val date = taskList[position].date
        textView2.text = simpleDateFormat.format(date)

        return view

    }

    override fun getItem(position: Int): Any {
//        TODO("Not yet implemented")
        return taskList[position]
    }

    override fun getItemId(position: Int): Long {
//        TODO("Not yet implemented")
        return 0
    }

    override fun getCount(): Int {
//        TODO("Not yet implemented")
        return taskList.size
    }

}