package com.athena.jetpackroomtest.database

import androidx.room.Entity
import androidx.room.PrimaryKey


//테이블을 만들자. 사이코솔저팀의 프로필을 보여주고싶다. 이름/국적/기술
//어노테이션쓰고싶다면 gradle에 추가해놓고 사용해야함.

@Entity
data class PsTeam(
    var name : String,
    var nation : String,
    var abillity : String
){
    @PrimaryKey(autoGenerate = true) var id: Int = 0
    //프라이머리키를 다른거로 할순없을까?
    //프라이머리키가 이해안감

}
