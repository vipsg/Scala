package myPack

object fact {

def gcd(a: Int, b: Int): Int =
if (b == 0) a else gcd(b,a%b)                     //> gcd: (a: Int, b: Int)Int

gcd(24,48)                                        //> res0: Int = 24


  
}