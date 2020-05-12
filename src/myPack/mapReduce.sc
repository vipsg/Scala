package myPack1

object mapReduce {

def  mapReduce(f: Int => Int , combine: (Int, Int) => Int, zero: Int ) (a: Int ,b: Int): Int = {
  if (a > b) zero
  else combine(f(a), mapReduce(f, combine,zero)(a+1,b))
  
  }                                               //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int

def prod(f: Int => Int): (Int, Int) => Int = {mapReduce(f, (x,y) => x * y, 1)}
                                                  //> prod: (f: Int => Int)(Int, Int) => Int
def sum(f: Int => Int): (Int, Int) => Int = {mapReduce(f, (x,y) => x + y, 0)}
                                                  //> sum: (f: Int => Int)(Int, Int) => Int
  
prod(x=>x) (1,4)                                  //> res0: Int = 24
sum(x=>x) (1,4)                                   //> res1: Int = 10
  
//1*4*9
}