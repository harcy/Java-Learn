package com.learn.jvm;

class ParentClass {
	
	// ��̬����          
    public static String p_StaticField = "����--��̬����";              
    // ����          
    public String p_Field = "����--����";                  
    // ��̬��ʼ����              
    static {          
        System.out.println(p_StaticField);                  
        System.out.println("����--��̬��ʼ����");              
    }                  
    // ��ʼ����              
    {          
        System.out.println(p_Field);          
        System.out.println("����--��ʼ����");              
    }                  
    // ������          
    public ParentClass() {          
        System.out.println("����--������");              
    }
    
    public void printVar(){
    	System.out.println(this.p_Field);
    }

}
