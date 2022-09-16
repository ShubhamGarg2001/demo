package com.example.viewadapters

import android.content.Context
import android.widget.Toast

class BaseAdapter {

    fun showToast(context: Context){
        Toast.makeText(context,"Toast",Toast.LENGTH_SHORT).show()
    }
}
