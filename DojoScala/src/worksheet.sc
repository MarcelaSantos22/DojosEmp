object worksheet {
  val lista = List(1,2,3,4)                       //> lista  : List[Int] = List(1, 2, 3, 4)
  val set = Set(1,2,3,4,5,1)                      //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  val mapa = Map(1 -> "Luis", 2 -> "Juan")        //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Luis, 2 -> Jua
                                                  //| n)
  
  lista.map{ x => x+3}                            //> res0: List[Int] = List(4, 5, 6, 7)
  lista.map{ _+3}                                 //> res1: List[Int] = List(4, 5, 6, 7)
  lista.filter{ _<2}                              //> res2: List[Int] = List(1)
  lista.filter{ x => x<3}                         //> res3: List[Int] = List(1, 2)
  
  val names = List("Juan", "Carlos", "Andres")    //> names  : List[String] = List(Juan, Carlos, Andres)
  names.map{ _.length()}                          //> res4: List[Int] = List(4, 6, 6)
  
  //kata 1 --------> Encontrar los pares
  val pares = List.range(1,20)                    //> pares  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                                                  //|  16, 17, 18, 19)
  pares.filter{_%2 == 0}                          //> res5: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)
  
  //Kata 2 ---> Encontrar los datos de una persona dado el nombre
  val megaLista = List (List("Andres", "24 years", "male"),List("Juan", "20 years", "male"),List("Ana","22 years", "female"))
                                                  //> megaLista  : List[List[String]] = List(List(Andres, 24 years, male), List(Ju
                                                  //| an, 20 years, male), List(Ana, 22 years, female))
  
  
	megaLista.filter(_(0)=="Ana")             //> res6: List[List[String]] = List(List(Ana, 22 years, female))
	
	
	//Kata 3 ---> Encontrar los numeros primos de una lista
	val list  = List.range(1,20)              //> list  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 
                                                  //| 16, 17, 18, 19)
	list.filter{x => list.filter{y => y <= Math.sqrt(x)}.filter{z => x%z == 0}.length == 1}
                                                  //> res7: List[Int] = List(1, 2, 3, 5, 7, 11, 13, 17, 19)
	
	
	
}