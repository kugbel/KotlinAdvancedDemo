package be.guyheylens.classes

class DirectoryExplorer(){

    class PermissionCheck {
        fun validatePermission(user: String){
        }
    }

    fun listFolder(folder: String, user: String){
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission(user)
    }
}


fun main(args: Array<String>) {

    val de = DirectoryExplorer()
    val pc = DirectoryExplorer.PermissionCheck()
}

