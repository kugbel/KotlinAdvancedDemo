package be.guyheylens.classes

interface Repository{
    fun getAll(): List<Customer>
}


class CustomerController(){
    lateinit var repo: Repository

    fun index(): String {
        return repo.getAll().toString()
    }
}