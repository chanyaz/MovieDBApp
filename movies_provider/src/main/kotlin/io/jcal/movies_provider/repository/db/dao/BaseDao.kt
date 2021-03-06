package io.jcal.movies_provider.repository.db.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Update

interface BaseDao<T> {

    @Insert(onConflict = IGNORE)
    fun insert(entity: T): Long

    @Insert(onConflict = IGNORE)
    fun insertAll(entities: List<T>): List<Long>

    @Insert(onConflict = REPLACE)
    fun upsert(entity: T): Long

    @Update(onConflict = REPLACE)
    fun update(entity: T): Int

    @Delete
    fun delete(entity: T)
}