package Rationals

object Rationals {

val x = new Rational(1,2)                         //> x  : Rationals.Rational = 1/2
val y = new Rational(2,3)                         //> y  : Rationals.Rational = 2/3
val z = new Rational(2)                           //> z  : Rationals.Rational = 2/1

val a = new Rational(2,0)                         //> a  : Rationals.Rational = 1/0

x.add(x)                                          //> res0: Rationals.Rational = 1/1

y.neg                                             //> res1: Rationals.Rational = -2/3

x.sub(y)                                          //> res2: Rationals.Rational = 1/-6

x.less(y)                                         //> res3: Boolean = true

y.less(x)                                         //> res4: Boolean = false

}
 
class Rational(x: Int, y: Int)
{
	private def gcd(a: Int, b: Int) :Int =	if (b == 0) a else gcd(b, a%b)
	
	val g = gcd(x,y)
	
	def this(x: Int) = this(x,1)
	
	def numer = x / g
	def denom = y / g
	
	def add(that: Rational): Rational =
	 	new Rational (numer*that.denom + denom*that.numer,denom*that.denom)
	 
	def neg = new Rational(-numer,denom)
	
	def sub(that: Rational): Rational = add(that.neg)
	
	def less(that: Rational):Boolean = numer*that.denom < denom*that.numer
		
	 	
	override def toString = numer + "/" + denom

}