import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    try {
        println("Введите количество служебных собак: ")
        var count = readLine()!!.toInt()
        when{
            count <=0 -> count = 1
            else -> count
        }

        GlobalScope.launch {
            for(i in 1..count){
                println("Введите кличку, породу, рост по холке, окрас шерсти, вес, характер, место работы")
                val newSobaka = SlujebDog(readLine().toString(),readLine().toString(),readLine()!!.toDouble(),readLine().toString(),readLine()!!.toDouble(),readLine().toString(),readLine().toString())
                newSobaka.Info()
                newSobaka.OpreGabariti(newSobaka.dlina, newSobaka.ves)
            }
        }
        runBlocking {
            delay(25000L)
        }
    }
    catch (e:Exception){
        println("Неверный формат")
    }
}