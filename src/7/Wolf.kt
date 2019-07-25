class Wolf: Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise(){
        println("Hoooooowl")
    }

    override fun eat(){
        println("The Wolf is eating $food")
    }

    override fun habitat(){
        println("The Wolf is in $habitat")
    }

}
