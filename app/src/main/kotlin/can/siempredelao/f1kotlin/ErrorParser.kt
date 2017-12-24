package can.siempredelao.f1kotlin

interface ErrorParser {

    fun parse(throwable: Throwable): String
}