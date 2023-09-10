fun main(args: Array<String>) {
   //Задание 1
    /*создали константу под названием age1, которая равна 42. Создали
константу age2, которая равна 21. Проверили, используя Control + Shift +
P, что тип обоих был правильно выведен как Int*/

   val age1 = 42
   val age2 = 21

    //Задание 2
    /*создали константу avg1, ее значением должно быть среднее
арифметическое age1 и age2. Использовали Control + Shift + P, чтобы
проверить тип и проверить результат avg1.Ответ целочисленный */

    val avg1 = (age1 + age2) / 2
    println(avg1)

    //Задание 3
    /*преобразовали age1 и age2 в нужный тип */

    val avg2 = (age1.toDouble() + age2.toDouble()) / 2
    println(avg2)

    //Задание 4
    /**/
    val firstName = "Dana"
    val lastName = "Djarkas"


    //Задание 5
    /*разделили две константы пробелом*/

    val  fullName =  firstName + " "  + lastName
    println(fullName)

    //Задание 6
    /*создали строковую константу
myDetails, которая использует константу fullName*/

    val myDetails = "Hey, my name is " + fullName
    println(myDetails)

    //Задание 7
    /*Объявили константу Triple, которая содержит три значения Int. (месяц, день, год)*/

    val Triple : Triple < Int , Int , Int > = Triple (9, 8, 2023)
    println(Triple)

   //Задание 8
    /*Извлекли значения из Triple в три константы с названиями month, day и year*/

   //val month = Triple.first
   val day = Triple.second
   // val year = Triple.third
   println(Triple)

    //Задание 9
    /*Через одну строку вывели значения месяца и года в две константы*/

    var (month , _ , year) = Triple

    //Задание 10
    /* изменили значение месяца и создали новую Pair, содержащую измененный месяц
вместе с не измененным годом*/

    val data = Pair <Int , Int > (6 , year)
    println(data)

}