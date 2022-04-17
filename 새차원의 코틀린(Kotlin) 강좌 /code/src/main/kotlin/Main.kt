fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    var obj = Customer();
    obj.fullname="kotlin"
    println(obj.fullname);

    test();
}

class Customer(){
    var fullname = ""
        get(){ return field }
        set(value) {field = value}
}