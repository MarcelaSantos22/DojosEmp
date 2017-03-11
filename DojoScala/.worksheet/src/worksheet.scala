object worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(46); 
  val lista = List(1,2,3,4);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(29); 
  val set = Set(1,2,3,4,5,1);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(43); 
  val mapa = Map(1 -> "Luis", 2 -> "Juan");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(26); val res$0 = 
  
  lista.map{ x => x+3};System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(18); val res$1 = 
  lista.map{ _+3};System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(21); val res$2 = 
  lista.filter{ _<2};System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(26); val res$3 = 
  lista.filter{ x => x<3};System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(50); 
  
  val names = List("Juan", "Carlos", "Andres");System.out.println("""names  : List[String] = """ + $show(names ));$skip(25); val res$4 = 
  names.map{ _.length()};System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(75); 
  
  //kata 1 --------> Encontrar los pares
  val pares = List.range(1,20);System.out.println("""pares  : List[Int] = """ + $show(pares ));$skip(25); val res$5 = 
  pares.filter{_%2 == 0};System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(195); 
  
  //Kata 2 ---> Encontrar los datos de una persona dado el nombre
  val megaLista = List (List("Andres", "24 years", "male"),List("Juan", "20 years", "male"),List("Ana","22 years", "female"));System.out.println("""megaLista  : List[List[String]] = """ + $show(megaLista ));$skip(37); val res$6 = 
  
  
	megaLista.filter(_(0)=="Ana");System.out.println("""res6: List[List[String]] = """ + $show(res$6));$skip(91); 
	
	
	//Kata 3 ---> Encontrar los numeros primos de una lista
	val list  = List.range(1,20);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(89); val res$7 = 
	list.filter{x => list.filter{y => y <= Math.sqrt(x)}.filter{z => x%z == 0}.length == 1};System.out.println("""res7: List[Int] = """ + $show(res$7))}
	
	
	
}
