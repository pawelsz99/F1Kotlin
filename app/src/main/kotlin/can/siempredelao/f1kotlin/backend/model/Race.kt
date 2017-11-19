package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

class Race(val season: String,
           val round: String,
           val url: String,
           val raceName: String,
           @SerializedName("Circuit") val circuit: Circuit,
           val date: String,
           val time: String,
           @SerializedName("Results") val results: List<Result>,
           @SerializedName("QualifyingResults") val qualifyingResults: List<QualifyingResult>)
