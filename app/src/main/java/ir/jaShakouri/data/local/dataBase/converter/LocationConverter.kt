package ir.jaShakouri.data.local.dataBase.converter

import com.google.gson.Gson
import ir.jaShakouri.domain.model.Location

object LocationConverter {

    @JvmStatic
    fun toString(location: Location): String {
        return Gson().toJson(location)
    }

    @JvmStatic
    fun toLocation(string: String): Location {
        return Gson().fromJson(string, Location::class.java)
    }

}