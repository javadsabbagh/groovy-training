
//def name = 'ali'
//
//println "$name"

abstract class Car {
    abstract String getName();
}

class Mercedes extends Car {

    @Override
    String getName() {
        "mercedes"
    }
}

Car c = new Mercedes()
println c.getName()
