package com.learn.jvm;

public class ChildClass extends ParentClass {
	
	// ��̬����          
    public static String s_StaticField = "����--��̬����";              
    // ����          
    public String s_Field = "����--����";              
    // ��̬��ʼ����              
    static {          
        System.out.println(s_StaticField);                  
        System.out.println("����--��̬��ʼ����");          
    }          
    // ��ʼ����  
    {          
        System.out.println(s_Field);          
        System.out.println("����--��ʼ����");              
    }
    
    // ������          
    public ChildClass() {          
        System.out.println("����--������");              
    }
    
    public void printVar(){
    	System.out.println(super.p_Field);
    	System.out.println(this.p_Field);
    	System.out.println(this.s_Field);
    }
    
    public static void main(String[] args) {
		new ParentClass().printVar();
		//new ChildClass();
	}

}
