package com.mbesutti.seminarweb.html;

import java.util.ArrayList;

public class HtmlForm implements HtmlElement {
	public static final String TEXT = "text";
	public static final String SUBMIT = "submit";
	
	ArrayList<String> inputs = new ArrayList<String>();
	private String _destination;
	
	public HtmlForm(String destination) {
		_destination = destination;
		
	}
	
	public void addInput(String label, String type, String placeholder) {
		inputs.add("<div class='form-group'>" +
						"<label for='"+label+"' class='col-sm-2 control-label'>"+label+"</label>" +
						"<div class='col-sm-10'>" +
							"<input type='" + type + "' class='form-control' id='"+label+"' name='"+label.toLowerCase()+"' placeholder='"+placeholder+"' value='"+placeholder+"'>" +
						"</div>" +
					"</div>");
	}
	
	public void addSubmit(String text){
		inputs.add("<div class='form-group'>"+
		        "       <div class='col-sm-10 col-sm-offset-2'>"+
		        "       <input id='submit' name='submit' type='submit' value='" + text + "' class='btn btn-primary'>"+
		        "    </div>"+
		        "</div>");
	}
	
	public String build(){
		String result = "<form class='form-horizontal' role='form' method='post' action='" + _destination + "'>";
		for (String input : inputs) {
			result += input;
		}
		result += "</form>";
		return result;
	}

}