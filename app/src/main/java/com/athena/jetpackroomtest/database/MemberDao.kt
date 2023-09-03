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
    //인서트는 엔티티에 set을 삽입하게되고, 엔티티의 어노테이션에 정의된 class만 인자로 받는다.
    //충돌 정책도 잡을 수 있다.
    fun insert(name:PsTeam)
    //PsTeam에 name 데이터 추가

    @Delete
    fun delete(name:PsTeam)
    //PsTeam에 name 데이터 삭제
}

//다오는 데이터베이스에 접근하여 실행할 작업을 메소드형테로 정의한다.
//SQL쿼리를 지정가능하다
//@Update,@Query 등등
//@Query는 쿼리를 사용해서 DB를 조회 할 수 있다. 컴파일 타임에 리턴되는 오브젝트의 필드와
//SQL 결과로 나온 컬럼의 이름이 맞는지 여부를 확인해서
//맞으면 워닝, 아니면 에러를 보낸다.










