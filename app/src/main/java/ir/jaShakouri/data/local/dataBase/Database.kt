package ir.jaShakouri.data.local.dataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ir.jaShakouri.data.local.dataBase.converter.VenueConverter
import ir.jaShakouri.data.local.dataBase.dao.ItemDao
import ir.jaShakouri.domain.AppKeys
import ir.jaShakouri.domain.model.Item

@Database(entities = [Item::class], version = AppKeys.DataBaseVersion, exportSchema = false)
@TypeConverters(VenueConverter::class)
abstract class DataBase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}