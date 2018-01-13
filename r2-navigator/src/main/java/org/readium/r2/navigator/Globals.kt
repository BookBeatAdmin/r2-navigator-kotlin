package org.readium.r2.navigator

import android.content.Context
import android.support.annotation.ColorInt
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat

/**
 * Created by aferditamuriqi on 10/3/17.
 */


/**
 * Global Parameters
 */
val PORT_NUMBER = 3333
val BASE_URL = "http://localhost"
val SERVER_URL = "$BASE_URL:$PORT_NUMBER"
//val MANIFEST = "/manifest"



/**
 * Extensions
 */

@ColorInt
fun Context.color(@ColorRes id: Int): Int {
    return ContextCompat.getColor(this, id)
}