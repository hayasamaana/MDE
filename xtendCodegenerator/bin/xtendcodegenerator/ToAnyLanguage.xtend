package xtendcodegenerator
import behaviour.Behaviour;
import structural.Program;

abstract class ToAnyLanguage {
	protected Behaviour behav;
	protected Program prog;
	protected String endFile;
	
	def String runCodeGenerator(Behaviour behv,Program prog) {
		this.behav=behv;
		this.prog=prog;
		genCode(behav,prog);
		
	}
	def abstract String genCode(Behaviour behv,Program prog) ;
	
	def String getEndFile(){
		this.endFile;
		
	}
	
	
}