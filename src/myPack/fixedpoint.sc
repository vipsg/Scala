package myPack1

object fixedpoint {
import math.abs

val tollerance = .000001                          //> tollerance  : Double = 1.0E-6

def isCloseEnough(x: Double, y: Double) =
		abs((x - y)/x) < tollerance       //> isCloseEnough: (x: Double, y: Double)Boolean
		 	

def fixedPoint(f: Double => Double) (firstguess : Double) = {
	def iterate(guess: Double): Double = {
		val next = f(guess)																								//1+x/2 first guess is 1 1.5 1-1.5 < .0000001
		if (isCloseEnough(guess,next)) next
		else iterate(next)
	}
	iterate(firstguess)
}                                                 //> fixedPoint: (f: Double => Double)(firstguess: Double)Double
	
fixedPoint(x => 1 + x/2) (1.0)                    //> res0: Double = 1.9999980926513672



//x is a number

//sqrt(x)*sqrt(x) = x

//y*y=x

//y = x/y

//f(x)*f(x) = x where y=f(x) for sqrt(x)

//def sqrt(x: Double)  = fixedPoint(y => x/y )(1.0)

//sqrt(2)

def averageDamp(f: Double => Double) (x: Double) = (x+f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double

def sqrt(x: Double) = fixedPoint(averageDamp(y => x/y))(1.0)
                                                  //> sqrt: (x: Double)Double


sqrt(2)                                           //> res1: Double = 1.414213562373095


}