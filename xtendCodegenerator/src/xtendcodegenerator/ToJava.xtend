package xtendcodegenerator

import behaviour.Behaviour
import structural.Program
import structural.Variable
import structural.Method

class ToJava  extends ToAnyLanguage{
	
	
	override genCode(Behaviour behv, Program prog) {
		endFile=".java" 
		//template
	'''
		«FOR aclass : prog.classes»
		«aclass.genCode»
		«ENDFOR»
  	'''
	}
	def String genCode(structural.Class c) {
		'''
		class «c.name»
		{
			/*Generate class variables*/
			«FOR v: c.variables»
			    «v.genCode» 
			«ENDFOR»
			«FOR m: c.methods»
			   «m.genCode»
			«ENDFOR»
			
			
			
		}
		'''
	}	
	def String genCode(structural.Variable v) {
	   '''
	   «v.type.toString» «v.name»
	   '''
		
	}
	def String genCode(structural.Method m) {
		
	}
	
	
	
	
}