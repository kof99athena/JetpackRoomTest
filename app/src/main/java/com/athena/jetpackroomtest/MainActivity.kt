package com.athena.jetpackroomtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//mytask 1 : gradle에 어노테이션 설정 안해두면 어떻게 될까?? -> 안됨.. DAO등 사용해야함
//kapt는 내가 하던 방법으로 넣어두었는데, room에 맞춘건지 의문
//ksp는 kapt대신 사용하는 어노테이션. 구글은 이미 ksp를 권장하고있다. (아직은 databinding까지는 포함하지 않음)

//room의 3가지 주요 구성요소
//1. DB클래스
//2. 데이터 항목 :  데이터베이스 테이블
//3. DAO : Data Access Object

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //DB를 더 효율적으로 사용하기 : room
        //sqlite는 sql언어를 써서 DB를 다루는데, room은 그렇게 안해도 되고 함수로 불러올수도있다. 간편
    }
}