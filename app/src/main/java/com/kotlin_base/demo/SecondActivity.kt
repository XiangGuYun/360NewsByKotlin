package com.kotlin_base.demo

import android.os.Bundle
import com.kotlin_base.R
import com.zoga.yun.kotlin.KotlinActivity
import com.zoga.yun.kotlin.LayoutId

@LayoutId(R.layout.activity_second)
class SecondActivity : KotlinActivity() {

    override fun init(bundle: Bundle?) {
        Triple(extraStr("name"), extraInt("age" to 1), extraBool("isMale" to false)).toast()
    }

}
