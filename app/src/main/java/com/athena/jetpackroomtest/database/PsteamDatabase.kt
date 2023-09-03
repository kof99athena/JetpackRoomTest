package com.athena.jetpackroomtest.database

import androidx.room.Database
import androidx.room.RoomDatabase


//엔터티는 [PsTeam::class]을 사용할것이다.
@Database(entities = [PsTeam::class], version = 1)
abstract class PsteamDatabase: RoomDatabase() {

    abstract fun memberDao(): MemberDao
    //memberDao에는 name을 조작하는 메소드들이 들어있다.

}

//룸데이터베이스
//데이터 베이스의 전체 소유자 역할, DB생성 , 버전관리를 한다.
//리사이클러뷰의 아탑터같은 느낌. 엔티티만큼 정의된 DAO객체를 반환할 수있는 그런 함수들을 갖고잇는 추상 class형태로 정의되어있다
//룸 DB에서 DAO를 가져오고, 객체를 통해 데이터를 CRUD해서 가져온다.
//@Database : 클래스가 데이터베이스임을 알려주는 어노테이션이다. 파라미터로는 entities : 어떤 테이블을 명시하는지
//version은 스키마다 바뀔때마다 바뀐다.
