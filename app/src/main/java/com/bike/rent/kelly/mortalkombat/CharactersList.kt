package com.bike.rent.kelly.mortalkombat

import android.os.Build.VERSION_CODES
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_character.mRecyclerView

class CharactersList: AppCompatActivity() {
    var mCharacterAdapter: CharacterAdapter? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    lateinit var charactersList: ArrayList<Characters>

    @RequiresApi(VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)
        charactersList = ArrayList<Characters>()
        addInfo()
        mCharacterAdapter = CharacterAdapter(charactersList, this){row ->
            Toast.makeText(applicationContext, "You click a row", Toast.LENGTH_LONG).show()
        }
        layoutManager = LinearLayoutManager(this)
        mRecyclerView.layoutManager = layoutManager
        mRecyclerView.adapter = mCharacterAdapter
        mCharacterAdapter!!.notifyDataSetChanged()


    }


    @RequiresApi(VERSION_CODES.LOLLIPOP)
    fun addInfo(){
        var scroprion: Characters = Characters("scroprion", "Outworld", "Get Over Here", getDrawable(R.drawable.scropin))
        charactersList.add(scroprion)
        var subzero: Characters = Characters("Sub-Zero", "Outworld", "Ice Freeze", getDrawable(R.drawable.subzero))
        charactersList.add(subzero)
        var johnnyCage: Characters = Characters("Johnny Cage", "Earth", "Nut Punch", getDrawable(R.drawable.cage))
        charactersList.add(johnnyCage)
        var radien: Characters = Characters("Radien", "Unknown", "Superman", getDrawable(R.drawable.radien))
        charactersList.add(radien)
        var shang: Characters = Characters("Shang Tsung", "Outworld", "Soul Steal", getDrawable(R.drawable.shang))
        charactersList.add(shang)
        var kenshi: Characters = Characters("Kenshi", "Outworld", "Sword Throw", getDrawable(R.drawable.kenshi))
        charactersList.add(kenshi)
        var cassie: Characters = Characters("Cassie Cage", "Earth", "Rings of Saturan", getDrawable(R.drawable.cassie))
        charactersList.add(cassie)
        var scroprion1: Characters = Characters("scroprion", "Outworld", "Get Over Here", getDrawable(R.drawable.scropin))
        charactersList.add(scroprion)
        var subzero1: Characters = Characters("Sub-Zero", "Outworld", "Ice Freeze", getDrawable(R.drawable.subzero))
        charactersList.add(subzero)
        var johnnyCage1: Characters = Characters("Johnny Cage", "Earth", "Nut Punch", getDrawable(R.drawable.cage))
        charactersList.add(johnnyCage)
        var radien1: Characters = Characters("Radien", "Unknown", "Superman", getDrawable(R.drawable.radien))
        charactersList.add(radien)
        var shang1: Characters = Characters("Shang Tsung", "Outworld", "Soul Steal", getDrawable(R.drawable.shang))
        charactersList.add(shang)
        var kensh1i: Characters = Characters("Kenshi", "Outworld", "Sword Throw", getDrawable(R.drawable.kenshi))
        charactersList.add(kenshi)
        var cassie1: Characters = Characters("Cassie Cage", "Earth", "Rings of Saturan", getDrawable(R.drawable.cassie))
        charactersList.add(cassie)
        var scroprion2: Characters = Characters("scroprion", "Outworld", "Get Over Here", getDrawable(R.drawable.scropin))
        charactersList.add(scroprion)
        var subzero2: Characters = Characters("Sub-Zero", "Outworld", "Ice Freeze", getDrawable(R.drawable.subzero))
        charactersList.add(subzero)
        var johnnyCage2: Characters = Characters("Johnny Cage", "Earth", "Nut Punch", getDrawable(R.drawable.cage))
        charactersList.add(johnnyCage)
        var radien2: Characters = Characters("Radien", "Unknown", "Superman", getDrawable(R.drawable.radien))
        charactersList.add(radien)
        var shang2: Characters = Characters("Shang Tsung", "Outworld", "Soul Steal", getDrawable(R.drawable.shang))
        charactersList.add(shang)
        var kenshi2: Characters = Characters("Kenshi", "Outworld", "Sword Throw", getDrawable(R.drawable.kenshi))
        charactersList.add(kenshi)
        var cassie2: Characters = Characters("Cassie Cage", "Earth", "Rings of Saturan", getDrawable(R.drawable.cassie))
        charactersList.add(cassie)
        var scroprion3: Characters = Characters("scroprion", "Outworld", "Get Over Here", getDrawable(R.drawable.scropin))
        charactersList.add(scroprion)
        var subzero3: Characters = Characters("Sub-Zero", "Outworld", "Ice Freeze", getDrawable(R.drawable.subzero))
        charactersList.add(subzero)
        var johnnyCage3: Characters = Characters("Johnny Cage", "Earth", "Nut Punch", getDrawable(R.drawable.cage))
        charactersList.add(johnnyCage)
        var radien3: Characters = Characters("Radien", "Unknown", "Superman", getDrawable(R.drawable.radien))
        charactersList.add(radien)
        var shang3: Characters = Characters("Shang Tsung", "Outworld", "Soul Steal", getDrawable(R.drawable.shang))
        charactersList.add(shang)
        var kenshi3: Characters = Characters("Kenshi", "Outworld", "Sword Throw", getDrawable(R.drawable.kenshi))
        charactersList.add(kenshi)
        var cassie3: Characters = Characters("Cassie Cage", "Earth", "Rings of Saturan", getDrawable(R.drawable.cassie))
        charactersList.add(cassie)

    }

}