import java.lang.reflect.Constructor

fun <T> foo(constructor: Constructor<T>, args: Array<Any>) {
    constructor.newInstance(*args)
}