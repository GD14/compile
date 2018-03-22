package cn.littleisle.ast;
import cn.littleisle.entity.*;
import java.util.List;
import java.util.ArrayList;
import java.io.PrintStream;

public class AST extends Node{
	protected Location source;
	protected Declarations declarations;	

	public AST(Location source,Declarations declarations){
		super();
		this.source=source;
		this.declarations=declarations;
	}

//	public List<DefinedVariable> definedVariables(){
//		return declarations.defvars();	
//	}

	public List<DefinedVariable> definedVariables(){
		return declarations.defvars();	
	}
	protected void _dump(Dumper d){
		//d.printNodeList("variables",definedVariables());	
		d.printNodeList("variables",definedVariables());
		System.out.println("done\n*\n*\n**");
	}

	public Location location(){
		return source;	
	}
}
