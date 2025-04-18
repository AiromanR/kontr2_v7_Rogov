abstract class Dog(override val name: String, val poroda:String, val dlina:Double,val okras: String, override val ves:Double,override val haracter: String): Animal {
    open fun Info(){

    }
}