package DanielFranceschi.com.github.myapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import DanielFranceschi.com.github.myapplication.model.ItemModel


@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao
}