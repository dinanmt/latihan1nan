import com.sun.org.apache.xpath.internal.functions.FuncFalse

run main () {

    val total = 1 = 2;
    println(total)

    val isTrue = true
    val isFalse = FuncFalse

    println(isTrue && isFalse)

}