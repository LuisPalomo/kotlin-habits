package com.habitos.luis.habitossaludables

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.habit_detail.*

/**
 * Created by kotlin on 22/03/2018.
 */
class DetailActivity : LogActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.habit_detail)
        imageView.setImageResource(intent.getIntExtra("icon", 0))
        editText.setText(intent.getStringExtra("nombre"))
        editText2.setText(intent.getStringExtra("desc"))

    }

    fun goBack(v: View) {
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("HABIT_APP", "Detalle destruido")
    }

    fun callProvider(view: View ) {
        val action = Intent(Intent.ACTION_CALL)
        action.data = Uri.parse("tel:" + 685151543)
        startActivity(action)
    }
}