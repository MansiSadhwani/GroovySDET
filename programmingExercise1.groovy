package SDET

class programmingExercise1 {
	static void main(args) {
	def x
	int y
	
	def arr = [1,2.0,"Seema",true,x,y]
	
	arr.each {println "Value $it has datatype:"+it.getClass()}
	}
}
