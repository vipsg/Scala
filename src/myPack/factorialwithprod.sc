package myPack

object factorialwithprod {

def sum(f: Int => Int): (Int, Int) => Int = {
	def pF(a: Int, b:Int): Int=
		if (a>b) 0
		else f(a) + pF(a+1,b)
	pF
	}                                         //> sum: (f: Int => Int)(Int, Int) => Int
	
sum(x=> x*x) (2,3)                                //> res0: Int = 13
  
def product(f: Int => Int): (Int, Int) => Int = {
	def pF(a: Int, b:Int): Int=
		if (a>b) 1
		else f(a) * pF(a+1,b)
	pF
	}                                         //> product: (f: Int => Int)(Int, Int) => Int
	
	
product(x=>x*x)(1,4)                              //> res1: Int = 576

def fact(n: Int) = product(x=>x)(1,n)             //> fact: (n: Int)Int

fact(4)                                           //> res2: Int = 24

}