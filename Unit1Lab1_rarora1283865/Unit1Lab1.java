//java doc sometin
public class Unit1Lab1 {

	public static void main(String[] args) { 
		//39 line pattern; 10 lines
		
		//some variables so I don't need to keep typing spaces and asterisks
		
		//spaces
		String space = " ";
		String space_2 = "  ";
		String space_3 = "   ";
		String space_4 = "    ";
		String space_5 = "     ";
		String space_6 = "      ";
		String space_7 = "       ";
		String space_8 = "        ";
		String space_39 = "                                       ";
		
		//asterisks
		String ast = "*";
		String ast_3 = "***";
		String ast_4 = "****";
		String ast_5 = "*****";
	
		String ast_9 = "*********";
		
		//a common combination
		String SevenbetweenAst = ast + space_7 + ast;
		
		//declaring the lines
		String line_1 = ast_9 + space_5 + ast_3 + space_7 + ast + space_8 + ast + space_5;
		String line_2 = SevenbetweenAst + space_3 + ast + space_5 + ast + space_4 + ast_3 + space_6 + ast + space + ast + space_4;
		String line_3 = SevenbetweenAst + space_2 + SevenbetweenAst + space_2 + ast_5 + space_4 + ast + space_3 + ast + space_3;
		String line_4and6 = SevenbetweenAst + space_2 + SevenbetweenAst + space_4 + ast + space_5 + ast + space_5 + ast + space_2;
		String line_5 = SevenbetweenAst + space_2 + SevenbetweenAst + space_4 + ast + space_4 + ast + space_7 + ast + space;
		String line_7 = SevenbetweenAst + space_2 + SevenbetweenAst + space_2 + space_2 + ast + space_2 + space_4 + ast + space_3 + ast + space_3;
		String line_8 = SevenbetweenAst + space_3 + ast + space_5 + ast + space_5 + ast + space_7 + ast + space + ast + space_4;
		String line_9 = SevenbetweenAst + space_5 + ast_3 + space_7 + ast + space_8 + ast + space_5;
		
		//printing the lines
		System.out.println(line_1);
		System.out.println(line_2);
		System.out.println(line_3);
		System.out.println(line_4and6);
		System.out.println(line_5);
		System.out.println(line_4and6);
		System.out.println(line_7);
		System.out.println(line_8);
		System.out.println(line_9);
		System.out.println(space_39);
		

		
		
	}

}
