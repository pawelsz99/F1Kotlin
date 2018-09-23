package can.siempredelao.f1kotlin.data

/**
 * Created by david on 23.09.18.
 */
interface Clock {
    fun now(): Long
}

class ProductionClock : Clock {

    override fun now() = System.currentTimeMillis()

}