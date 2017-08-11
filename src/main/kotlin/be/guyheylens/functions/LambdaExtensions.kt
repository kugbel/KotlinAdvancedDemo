package be.guyheylens.functions




//Simulation of a HTTP server
class Request(val method: String, val query : String , val contentType: String)
class Response(val contents: String, val status: String)


class RouteHandler(val request: Request, val response: Response){
    var executeNext = false

    fun next(){
        executeNext = true
    }
}



//lambda extension .()

fun routeHandler(f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main(args: Array<String>) {
    /*routeHandler{
        request
    }*/
    
    val manager = Manager()
    manager("Go Do Something")
}


class Manager{
    operator fun  invoke(value: String) {}

}