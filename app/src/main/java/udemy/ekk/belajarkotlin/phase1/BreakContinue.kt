package udemy.ekk.belajarkotlin.phase1

fun main(){

	var i = 0;

	while(true){
		i++

		if(i > 1000) break;
		println("Index ke-$i")
	}


	/// Continue 

	for(j in 0..1000){

		if(j % 2 == 0) continue

		println("Bilangan Ganjil $j")
	}
}