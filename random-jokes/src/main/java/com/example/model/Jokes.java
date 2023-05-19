package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//{"type":"general","setup":"My older brother always tore the last pages of
//my comic books, and never told me why.","punchline":"I had to draw my own conclusions.","id":393}


@AllArgsConstructor
@Data
public class Jokes {

	private int id;
	private String type;
	private String setup;
	private String punchline;
	
}
