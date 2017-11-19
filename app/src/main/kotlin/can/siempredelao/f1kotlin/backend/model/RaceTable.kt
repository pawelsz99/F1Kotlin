package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class RaceTable(val season: String,
                val round: String,
                val fastest: String,
                val position: String,
                val driverId: String,
                val constructorId: String,
                val grid: String,
                @SerializedName("Races") val races: List<Race>)
