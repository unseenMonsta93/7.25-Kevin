class Lion: Feline(){
    override val image = "Lion jpeg"
    override val habitat = "Plain"
    override val food = "meat"

    override fun makeNoise(){
        println("Roar")
    }

    override fun eat(){
        println("The Lion is eating $food")
    }

    override fun habitat(){
        println("The Lion is in $habitat")
    }
}

