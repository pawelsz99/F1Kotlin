package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class MRDataRaces(val xmlns: String,
                  val series: String,
                  val url: String,
                  val limit: String,
                  val offset: String,
                  val total: String,
                  @SerializedName("RaceTable") val raceTable: RaceTable)
