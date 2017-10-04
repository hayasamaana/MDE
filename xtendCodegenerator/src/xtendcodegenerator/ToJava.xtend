package xtendcodegenerator

import behaviour.Behaviour
import structural.Program
import structural.Variable
import structural.Method
import org.eclipse.emf.common.util.EList
import behaviour.Function
import behaviour.LoopStatement
import behaviour.FunctionCall
import behaviour.CallFunctionStatement
import behaviour.ReturnStatement
import behaviour.CondionalStatement
import behaviour.AssignmentStatement
import behaviour.TryCatchStatement
import behaviour.ExceptionStatement
import behaviour.DeclarationStatement
import behaviour.Expression
import behaviour.Literal
import behaviour.ReadLine
import behaviour.BinaryExpression
import behaviour.WriteLineStatement
import behaviour.ReadLineStatement
import java.io.BufferedReader
import java.io.InputStreamReader

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
	   «v.type.toString» «v.name»;
	   '''
		
	}
	def String genCode(structural.Method m) {
		var s=
		'''
		«IF m!= prog.mainMethod»
		«m.accessModifiers.toString» «m.returnType.toString» «m.name»(«m.varibales.getArrayListString»){
		«ELSE»
		public static void main(string []args){
		«ENDIF»
		'''
		var func=m.methodBehaviour     // extention method
		s+=
		'''
		«IF func != null»
		«func.genCode»
		«ELSE»	
       // Could not find behaviour for method «m.belongToClass.name».«m.name» 
		«ENDIF»
		} '''
       s
		
	}
	
	def behaviour.Function  getMethodBehaviour(Method method){
		
		for(var i=0;i<behav.functions.size;i++){
		    var currfunc=behav.functions.get(i);
		    var fullMethodName='''«method.belongToClass.name».«method.name»'''
		    if(currfunc.name==fullMethodName){return currfunc}
		  	
		}
		
		null
		
	}
	def String genCode(behaviour.Function func) {
		
		'''
		«FOR stmt: func.functionBody»
		«stmt.genCode»
		«ENDFOR»
		'''
		
	}
	def String genCode(behaviour.Statement stmt){
		
		if(stmt instanceof behaviour.LoopStatement){
			 var st=stmt as LoopStatement;
			'''«st.genCode»
			'''
		}
		else if(stmt instanceof CallFunctionStatement){
			 var st=stmt as CallFunctionStatement;
			'''«st.genCode»
			'''
		} 
		else if(stmt instanceof ReturnStatement){
			 var st=stmt as ReturnStatement;
			'''«st.genCode»
			'''
		} 
		else if(stmt instanceof CondionalStatement){
			 var st=stmt as CondionalStatement;
			'''«st.genCode»
			'''
		} 
		else if(stmt instanceof AssignmentStatement){
			 var st=stmt as AssignmentStatement;
			'''«st.genCode»
			'''
		} 
		else if(stmt instanceof TryCatchStatement){
			 var st=stmt as TryCatchStatement;
			'''«st.genCode»
			'''
		} 
		else if(stmt instanceof ExceptionStatement){
			 var st=stmt as ExceptionStatement;
			'''«st.genCode»
			'''
		}
		else if(stmt instanceof DeclarationStatement){
			 var st=stmt as DeclarationStatement;
			'''«st.genCode»
			'''
		} 
		 	
	}
	
	def String genCode(ReturnStatement ret) {
		
		var expr= ret.returnExpression;
		''' return «expr.genCode»'''
		
		
	}
	def String genCode(LoopStatement loop) {
		'''while(«loop.loopExpression.genCode»){
			«FOR stmt:loop.loopBodyStatements»
			«stmt.genCode»	
			«ENDFOR»
		}'''
		
	}
	
	def String genCode(CallFunctionStatement calfunc) {
		var s=""
		if(calfunc instanceof WriteLineStatement){
		s+=	
		'''java.lang.System.out.println(«calfunc.arguments.argList»)'''
			
		}
		else if(calfunc instanceof ReadLineStatement){
			new BufferedReader(new InputStreamReader(java.lang.System.in)).readLine();	
		}
		else{
			s+=
			'''«calfunc.nameFunc»(«calfunc.arguments.argList»)'''
			
		}
		s
	}
	
	def void getArgList(EList<Expression> expList){
	
		var s=""
		for (var i=0; i<expList.size-1;i++) {
			s+='''«expList.get(i).genCode»'''	
		}
		if(expList.size>0){ 
		 s+='''«expList.get(expList.size-1).genCode»'''  
		}	
	//s=s
	}
	
	
	def String genCode(Expression exp) {
		if(exp instanceof Literal){
			'''«(exp as Literal).genCode»'''
		}
		else if(exp instanceof behaviour.Variable){
			'''«(exp as Variable).genCode»'''
		}
		else if(exp instanceof ReadLine){
			'''«(exp as ReadLine ).genCode»'''
		}
		else if(exp instanceof FunctionCall ){
			'''«(exp as  FunctionCall).genCode»'''
		}
		else if(exp instanceof BinaryExpression ){
			'''«(exp as BinaryExpression ).genCode»'''
		}
	}
	
    def String genCode(Literal lit) {
    	 '''«lit.vlaue»''';
	
     }
	
	def String getArrayListString(EList<Variable> vars){
	var s=""
	
	for(var i = 0 ; i<vars.size-1; i++){
		var v=vars.get(i);
		s+= 
		'''«v.type.toString» «v.name»,'''
		
	}
	
	var x=vars.get(vars.size-1)
	s+=
	'''«x.type.toString» «x.name»'''
	s
	}
	
	
	
}