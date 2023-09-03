package com.athena.jetpackroomtest.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


//테이블을 만들자. 사이코솔저팀의 프로필을 보여주고싶다. 이름/국적/기술
//어노테이션쓰고싶다면 gradle에 추가해놓고 사용해야함.

@Entity //tableName을 설정할 수 있다.
data class PsTeam(
    var name : String,
    var nation : String,
    var abillity : String
){
    @PrimaryKey(autoGenerate = true) var id: Int = 0
    //프라이머리키를 다른거로 할순없을까?
    //프라이머리키가 이해안감
    //autogenerate하면 자동증가함

}

//엔티티란?
//DB에 저장할 데이터 형식으로 class의 변수를 지정한다.
//tableName을 설정할 수 있다. 선언하지않으면 class이름으로 인식한다.
//@PrimaryKey : 각 엔티티마다 1개 이상을 갖고 있어야한다.

//@ColumnInfo : table내의 컬럼변수에 매칭시켜준다.