package com.example.androidhomework1.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.androidhomework1.R
import com.example.androidhomework1.fragments.F1A2
import com.example.androidhomework1.fragments.F2A2
import com.example.androidhomework1.fragments.F3A2
import com.example.androidhomework1.interfaces.ActivityFragmentComunication

class SecondActivity() : AppCompatActivity() , ActivityFragmentComunication {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        addInitialFragment();
    }

    fun addInitialFragment()
    {
        val fragmentManager = supportFragmentManager;
        val transaction = fragmentManager.beginTransaction();
        val tag = F1A2::class.java.name;
        val addTransaction = transaction.add(
                R.id.frame_layout_id,F1A2.newInstance(),tag
        )
        addTransaction.commit();
    }
    //on button click addFragment
    fun addSecondFragment()
    {
        val fragmentManager = supportFragmentManager;
        val transaction = fragmentManager.beginTransaction();
        val tag = F2A2::class.java.name;
        val addTransaction = transaction.add(
                R.id.frame_layout_id,F2A2.newInstance(),tag
        )
        addTransaction.addToBackStack(tag);
        addTransaction.commit();
    }


    fun load_f2a2_click(view: View)
    {
        addSecondFragment();
    }

    override fun openActivity() {
        TODO("Not yet implemented")
    }

    override fun finishActivity() {
        this.finish();
    }

    override fun removeFromStack() {
        val fragmentManager = supportFragmentManager;
        if (fragmentManager.backStackEntryCount > 0){
            Log.i("SecondActivity","popping");
            fragmentManager.popBackStack();
        }
    }


    override fun replaceWithThirdFragment()
    {
        val fragmentManager = supportFragmentManager;
        val transaction = fragmentManager.beginTransaction();
        val tag = F2A2::class.java.name;
        val replaceTransaction = transaction.replace(
                R.id.frame_layout_id,F3A2.newInstance(),tag
        )
        replaceTransaction.commit();
    }

    override fun onBackPressed() {
        val a = Intent(Intent.ACTION_MAIN)
        a.addCategory(Intent.CATEGORY_HOME)
        a.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(a)
    }
}