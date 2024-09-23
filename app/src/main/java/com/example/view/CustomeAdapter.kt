package com.example.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomeAdapter (var context:Context, var mangMonAn:ArrayList<Mon>): BaseAdapter() {
    class ViewHolder (row:View){
        var textviewTenMonAn: TextView
        var imageView:ImageView

        init{
            textviewTenMonAn = row.findViewById(R.id.tenmonan) as TextView
            imageView = row.findViewById(R.id.imagean) as ImageView
        }
    }
    override fun getCount(): Int {
        return mangMonAn.size
    }

    override fun getItem(position: Int): Any {
        return mangMonAn.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong();
    }

    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
        var view:View?
        var viewHolder : ViewHolder
        if(convertView == null){
            var layinFlaster:LayoutInflater = LayoutInflater.from(context)
            view = layinFlaster.inflate(R.layout.dong_monan, null)
            viewHolder = ViewHolder(view)
        }else {
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }
        var monAn:Mon = getItem(position) as Mon
        viewHolder.textviewTenMonAn.text = monAn.ten
        viewHolder.imageView.setImageResource(monAn.image)

        return view as View
    }
}