class Lynx: Feline(){
    override val image = "Lynx.jpg"
    override val food = "meat"
    override val habitat = "mountains"

    override fun makeNoise(){
        println("Meow")
    }

    override fun eat(){
        println("The Lynx is eating $food")
    }

    override fun habitat(){
        println("The Lynx is in $habitat")
    }

}


