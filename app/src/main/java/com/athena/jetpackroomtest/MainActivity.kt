package com.athena.jetpackroomtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Room
import com.athena.jetpackroomtest.database.PsTeam
import com.athena.jetpackroomtest.database.PsteamDatabase


import com.athena.jetpackroomtest.databinding.ActivityMainBinding

//mytask 1 : gradle에 어노테이션 설정 안해두면 어떻게 될까?? -> 안됨.. DAO등 사용해야함
//kapt는 내가 하던 방법으로 넣어두었는데, room에 맞춘건지 의문
//ksp는 kapt대신 사용하는 어노테이션. 구글은 이미 ksp를 권장하고있다. (아직은 databinding까지는 포함하지 않음)

//room의 3가지 주요 구성요소
//1. DB클래스
//2. 데이터 항목 :  데이터베이스 테이블
//3. DAO : Data Access Object

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var db : PsteamDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //DB를 더 효율적으로 사용하기 : room
        //sqlite는 sql언어를 써서 DB를 다루는데, room은 그렇게 안해도 되고 함수로 불러올수도있다. 간편
        //하지만..! room이나 sqlite 둘 다 상황 판단하고 사용하는게 맞다.
        //(간단하게 만드는거면 sqlite로 하자. 굳이 room을 쓰면 피곤해진다. )

        db= Room.databaseBuilder(
            applicationContext,
            PsteamDatabase::class.java,
            "혜양이"
        ).allowMainThreadQueries()
            .build()

       // updateList()

        binding.btnSave.setOnClickListener {
            addMember()
            //updateList()
        }

    }//onCreate

    private fun addMember(){
        var name = binding.etName.text.toString()
        var nation = binding.etNation.text.toString()
        var abillity = binding.etAbillity.text.toString()

        db.memberDao().insert(PsTeam(name,nation,abillity))
    }



}


