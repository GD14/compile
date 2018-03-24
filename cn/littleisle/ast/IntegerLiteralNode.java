package cn.littleisle.ast;

import cn.littleisle.type.*;

public class IntegerLiteralNode extends LiteralNode{
	protected long value;

	public IntegerLiteralNode(Location loc,TypeRef ref,long value){
		super(loc,ref);	
		this.value=value;
	}

	public long value(){
		return value;	
	}

	protected void _dump(Dumper d){
		d.printMember("typeNode",typeNode);	
		d.printMember("value",value);
	}

}
