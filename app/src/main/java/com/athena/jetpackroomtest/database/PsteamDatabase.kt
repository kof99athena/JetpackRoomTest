package com.athena.jetpackroomtest.database

import androidx.room.Database
import androidx.room.RoomDatabase


//엔터티는 [PsTeam::class]을 사용할것이다.
@Database(entities = [PsTeam::class], version = 1)
abstract class PsteamDatabase: RoomDatabase() {

    abstract fun memberDao(): MemberDao
    //memberDao에는 name을 조작하는 메소드들이 들어있다.

}