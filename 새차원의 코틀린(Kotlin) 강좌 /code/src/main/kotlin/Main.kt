fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    var obj = Customer("kotlin");
    println(obj);

    test();
}

class Customer(name : String){
    init{
        println("이름 : $name");
    }
}