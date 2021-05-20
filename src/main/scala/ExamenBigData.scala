object ExamenBigData {


  def main(args: Array[String]):Unit={
    val L=List("julien","Paul", "jean", "rac","trec", "joel", "ed", "chris", "maurice")
    println(modifier_fin(L))


    println(liste_double())
  }


  def modifier_fin(L:List[String]):List[String]={

    val maliste1=L.filter(e => e.endsWith("n"))

      return maliste1
  }

  def liste_double():Unit={
    val l1=List("ecommercemag.fr","")
    val l2=List("https://www.journalducm.com/contact/","Payant")
    val l3=List("https://www.zatsa.com","")
    val l4=List("https://www.lerevenu.com","")
    val l5=List("https://www.cadre-dirigfdeant-magazine.com","Payant")
     val l6= List("https://www.silicon.fr/services/contact#annoncer","Payant")
    val l7=List("https://www.channelbiz.fr/nous-contacter/","")
    val l8=List("https://www.itespresso.fr/","")
    val l9=List("https://www.industrie-mag.com/article4.html","invité")
      val l10=List("https://www.jesuisundev.com/article-invite/","invité")
        val l11=List("https://www.numerama.com","")

    val maliste2=List(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11)
    val maliste3=maliste2.foreach(e=>{println(e(0)+"  "+e(1))})


    return maliste3
  }

}
