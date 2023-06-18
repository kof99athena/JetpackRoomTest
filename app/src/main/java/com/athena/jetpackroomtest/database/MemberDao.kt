package com.athena.jetpackroomtest.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert


//속성을 다루는 객체집사 DAO(데이터 액세스 오브젝트)
//이제 집사에게 필요하면 insert와 delete를 시킬것이다.

//인터페이스는 기능은 없고 이름만 있는 추상메소드만 가진것 -> 규격화해준것임
//나중에 액티비티에서 그 기능을 내가 적을거임. 헷갈리니까 메소드 이름만 규격화해두자

@Dao
interface MemberDao{
    @Insert
    fun insert(name:PsTeam)
    //PsTeam에 name 데이터 추가

    @Delete
    fun delete(name:PsTeam)
    //PsTeam에 name 데이터 삭제
}
