package udemy.ekk.belajarkotlin.phase1// fun udemy.ekk.belajarkotlin.phase1.main(){
// 	val nilai = "D"

// 	when(nilai){
// 		"A" -> println("Amazing")
// 		"B" -> println("Good")
// 		"C"	-> println("Not Bad")
// 		"D" -> println("Bad")
// 		else -> {
// 			println("Belajar yang bener")
// 			println("Masa nilanya jelek")
// 		}
// 	}

// 	/// Grouping When

// 	when(nilai){
// 		"A","B","C","D" -> println("Selamat Anda Lulus")
// 		else -> println("Tidak Lulus")
// 	}


// 	/// When In Operation

// 	val currentCodeDosen = 5;
// 	val myListCodeDosen: Array<Int> = arrayOf(1,2,3,4,5)

// 	when(currentCodeDosen){
// 		in myListCodeDosen -> println("Kamu ada dipelajaran dosen")
// 		!in myListCodeDosen -> println("Tidak Ada pelajaran ini")
// 	}


// 	/// When Is Operation

// 	val myName = "zeffry"

// 	when(myName){
// 		is String -> println("Name is String")
// 		!is String -> println("Name Not Valid")
// 	}

// 	/// When Replaced If Else

// 	val nilaiUjian = 90
// 	when {
// 		nilaiUjian > 90 -> println("Amazing")
// 		nilaiUjian > 80	-> println("Good Job")
// 		nilaiUjian > 70 -> println("Not Bad")
// 		else -> println("Sorry")
// 	}
// }