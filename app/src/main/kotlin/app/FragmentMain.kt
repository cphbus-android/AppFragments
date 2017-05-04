package app

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.R
import kotlinx.android.synthetic.main.fragment_main.*

class FragmentMain : Fragment()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        buttonFragmentNew.setOnClickListener { fragmentNew() }
    }

    fun fragmentNew()
    {
        fragmentManager.beginTransaction().replace(R.id.contentFragment, FragmentNew()).commit()
    }
}