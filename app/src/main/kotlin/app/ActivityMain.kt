package app

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class ActivityMain : Activity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        maintop.text = "Fragments"

        if (savedInstanceState == null)
        {
            fragmentManager.beginTransaction().replace(R.id.contentFragment, FragmentMain()).commit()
        }
    }
}
