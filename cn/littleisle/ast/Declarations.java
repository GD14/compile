package cn.littleisle.ast;

import cn.littleisle.entity.*;

import java.util.*;

public class Declarations{

	Set<StructNode> defstructs= new LinkedHashSet<StructNode>();
	Set<DefinedVariable> defvars=new LinkedHashSet<DefinedVariable>();

	public List<DefinedVariable> defvars(){
		return new ArrayList<DefinedVariable>(defvars);	
	}

	public void  add(Declarations decls){
		defvars.addAll(decls.defvars);
		defstructs.addAll(decls.defstructs);	

	}
	public void addDefstruct(StructNode n){
		defstructs.add(n);	
	}

	public void addDefvar(DefinedVariable var){
		defvars.add(var);	
	}
	public void addDefvars(List<DefinedVariable> vars){
		defvars.addAll(vars);
	}
}
