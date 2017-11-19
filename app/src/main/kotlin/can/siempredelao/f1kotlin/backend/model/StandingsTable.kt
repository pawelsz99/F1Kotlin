package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class StandingsTable(val driverId: String,
                     val driverStandings: String,
                     @SerializedName("StandingsLists") val standingsLists: List<StandingsList>)
