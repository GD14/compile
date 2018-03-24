package cn.littleisle.ast;

import cn.littleisle.entity.DefinedVariable;

import java.util.*;


public class BlockNode extends StmtNode{

	protected List<DefinedVariable> variables;
	protected List<StmtNode> stmts;

	public BlockNode(Location loc,List<DefinedVariable> vars,List<StmtNode>stmts){
	
		super(loc);
		this.variables=vars;
		this.stmts=stmts;
	}

	public List<DefinedVariable> variables(){
		return variables;	
	}
	public List<StmtNode> stmts(){
		return stmts;
	}

	public StmtNode tailStmt(){
		if(stmts.isEmpty()) return null;
		return stmts.get(stmts.size()-1);
	
	}

	public void _dump(Dumper d){
		d.printNodeList("variables",variables);	
		d.printNodeList("stmts",stmts);
	}

}
