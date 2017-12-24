package can.siempredelao.f1kotlin

import android.content.Context
import java.net.UnknownHostException

class DefaultErrorParser(val context: Context) : ErrorParser {

    override fun parse(throwable: Throwable): String = when (throwable) {
        is UnknownHostException -> context.getString(R.string.slow_internet_connection)
        else                    -> "Unknown error"
    }

}