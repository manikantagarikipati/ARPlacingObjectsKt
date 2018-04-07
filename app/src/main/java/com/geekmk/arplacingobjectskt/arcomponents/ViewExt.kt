package com.geekmk.arplacingobjectskt.arcomponents

import android.view.View
import android.widget.Toast

/**
 * Created by manikanta.garikipati on 07/04/18.
 */

fun View.showMessage(msg:String,duration:Int = Toast.LENGTH_SHORT){
    Toast.makeText(context,msg,duration).show()
}