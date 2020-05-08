package myPack

object fact {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 

def gcd(a: Int, b: Int): Int =
if (b == 0) a else gcd(b,a%b);System.out.println("""gcd: (a: Int, b: Int)Int""");$skip(12); val res$0 = 

gcd(24,48);System.out.println("""res0: Int = """ + $show(res$0))}


  
}
