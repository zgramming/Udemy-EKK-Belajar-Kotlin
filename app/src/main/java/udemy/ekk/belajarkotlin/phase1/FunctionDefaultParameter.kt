package udemy.ekk.belajarkotlin.phase1

fun calculateHerLikeYou(yourTotalEffort: Int = 0): String {
    if (yourTotalEffort <= 0) return "Mana dia suka, lunya ga ada usaha";
    val chance = (0..100).random();
    return "Her chance like you is $chance%"
}

fun main(){
    println(calculateHerLikeYou(0));
    println(calculateHerLikeYou(2));
    println(calculateHerLikeYou(4));
}