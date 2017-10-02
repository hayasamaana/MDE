package xtendcodegenerator

import behaviour.Behaviour
import structural.Program

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
			
		}
		'''
		 
		
	}
	
	
	
}