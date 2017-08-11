package be.guyheylens.delegates


fun localDelegatedProperties(){
    val lazy by lazy { initLate() }
}

fun initLate(): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
