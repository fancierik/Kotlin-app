package com.example.practic
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Insert
    fun insertItem(item: Item)

    @Query("SELECT * FROM items")
    fun getAllItem(): Flow<List<Item>>

    @Query("DELETE FROM items")
    fun deleteAllItem()

}