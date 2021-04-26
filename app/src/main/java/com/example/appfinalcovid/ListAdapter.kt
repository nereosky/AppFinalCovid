package com.example.appfinalcovid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class ListAdapter(private val context: Context, var pays: Array<String>, var cas: Array<String>,
                  var mort: Array<String>, var reco: Array<String>): BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
        var view : View? = p1
            val viewHolder : ViewHolder

        if(view == null){
            viewHolder = ViewHolder()
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.adapter_item, null, true)

            viewHolder.pays = view.findViewById(R.id.pays_name)
            viewHolder.cas = view.findViewById(R.id.active_cases)
            viewHolder.mort = view.findViewById(R.id.deaths)
            viewHolder.reco = view.findViewById(R.id.recovered)

            view.tag = viewHolder
        }
        else{
            viewHolder =view.tag as ViewHolder
        }

        viewHolder.pays?.text = pays[p0]
        viewHolder.cas?.text = cas[p0]
        viewHolder.mort?.text = mort[p0]
        viewHolder.reco?.text = reco[p0]

        return view
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    private inner class ViewHolder{
        var pays: TextView ? = null
        var cas: TextView ? = null
        var mort: TextView ? = null
        var reco: TextView ? = null
    }
}