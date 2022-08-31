    package com.example.madpractical2_20012011192

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.util.Log
    import android.widget.Toast
    import com.google.android.material.snackbar.Snackbar

    class MainActivity : AppCompatActivity() {
        val tag = "MainActivity"
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            Toast.makeText(this, "onCreate function Called", Toast.LENGTH_SHORT).show()
            Snackbar.make(findViewById(R.id.myLayout),"onCreate function called",Snackbar.LENGTH_SHORT).show()
            Log.i(tag,"onCreate function called.")
        }

        override fun onStart() {
            super.onStart()
            Toast.makeText(this, "onStart function Called", Toast.LENGTH_SHORT).show()
            Snackbar.make(findViewById(R.id.myLayout),"onStart function called",Snackbar.LENGTH_SHORT).show()
            Log.i(tag,"onStart function called.")
        }

        override fun onResume() {
            super.onResume()
            Toast.makeText(this, "onResume function Called", Toast.LENGTH_SHORT).show()
            Snackbar.make(findViewById(R.id.myLayout),"onResume function called",Snackbar.LENGTH_SHORT).show()
            Log.i(tag,"onResume function called.")
        }

        override fun onRestart() {
            super.onRestart()
            Toast.makeText(this, "onRestart function Called", Toast.LENGTH_SHORT).show()
            Snackbar.make(findViewById(R.id.myLayout),"onRestart function called",Snackbar.LENGTH_SHORT).show()
            Log.i(tag,"onRestart function called.")
        }

        override fun onPause() {
            super.onPause()
            Toast.makeText(this, "onPause function Called", Toast.LENGTH_SHORT).show()
            Snackbar.make(findViewById(R.id.myLayout),"onPause function called",Snackbar.LENGTH_SHORT).show()
            Log.i(tag,"onPause function called.")
        }

        override fun onStop() {
            super.onStop()
            Toast.makeText(this, "onStop function Called", Toast.LENGTH_SHORT).show()
            Snackbar.make(findViewById(R.id.myLayout),"onStop function called",Snackbar.LENGTH_SHORT).show()
            Log.i(tag,"onStop function called.")
        }

        override fun onDestroy() {
            super.onDestroy()
            Toast.makeText(this, "onDestroy function Called", Toast.LENGTH_SHORT).show()
            Snackbar.make(findViewById(R.id.myLayout),"onDestroy function called",Snackbar.LENGTH_SHORT).show()
            Log.i(tag,"onDestroy function called.")
        }
    }