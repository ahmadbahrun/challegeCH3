class App {
    //BIKIN DEKLARASI
    var pemain1 = ""
    var pemain2 = ""
    var possibleInputChoice = listOf("gunting", "batu", "kertas")

    //HEADER
    fun printHeader(){
        println("""
            ==========================
            GAME SUIT TERMINAL VERSION
            ==========================
            ..........................
            ======Please Choose=======
            
              *Batu *Gunting *Kertas
               
            ..........................   
        """.trimIndent())
    }

    //MEMASUKAN PEMAIN
    fun inputPemain() {


       println("Masukan Pemain 1 : ")
       pemain1 = readLine().orEmpty().lowercase()

       println("Masukan Pemain 2 : ")
       pemain2 = readLine().orEmpty().lowercase()

        //KETIKA 2 KONDISI
     while (!possibleInputChoice.contains(pemain1) || !possibleInputChoice.contains(pemain2)){
         println("=====================================")
         println("Choise only : batu | gunting | kertas ")
         println("=====================================")
         inputPemain()
     }

    }


    //JIKA PILIHAN PEMAIN
    fun choicePlayer(){

        //Jika Pemain 1 Batu
        if (pemain1 == "batu" && pemain2 == "gunting"){
            println("Hasil : Pemain 1 Menang")
        } else if (pemain1 == "batu" && pemain2 == "kertas") {
            println("Hasil : Pemain 2 Menang")
        }else if(pemain1 == "batu" && pemain2 == "batu"){
            println("Hasil : DRAW !")}

        //Jika pemain 1 Gunting
        if (pemain1 == "gunting" && pemain2 == "batu"){
            println("Hasil : Pemain 2 Menang")
        } else if (pemain1 == "gunting" && pemain2 == "kertas") {
            println("Hasil : Pemain 1 Menang")
        }else if(pemain1 == "gunting" && pemain2 == "gunting"){
            println("Hasil : DRAW !")}

        //Jika pemain 1 Kertas
        if (pemain1 == "kertas" && pemain2 == "batu"){
            println("Hasil : Pemain 1 Menang")
        } else if (pemain1 == "kertas" && pemain2 == "gunting") {
            println("Hasil : Pemain 2 Menang")
        }else if(pemain1 == "kertas" && pemain2 == "kertas"){
            println("Hasil : DRAW !")}



    }
    fun printResult(){
        choicePlayer()
    }

    fun run(){
        printHeader()
        inputPemain()
        printResult()

    }


}
