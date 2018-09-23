package can.siempredelao.f1kotlin.backend.model

import com.google.gson.annotations.SerializedName

/** Collection of manufacturers */
class MRDataManufacturers(val xmlns: String,
                          val series: String,
                          val url: String,
                          val limit: String,
                          val offset: String,
                          val total: String,
                          @SerializedName("ConstructorTable") val constructorTable: ConstructorTable)
