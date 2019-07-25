class Cheetah: Feline(){
    override val image = "Cheetah.jpg"
    override val food = "meat"
    override val habitat = "Plain"

    override fun makeNoise(){
        println("Grrrrr")
    }

    override fun eat(){
        println("The Cheetah is eating $food")
    }

    override fun habitat(){
        println("The Cheetah is in $habitat")
    }

}
