class SlujebDog(val _name:String,val _poroda:String,val _dlina:Double,val _okras:String,val _ves:Double, val _haracter:String, val mestoSlujbi:String) :Dog(_name,_poroda,_dlina,_okras,_ves,_haracter) {
    override fun Info(){
        println("Кличка: ${_name}\nПорода: ${_poroda}\nРост по холке: ${_dlina}\nОкрас: ${_okras}\nВес: ${_ves}\nХарактер: ${_haracter}\nМесто службы: ${mestoSlujbi}")
    }
    fun OpreGabariti(dlina:Double,ves:Double){
        print("Габориты собаки ${dlina*ves}")
    }
    fun vChelovechGod(vozrast:Int){
        println("Введите возраст собаки:")
    }
}