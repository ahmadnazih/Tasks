

object Assignment  {


  def fibonacci(number: Int): Int={
  if(number==0) {
    return 0;
  }
    if(number==1){
      return 1;
    }

    else
    return fibonacci(number-1) + fibonacci(number-2);

  }

  def CheckPalindrome(s: String): Boolean ={
  for(i <- 0 until (s.length/2)){
    if(!(s.charAt(i) == s.charAt(s.length-i-1))){
      return false;
    }
  }

    return true;
  }

  def runLengthEncode(s:String): String ={
    var c = s.charAt(0);
    var counter = 0;
    var result = " ";
    for(i<- 0 until (s.length)){
      if(s.charAt(i) == c){
        counter=counter+1;
      }

      else {
        result = result+""+c+counter;
        c = s.charAt(i);
        counter=1;
      }
    }
    return result+c+counter;
  }

  def runLengthDecode(s:String): String ={
    var result = " ";
    var n = "";
    for(i<- 0 until (s.length)){
      if(!(s.charAt(i).isDigit)){
        result= result+s.charAt(i);
      }
      else {
//        n = ""+s.charAt(i);
        var j = i;
        while( (s.charAt(j).isDigit) && (j < s.length-1)){
          n = n +s.charAt(j);
          println(n+"yeeeeee");
          j=j+1;
        }
        var number = n.toInt;
        for( k<- 0 to number){
          result= result+s.charAt(i);
        }

      }
    }

   return  result;
  }


def inc(x:Int): Int ={
  return x+1;
}

  def square(x:Int): Int ={
    return x*x;
  }

  def compose(f:Int => Int,g:Int => Int):(Int => Int) ={
    (x:Int) => f(g(x))
  }


 def main(args: Array[String]){
  println("radar"+" "+ CheckPalindrome("radar"));
   println("anna"+" "+ CheckPalindrome("anna"));
   println("apple"+" "+ CheckPalindrome("apple"));
   println("r"+" "+CheckPalindrome("r"));
   println("ra"+" "+CheckPalindrome("ra"));


   println("fibonacci method");

   println(fibonacci(6));

   println(runLengthEncode("ahmad"));
   println(runLengthEncode("aaaaaaaaaabbbaxxxxyyyzyx"));


   println(runLengthDecode("a10b3a1"));  // Needs some debuging (Not working well)

   val h = compose(square,inc);
   println(h(6));

 }

}

//object Assignment extends App {
//  val ages = Seq(42, 60, 29, 64)
//  println(s"The oldest person is ${ages.max}")
//}