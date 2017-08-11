package be.guyheylens.functions

fun main(args: Array<String>) {

    val newTime = Time(10,40) + Time(3,30)
    println(newTime)

}


data class Time(val hours: Int, val mins: Int){
    operator fun plus(time: Time): Time{
        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }




}