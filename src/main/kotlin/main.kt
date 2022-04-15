fun main(){
   students (listOf("blue","orange","yellow","red"))
   people (listOf(67,45,38,93,31))
    val z=Person("Joan",22,8,89)
    val t=Person("Marvin",7,6,70)
    val p=Person("Cate",21,26,54)
    val w=Person("Handel",24,9,76)

    val student= listOf(z,t,p,w)
    val sort= student.sortedByDescending { a->a.age}
    println(sort)
    var e=Person("Yugi",23,3,54)
    var f=Person("Phel",19,2,44)





}

fun students(colors:List<String>):List<String> {
    colors.forEachIndexed { index, s ->
        if (index % 2== 0) {
            println(s)
        }
    }
    return colors
}
fun people(heights:List<Int>):String{
    val average=heights.average()
    val sum=heights.sum()
    val x="$average,$sum"
    println(x)

    return x
}
data class Person(var name:String,var age:Int,var height:Int,var weight:Int)


data class Car(var mileage:Int,var registration:String)






