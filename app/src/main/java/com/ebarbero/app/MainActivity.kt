
package com.ebarbero.app

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {

super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)

Toast.makeText(this,"e.Barbero PRO pronto",Toast.LENGTH_LONG).show()

}

}
