def reverse(s : String,i: Int):String ={
    if(i<0){
        return " ";
    }else{
        return s.charAt(i) + reverse(s,i-1);
    }
}

@main def reversed():Unit ={
    val text:String  = "Hello world";
    println("Reverse string is :"+ reverse(text,text.length()-1));
}
