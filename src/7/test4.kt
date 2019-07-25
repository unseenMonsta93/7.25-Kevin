open class Animal {

    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun makeNoise(){
        println("The Animal is making a noise")
    }

    open fun eat(){
        println("The Animal is eating")
    }

    open fun roam(){
        println("The Animal is Roaming")
    }

    open fun habitat(){
        println("The Animal is somewhere")
    }

    fun sleep(){
        println("The Animal is sleeping")
    }
}