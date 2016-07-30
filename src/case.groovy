def x = "foo"
def result = ""  
switch ( x ) {     
    case "foo":
        result = "found foo"         // lets fall through      
    case "bar":         
        result += "bar"      
    default: 
        result = "default" 
}

assert result == "found foo"​
